/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.ecore.resource.ResourceSet;

/**
 * The EpTaskItemBuilder is used to find task items in text documents. The current
 * implementation uses the generated lexer and the TaskItemDetector to detect task
 * items. This class is called by the BuilderAdapter, which runs both this builder
 * and the default builder that is intended to be customized.
 */
public class EpTaskItemBuilder {
	
	public void build(IFile resource, ResourceSet resourceSet, IProgressMonitor monitor) {
		// We use one tick from the parent monitor because the BuilderAdapter reserves one
		// tick for finding task items.
		SubProgressMonitor subMonitor = new SubProgressMonitor(monitor, 1);
		// We define the overall work to be 3 ticks (removing markers, scanning the
		// resource, creating new markers).
		subMonitor.beginTask("Searching for task items in " + new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpMetaInformation().getSyntaxName() + " files", 3);
		new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpMarkerHelper().removeAllMarkers(resource, IMarker.TASK);
		subMonitor.worked(1);
		if (isInBinFolder(resource)) {
			subMonitor.done();
			return;
		}
		List<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpTaskItem> taskItems = new ArrayList<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpTaskItem>();
		de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpTaskItemDetector taskItemDetector = new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpTaskItemDetector();
		InputStream inputStream = null;
		try {
			inputStream = resource.getContents();
			String charset = resource.getCharset();
			String content = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.util.EpStreamUtil.getContent(inputStream, charset);
			de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTextScanner lexer = new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpMetaInformation().createLexer();
			lexer.setText(content);
			
			de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTextToken nextToken = lexer.getNextToken();
			while (nextToken != null) {
				String text = nextToken.getText();
				taskItems.addAll(taskItemDetector.findTaskItems(text, nextToken.getLine(), nextToken.getOffset()));
				nextToken = lexer.getNextToken();
			}
		} catch (IOException e) {
			de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpPlugin.logError("Exception while searching for task items", e);
		} catch (CoreException e) {
			de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpPlugin.logError("Exception while searching for task items", e);
		}
		
		try {
			if (inputStream != null) {
				inputStream.close();
			}
		} catch (IOException e) {
			// Ignore this
		}
		subMonitor.worked(1);
		
		for (de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpTaskItem taskItem : taskItems) {
			Map<String, Object> markerAttributes = new LinkedHashMap<String, Object>();
			markerAttributes.put(IMarker.USER_EDITABLE, false);
			markerAttributes.put(IMarker.DONE, false);
			markerAttributes.put(IMarker.LINE_NUMBER, taskItem.getLine());
			markerAttributes.put(IMarker.CHAR_START, taskItem.getCharStart());
			markerAttributes.put(IMarker.CHAR_END, taskItem.getCharEnd());
			markerAttributes.put(IMarker.MESSAGE, taskItem.getMessage());
			new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpMarkerHelper().createMarker(resource, IMarker.TASK, markerAttributes);
		}
		subMonitor.worked(1);
		subMonitor.done();
	}
	
	public String getBuilderMarkerId() {
		return IMarker.TASK;
	}
	
	public boolean isInBinFolder(IFile resource) {
		IContainer parent = resource.getParent();
		while (parent != null) {
			if ("bin".equals(parent.getName())) {
				return true;
			}
			parent = parent.getParent();
		}
		return false;
	}
	
}
