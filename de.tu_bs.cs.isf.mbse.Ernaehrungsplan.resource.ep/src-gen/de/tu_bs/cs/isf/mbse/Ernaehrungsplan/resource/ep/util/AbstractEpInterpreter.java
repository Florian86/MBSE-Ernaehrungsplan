/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.util;

import de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Beilage;
import de.tu_bs.cs.isf.mbse.Ernaehrungsplan.EpElement;
import de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Ernaehrungsplan;
import de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht;
import de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht2Zutat;
import de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Hauptbestandteil;
import de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Person;
import de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Sauce;
import de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Zutat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import org.eclipse.emf.ecore.EObject;

/**
 * This class provides basic infrastructure to interpret models. To implement
 * concrete interpreters, subclass this abstract interpreter and override the
 * interprete_* methods. The interpretation can be customized by binding the two
 * type parameters (ResultType, ContextType). The former is returned by all
 * interprete_* methods, while the latter is passed from method to method while
 * traversing the model. The concrete traversal strategy can also be exchanged.
 * One can use a static traversal strategy by pushing all objects to interpret on
 * the interpretation stack (using addObjectToInterprete()) before calling
 * interprete(). Alternatively, the traversal strategy can be dynamic by pushing
 * objects on the interpretation stack during interpretation.
 */
public class AbstractEpInterpreter<ResultType, ContextType> {
	
	private Stack<EObject> interpretationStack = new Stack<EObject>();
	private List<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpInterpreterListener> listeners = new ArrayList<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpInterpreterListener>();
	private EObject nextObjectToInterprete;
	private ContextType currentContext;
	
	public ResultType interprete(ContextType context) {
		ResultType result = null;
		EObject next = null;
		currentContext = context;
		while (!interpretationStack.empty()) {
			try {
				next = interpretationStack.pop();
			} catch (EmptyStackException ese) {
				// this can happen when the interpreter was terminated between the call to empty()
				// and pop()
				break;
			}
			nextObjectToInterprete = next;
			notifyListeners(next);
			result = interprete(next, context);
			if (!continueInterpretation(context, result)) {
				break;
			}
		}
		currentContext = null;
		return result;
	}
	
	/**
	 * Override this method to stop the overall interpretation depending on the result
	 * of the interpretation of a single model elements.
	 */
	public boolean continueInterpretation(ContextType context, ResultType result) {
		return true;
	}
	
	public ResultType interprete(EObject object, ContextType context) {
		ResultType result = null;
		if (object instanceof de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Ernaehrungsplan) {
			result = interprete_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan((de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Ernaehrungsplan) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Person) {
			result = interprete_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Person((de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Person) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht) {
			result = interprete_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht((de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Hauptbestandteil) {
			result = interprete_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Hauptbestandteil((de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Hauptbestandteil) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Beilage) {
			result = interprete_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Beilage((de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Beilage) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Sauce) {
			result = interprete_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Sauce((de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Sauce) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Zutat) {
			result = interprete_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Zutat((de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Zutat) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht2Zutat) {
			result = interprete_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht2Zutat((de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht2Zutat) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof de.tu_bs.cs.isf.mbse.Ernaehrungsplan.EpElement) {
			result = interprete_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_EpElement((de.tu_bs.cs.isf.mbse.Ernaehrungsplan.EpElement) object, context);
		}
		if (result != null) {
			return result;
		}
		return result;
	}
	
	public ResultType interprete_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan(Ernaehrungsplan ernaehrungsplan, ContextType context) {
		return null;
	}
	
	public ResultType interprete_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Person(Person person, ContextType context) {
		return null;
	}
	
	public ResultType interprete_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht(Gericht gericht, ContextType context) {
		return null;
	}
	
	public ResultType interprete_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Zutat(Zutat zutat, ContextType context) {
		return null;
	}
	
	public ResultType interprete_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Hauptbestandteil(Hauptbestandteil hauptbestandteil, ContextType context) {
		return null;
	}
	
	public ResultType interprete_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Beilage(Beilage beilage, ContextType context) {
		return null;
	}
	
	public ResultType interprete_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Sauce(Sauce sauce, ContextType context) {
		return null;
	}
	
	public ResultType interprete_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht2Zutat(Gericht2Zutat gericht2Zutat, ContextType context) {
		return null;
	}
	
	public ResultType interprete_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_EpElement(EpElement epElement, ContextType context) {
		return null;
	}
	
	private void notifyListeners(EObject element) {
		for (de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpInterpreterListener listener : listeners) {
			listener.handleInterpreteObject(element);
		}
	}
	
	/**
	 * Adds the given object to the interpretation stack. Attention: Objects that are
	 * added first, are interpret last.
	 */
	public void addObjectToInterprete(EObject object) {
		interpretationStack.push(object);
	}
	
	/**
	 * Adds the given collection of objects to the interpretation stack. Attention:
	 * Collections that are added first, are interpret last.
	 */
	public void addObjectsToInterprete(Collection<? extends EObject> objects) {
		for (EObject object : objects) {
			addObjectToInterprete(object);
		}
	}
	
	/**
	 * Adds the given collection of objects in reverse order to the interpretation
	 * stack.
	 */
	public void addObjectsToInterpreteInReverseOrder(Collection<? extends EObject> objects) {
		List<EObject> reverse = new ArrayList<EObject>(objects.size());
		reverse.addAll(objects);
		Collections.reverse(reverse);
		addObjectsToInterprete(reverse);
	}
	
	/**
	 * Adds the given object and all its children to the interpretation stack such
	 * that they are interpret in top down order.
	 */
	public void addObjectTreeToInterpreteTopDown(EObject root) {
		List<EObject> objects = new ArrayList<EObject>();
		objects.add(root);
		Iterator<EObject> it = root.eAllContents();
		while (it.hasNext()) {
			EObject eObject = (EObject) it.next();
			objects.add(eObject);
		}
		addObjectsToInterpreteInReverseOrder(objects);
	}
	
	public void addListener(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpInterpreterListener newListener) {
		listeners.add(newListener);
	}
	
	public boolean removeListener(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpInterpreterListener listener) {
		return listeners.remove(listener);
	}
	
	public EObject getNextObjectToInterprete() {
		return nextObjectToInterprete;
	}
	
	public Stack<EObject> getInterpretationStack() {
		return interpretationStack;
	}
	
	public void terminate() {
		interpretationStack.clear();
	}
	
	public ContextType getCurrentContext() {
		return currentContext;
	}
	
}
