/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui;

import java.io.ByteArrayInputStream;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.jface.text.IDocument;

/**
 * A background parsing strategy that starts parsing after a amount of time after
 * the last key stroke. If keys are pressed within the delay interval, the delay
 * is reset. If keys are pressed during background parsing the parse thread is
 * stopped and a new parse task is scheduled.
 */
public class EpBackgroundParsingStrategy {
	
	private static long DELAY = 500;
	
	/**
	 * this timer is used to schedule a parsing task and execute it after a given delay
	 */
	private Object lock = new Object();
	
	/**
	 * the background parsing task (may be null)
	 */
	private ParsingJob job = null;
	
	/**
	 * Schedules a task for background parsing that will be started after a delay.
	 */
	public void parse(DocumentEvent event, final de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTextResource resource, final de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpEditor editor) {
		parse(event.getDocument(), resource, editor, DELAY);
	}
	
	/**
	 * Schedules a task for background parsing that will be started after a delay.
	 */
	public void parse(IDocument document, final de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTextResource resource, final de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpEditor editor, long delay) {
		parse(document.get(), resource, editor, delay);
	}
	
	/**
	 * Schedules a task for background parsing that will be started after a delay.
	 */
	public void parse(final String contents, final de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTextResource resource, final de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpEditor editor, long delay) {
		if (resource == null) {
			return;
		}
		if (contents == null) {
			return;
		}
		
		// this synchronization is needed to avoid the creation of multiple tasks. without
		// the synchronization this could easily happen, when this method is accessed by
		// multiple threads. the creation of multiple tasks would imply that multiple
		// background parsing threads for one editor are created, which is not desired.
		synchronized (lock) {
			if (job == null || job.getState() != Job.RUNNING) {
				// schedule new task
				job = new ParsingJob();
				job.resource = resource;
				job.editor = editor;
				job.newContents = contents;
				job.schedule();
			} else {
				job.newContents = contents;
			}
		}
	}
	
	private class ParsingJob extends Job {
		private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.ui.EpEditor editor;
		private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTextResource resource;
		
		public ParsingJob() {
			super("parsing document");
		}
		
		private String newContents = null;
		
		protected IStatus run(IProgressMonitor monitor) {
			while (newContents != null ) {
				while (newContents != null) {
					try {
						String currentContent = newContents;
						newContents = null;
						String encoding = null;
						if (resource instanceof de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpResource) {
							de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpResource concreteResource = (de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpResource) resource;
							encoding = concreteResource.getEncoding(null);
						}
						byte[] bytes = null;
						if (encoding != null) {
							bytes = currentContent.getBytes(encoding);
						} else {
							bytes = currentContent.getBytes();
						}
						resource.reload(new ByteArrayInputStream(bytes), null);
						if (newContents != null) {
							Thread.sleep(DELAY);
						}
					} catch (java.lang.Exception e) {
						e.printStackTrace();
					}
				}
				editor.notifyBackgroundParsingFinished();
			}
			return Status.OK_STATUS;
		}
	};
	
}
