/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep.mopp;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

public class EpPrinter implements ep.resource.ep.IEpTextPrinter {
	
	protected ep.resource.ep.IEpTokenResolverFactory tokenResolverFactory = new ep.resource.ep.mopp.EpTokenResolverFactory();
	
	protected OutputStream outputStream;
	
	/**
	 * Holds the resource that is associated with this printer. This may be null if
	 * the printer is used stand alone.
	 */
	private ep.resource.ep.IEpTextResource resource;
	
	private Map<?, ?> options;
	private String encoding = System.getProperty("file.encoding");
	
	public EpPrinter(OutputStream outputStream, ep.resource.ep.IEpTextResource resource) {
		super();
		this.outputStream = outputStream;
		this.resource = resource;
	}
	
	protected int matchCount(Map<String, Integer> featureCounter, Collection<String> needed) {
		int pos = 0;
		int neg = 0;
		
		for (String featureName : featureCounter.keySet()) {
			if (needed.contains(featureName)) {
				int value = featureCounter.get(featureName);
				if (value == 0) {
					neg += 1;
				} else {
					pos += 1;
				}
			}
		}
		return neg > 0 ? -neg : pos;
	}
	
	protected void doPrint(EObject element, PrintWriter out, String globaltab) {
		if (element == null) {
			throw new IllegalArgumentException("Nothing to write.");
		}
		if (out == null) {
			throw new IllegalArgumentException("Nothing to write on.");
		}
		
		if (element instanceof ep.EpElement) {
			print_ep_EpElement((ep.EpElement) element, globaltab, out);
			return;
		}
		if (element instanceof ep.Person) {
			print_ep_Person((ep.Person) element, globaltab, out);
			return;
		}
		if (element instanceof ep.Hauptbestandteil) {
			print_ep_Hauptbestandteil((ep.Hauptbestandteil) element, globaltab, out);
			return;
		}
		if (element instanceof ep.Beilage) {
			print_ep_Beilage((ep.Beilage) element, globaltab, out);
			return;
		}
		if (element instanceof ep.Sauce) {
			print_ep_Sauce((ep.Sauce) element, globaltab, out);
			return;
		}
		if (element instanceof ep.Gericht) {
			print_ep_Gericht((ep.Gericht) element, globaltab, out);
			return;
		}
		if (element instanceof ep.Ernaehrungsplan) {
			print_ep_Ernaehrungsplan((ep.Ernaehrungsplan) element, globaltab, out);
			return;
		}
		if (element instanceof ep.Gericht2Zutat) {
			print_ep_Gericht2Zutat((ep.Gericht2Zutat) element, globaltab, out);
			return;
		}
		
		addWarningToResource("The printer can not handle " + element.eClass().getName() + " elements", element);
	}
	
	protected ep.resource.ep.mopp.EpReferenceResolverSwitch getReferenceResolverSwitch() {
		return (ep.resource.ep.mopp.EpReferenceResolverSwitch) new ep.resource.ep.mopp.EpMetaInformation().getReferenceResolverSwitch();
	}
	
	protected void addWarningToResource(final String errorMessage, EObject cause) {
		ep.resource.ep.IEpTextResource resource = getResource();
		if (resource == null) {
			// the resource can be null if the printer is used stand alone
			return;
		}
		resource.addProblem(new ep.resource.ep.mopp.EpProblem(errorMessage, ep.resource.ep.EpEProblemType.PRINT_PROBLEM, ep.resource.ep.EpEProblemSeverity.WARNING), cause);
	}
	
	public void setOptions(Map<?,?> options) {
		this.options = options;
	}
	
	public Map<?,?> getOptions() {
		return options;
	}
	
	public void setEncoding(String encoding) {
		if (encoding != null) {
			this.encoding = encoding;
		}
	}
	
	public String getEncoding() {
		return encoding;
	}
	
	public ep.resource.ep.IEpTextResource getResource() {
		return resource;
	}
	
	/**
	 * Calls {@link #doPrint(EObject, PrintWriter, String)} and writes the result to
	 * the underlying output stream.
	 */
	public void print(EObject element) throws java.io.IOException {
		PrintWriter out = new PrintWriter(new OutputStreamWriter(new BufferedOutputStream(outputStream), encoding));
		doPrint(element, out, "");
		out.flush();
	}
	
	public void print_ep_EpElement(ep.EpElement element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.EP_ELEMENT__EPLAN_ELEMENT));
		printCountingMap.put("eplanElement", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.EP_ELEMENT__PERSON_ELEMENT));
		printCountingMap.put("personElement", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.EP_ELEMENT__ZUTAT_ELEMENT));
		printCountingMap.put("zutatElement", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.EP_ELEMENT__GERICHT_ELEMENT));
		printCountingMap.put("gerichtElement", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("Ernaehrungsplan");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("personElement");
		if (count > 0) {
			List<?> list = (List<?>)element.eGet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.EP_ELEMENT__PERSON_ELEMENT));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("personElement", 0);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("zutatElement");
		if (count > 0) {
			List<?> list = (List<?>)element.eGet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.EP_ELEMENT__ZUTAT_ELEMENT));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("zutatElement", 0);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("gerichtElement");
		if (count > 0) {
			List<?> list = (List<?>)element.eGet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.EP_ELEMENT__GERICHT_ELEMENT));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("gerichtElement", 0);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("eplanElement");
		if (count > 0) {
			List<?> list = (List<?>)element.eGet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.EP_ELEMENT__EPLAN_ELEMENT));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("eplanElement", 0);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	
	public void print_ep_Person(ep.Person element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.PERSON__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.PERSON__KCAL));
		printCountingMap.put("kcal", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("Person");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.PERSON__NAME));
			if (o != null) {
				ep.resource.ep.IEpTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ep.MetamodelPackage.PERSON__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("kcal");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.PERSON__KCAL));
			if (o != null) {
				ep.resource.ep.IEpTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ep.MetamodelPackage.PERSON__KCAL), element));
				out.print(" ");
			}
			printCountingMap.put("kcal", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_ep_Hauptbestandteil(ep.Hauptbestandteil element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.HAUPTBESTANDTEIL__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.HAUPTBESTANDTEIL__KCAL));
		printCountingMap.put("kcal", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("Hauptbestandteil");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.HAUPTBESTANDTEIL__NAME));
			if (o != null) {
				ep.resource.ep.IEpTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ep.MetamodelPackage.HAUPTBESTANDTEIL__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("kcal");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.HAUPTBESTANDTEIL__KCAL));
			if (o != null) {
				ep.resource.ep.IEpTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ep.MetamodelPackage.HAUPTBESTANDTEIL__KCAL), element));
				out.print(" ");
			}
			printCountingMap.put("kcal", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_ep_Beilage(ep.Beilage element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.BEILAGE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.BEILAGE__KCAL));
		printCountingMap.put("kcal", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("Beilage");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.BEILAGE__NAME));
			if (o != null) {
				ep.resource.ep.IEpTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ep.MetamodelPackage.BEILAGE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("kcal");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.BEILAGE__KCAL));
			if (o != null) {
				ep.resource.ep.IEpTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ep.MetamodelPackage.BEILAGE__KCAL), element));
				out.print(" ");
			}
			printCountingMap.put("kcal", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_ep_Sauce(ep.Sauce element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.SAUCE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.SAUCE__KCAL));
		printCountingMap.put("kcal", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("Sauce");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.SAUCE__NAME));
			if (o != null) {
				ep.resource.ep.IEpTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ep.MetamodelPackage.SAUCE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("kcal");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.SAUCE__KCAL));
			if (o != null) {
				ep.resource.ep.IEpTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ep.MetamodelPackage.SAUCE__KCAL), element));
				out.print(" ");
			}
			printCountingMap.put("kcal", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_ep_Gericht(ep.Gericht element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.GERICHT__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.GERICHT__KOMMENTAR));
		printCountingMap.put("kommentar", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.GERICHT__ZUTATEN));
		printCountingMap.put("zutaten", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.GERICHT__IST_SALAT));
		printCountingMap.put("istSalat", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("Gericht");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("name");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.GERICHT__NAME));
			if (o != null) {
				ep.resource.ep.IEpTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ep.MetamodelPackage.GERICHT__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("kommentar");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("kommentar");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.GERICHT__KOMMENTAR));
			if (o != null) {
				ep.resource.ep.IEpTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ep.MetamodelPackage.GERICHT__KOMMENTAR), element));
				out.print(" ");
			}
			printCountingMap.put("kommentar", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("istSalat");
		out.print(" ");
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("istSalat");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.GERICHT__IST_SALAT));
			if (o != null) {
			}
			printCountingMap.put("istSalat", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("besteht aus");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("zutaten");
		if (count > 0) {
			List<?> list = (List<?>)element.eGet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.GERICHT__ZUTATEN));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("zutaten", 0);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	
	public void print_ep_Ernaehrungsplan(ep.Ernaehrungsplan element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.ERNAEHRUNGSPLAN__PERSONEN));
		printCountingMap.put("personen", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.ERNAEHRUNGSPLAN__GERICHTE));
		printCountingMap.put("gerichte", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("eplan");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("{");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("person");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("personen");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.ERNAEHRUNGSPLAN__PERSONEN));
			if (o != null) {
				ep.resource.ep.IEpTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getErnaehrungsplanPersonenReferenceResolver().deResolve((ep.Person) o, element, (EReference) element.eClass().getEStructuralFeature(ep.MetamodelPackage.ERNAEHRUNGSPLAN__PERSONEN)), element.eClass().getEStructuralFeature(ep.MetamodelPackage.ERNAEHRUNGSPLAN__PERSONEN), element));
				out.print(" ");
			}
			printCountingMap.put("personen", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("gerichte");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("gerichte");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.ERNAEHRUNGSPLAN__GERICHTE));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				ep.resource.ep.IEpTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getErnaehrungsplanGerichteReferenceResolver().deResolve((ep.Gericht) o, element, (EReference) element.eClass().getEStructuralFeature(ep.MetamodelPackage.ERNAEHRUNGSPLAN__GERICHTE)), element.eClass().getEStructuralFeature(ep.MetamodelPackage.ERNAEHRUNGSPLAN__GERICHTE), element));
				out.print(" ");
			}
			printCountingMap.put("gerichte", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_ep_Ernaehrungsplan_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	public void print_ep_Ernaehrungsplan_0(ep.Ernaehrungsplan element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("gerichte");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.ERNAEHRUNGSPLAN__GERICHTE));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				ep.resource.ep.IEpTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getErnaehrungsplanGerichteReferenceResolver().deResolve((ep.Gericht) o, element, (EReference) element.eClass().getEStructuralFeature(ep.MetamodelPackage.ERNAEHRUNGSPLAN__GERICHTE)), element.eClass().getEStructuralFeature(ep.MetamodelPackage.ERNAEHRUNGSPLAN__GERICHTE), element));
				out.print(" ");
			}
			printCountingMap.put("gerichte", count - 1);
		}
	}
	
	
	public void print_ep_Gericht2Zutat(ep.Gericht2Zutat element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.GERICHT2_ZUTAT__MENGE));
		printCountingMap.put("menge", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.GERICHT2_ZUTAT__GERICHT));
		printCountingMap.put("gericht", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.GERICHT2_ZUTAT__ZUTAT));
		printCountingMap.put("zutat", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("zutat");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("menge");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.GERICHT2_ZUTAT__MENGE));
			if (o != null) {
				ep.resource.ep.IEpTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(ep.MetamodelPackage.GERICHT2_ZUTAT__MENGE), element));
				out.print(" ");
			}
			printCountingMap.put("menge", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("zutat");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.GERICHT2_ZUTAT__ZUTAT));
			if (o != null) {
				ep.resource.ep.IEpTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getGericht2ZutatZutatReferenceResolver().deResolve((ep.Zutat) o, element, (EReference) element.eClass().getEStructuralFeature(ep.MetamodelPackage.GERICHT2_ZUTAT__ZUTAT)), element.eClass().getEStructuralFeature(ep.MetamodelPackage.GERICHT2_ZUTAT__ZUTAT), element));
				out.print(" ");
			}
			printCountingMap.put("zutat", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("gericht");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(ep.MetamodelPackage.GERICHT2_ZUTAT__GERICHT));
			if (o != null) {
				ep.resource.ep.IEpTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getGericht2ZutatGerichtReferenceResolver().deResolve((ep.Gericht) o, element, (EReference) element.eClass().getEStructuralFeature(ep.MetamodelPackage.GERICHT2_ZUTAT__GERICHT)), element.eClass().getEStructuralFeature(ep.MetamodelPackage.GERICHT2_ZUTAT__GERICHT), element));
				out.print(" ");
			}
			printCountingMap.put("gericht", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
}
