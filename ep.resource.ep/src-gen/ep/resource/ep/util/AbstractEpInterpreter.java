/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep.util;

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
	
	private java.util.Stack<org.eclipse.emf.ecore.EObject> interpretationStack = new java.util.Stack<org.eclipse.emf.ecore.EObject>();
	private java.util.List<ep.resource.ep.IEpInterpreterListener> listeners = new java.util.ArrayList<ep.resource.ep.IEpInterpreterListener>();
	private org.eclipse.emf.ecore.EObject nextObjectToInterprete;
	private Object currentContext;
	
	public ResultType interprete(ContextType context) {
		ResultType result = null;
		org.eclipse.emf.ecore.EObject next = null;
		currentContext = context;
		while (!interpretationStack.empty()) {
			try {
				next = interpretationStack.pop();
			} catch (java.util.EmptyStackException ese) {
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
	
	public ResultType interprete(org.eclipse.emf.ecore.EObject object, ContextType context) {
		ResultType result = null;
		if (object instanceof ep.Ernaehrungsplan) {
			result = interprete_ep_Ernaehrungsplan((ep.Ernaehrungsplan) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ep.Person) {
			result = interprete_ep_Person((ep.Person) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ep.Gericht) {
			result = interprete_ep_Gericht((ep.Gericht) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ep.Hauptbestandteil) {
			result = interprete_ep_Hauptbestandteil((ep.Hauptbestandteil) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ep.Beilage) {
			result = interprete_ep_Beilage((ep.Beilage) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ep.Sauce) {
			result = interprete_ep_Sauce((ep.Sauce) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ep.Zutat) {
			result = interprete_ep_Zutat((ep.Zutat) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ep.Gericht2Zutat) {
			result = interprete_ep_Gericht2Zutat((ep.Gericht2Zutat) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof ep.EpElement) {
			result = interprete_ep_EpElement((ep.EpElement) object, context);
		}
		if (result != null) {
			return result;
		}
		return result;
	}
	
	public ResultType interprete_ep_Ernaehrungsplan(ep.Ernaehrungsplan ernaehrungsplan, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ep_Person(ep.Person person, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ep_Gericht(ep.Gericht gericht, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ep_Zutat(ep.Zutat zutat, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ep_Hauptbestandteil(ep.Hauptbestandteil hauptbestandteil, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ep_Beilage(ep.Beilage beilage, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ep_Sauce(ep.Sauce sauce, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ep_Gericht2Zutat(ep.Gericht2Zutat gericht2Zutat, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ep_EpElement(ep.EpElement epElement, ContextType context) {
		return null;
	}
	
	private void notifyListeners(org.eclipse.emf.ecore.EObject element) {
		for (ep.resource.ep.IEpInterpreterListener listener : listeners) {
			listener.handleInterpreteObject(element);
		}
	}
	
	/**
	 * Adds the given object to the interpretation stack. Attention: Objects that are
	 * added first, are interpret last.
	 */
	public void addObjectToInterprete(org.eclipse.emf.ecore.EObject object) {
		interpretationStack.push(object);
	}
	
	/**
	 * Adds the given collection of objects to the interpretation stack. Attention:
	 * Collections that are added first, are interpret last.
	 */
	public void addObjectsToInterprete(java.util.Collection<? extends org.eclipse.emf.ecore.EObject> objects) {
		for (org.eclipse.emf.ecore.EObject object : objects) {
			addObjectToInterprete(object);
		}
	}
	
	/**
	 * Adds the given collection of objects in reverse order to the interpretation
	 * stack.
	 */
	public void addObjectsToInterpreteInReverseOrder(java.util.Collection<? extends org.eclipse.emf.ecore.EObject> objects) {
		java.util.List<org.eclipse.emf.ecore.EObject> reverse = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>(objects.size());
		reverse.addAll(objects);
		java.util.Collections.reverse(reverse);
		addObjectsToInterprete(reverse);
	}
	
	/**
	 * Adds the given object and all its children to the interpretation stack such
	 * that they are interpret in top down order.
	 */
	public void addObjectTreeToInterpreteTopDown(org.eclipse.emf.ecore.EObject root) {
		java.util.List<org.eclipse.emf.ecore.EObject> objects = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>();
		objects.add(root);
		java.util.Iterator<org.eclipse.emf.ecore.EObject> it = root.eAllContents();
		while (it.hasNext()) {
			org.eclipse.emf.ecore.EObject eObject = (org.eclipse.emf.ecore.EObject) it.next();
			objects.add(eObject);
		}
		addObjectsToInterpreteInReverseOrder(objects);
	}
	
	public void addListener(ep.resource.ep.IEpInterpreterListener newListener) {
		listeners.add(newListener);
	}
	
	public boolean removeListener(ep.resource.ep.IEpInterpreterListener listener) {
		return listeners.remove(listener);
	}
	
	public org.eclipse.emf.ecore.EObject getNextObjectToInterprete() {
		return nextObjectToInterprete;
	}
	
	public java.util.Stack<org.eclipse.emf.ecore.EObject> getInterpretationStack() {
		return interpretationStack;
	}
	
	public void terminate() {
		interpretationStack.clear();
	}
	
	public Object getCurrentContext() {
		return currentContext;
	}
	
}
