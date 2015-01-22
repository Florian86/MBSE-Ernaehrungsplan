/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.util;

import de.tu_bs.cs.isf.mbse.Ernaehrungsplan.DataType;
import de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Entity;
import de.tu_bs.cs.isf.mbse.Ernaehrungsplan.EntityModel;
import de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Feature;
import de.tu_bs.cs.isf.mbse.Ernaehrungsplan.NamedElement;
import de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Type;
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
public class AbstractErnaehrungsplanInterpreter<ResultType, ContextType> {
	
	private Stack<EObject> interpretationStack = new Stack<EObject>();
	private List<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.IErnaehrungsplanInterpreterListener> listeners = new ArrayList<de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.IErnaehrungsplanInterpreterListener>();
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
		if (object instanceof de.tu_bs.cs.isf.mbse.Ernaehrungsplan.DataType) {
			result = interprete_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_DataType((de.tu_bs.cs.isf.mbse.Ernaehrungsplan.DataType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Entity) {
			result = interprete_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Entity((de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Entity) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Type) {
			result = interprete_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Type((de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Type) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof de.tu_bs.cs.isf.mbse.Ernaehrungsplan.NamedElement) {
			result = interprete_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_NamedElement((de.tu_bs.cs.isf.mbse.Ernaehrungsplan.NamedElement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof de.tu_bs.cs.isf.mbse.Ernaehrungsplan.EntityModel) {
			result = interprete_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_EntityModel((de.tu_bs.cs.isf.mbse.Ernaehrungsplan.EntityModel) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Feature) {
			result = interprete_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Feature((de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Feature) object, context);
		}
		if (result != null) {
			return result;
		}
		return result;
	}
	
	public ResultType interprete_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_NamedElement(NamedElement namedElement, ContextType context) {
		return null;
	}
	
	public ResultType interprete_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Type(Type type, ContextType context) {
		return null;
	}
	
	public ResultType interprete_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_DataType(DataType dataType, ContextType context) {
		return null;
	}
	
	public ResultType interprete_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Entity(Entity entity, ContextType context) {
		return null;
	}
	
	public ResultType interprete_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_EntityModel(EntityModel entityModel, ContextType context) {
		return null;
	}
	
	public ResultType interprete_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Feature(Feature feature, ContextType context) {
		return null;
	}
	
	private void notifyListeners(EObject element) {
		for (de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.IErnaehrungsplanInterpreterListener listener : listeners) {
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
	
	public void addListener(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.IErnaehrungsplanInterpreterListener newListener) {
		listeners.add(newListener);
	}
	
	public boolean removeListener(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.IErnaehrungsplanInterpreterListener listener) {
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
