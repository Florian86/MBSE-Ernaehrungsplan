/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep.util;

import ep.Beilage;
import ep.EpElement;
import ep.Ernaehrungsplan;
import ep.Gericht;
import ep.Gericht2Zutat;
import ep.Hauptbestandteil;
import ep.Person;
import ep.Sauce;
import ep.Zutat;
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
	private List<ep.resource.ep.IEpInterpreterListener> listeners = new ArrayList<ep.resource.ep.IEpInterpreterListener>();
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
	
	public ResultType interprete_ep_Ernaehrungsplan(Ernaehrungsplan ernaehrungsplan, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ep_Person(Person person, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ep_Gericht(Gericht gericht, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ep_Zutat(Zutat zutat, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ep_Hauptbestandteil(Hauptbestandteil hauptbestandteil, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ep_Beilage(Beilage beilage, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ep_Sauce(Sauce sauce, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ep_Gericht2Zutat(Gericht2Zutat gericht2Zutat, ContextType context) {
		return null;
	}
	
	public ResultType interprete_ep_EpElement(EpElement epElement, ContextType context) {
		return null;
	}
	
	private void notifyListeners(EObject element) {
		for (ep.resource.ep.IEpInterpreterListener listener : listeners) {
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
	
	public void addListener(ep.resource.ep.IEpInterpreterListener newListener) {
		listeners.add(newListener);
	}
	
	public boolean removeListener(ep.resource.ep.IEpInterpreterListener listener) {
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
