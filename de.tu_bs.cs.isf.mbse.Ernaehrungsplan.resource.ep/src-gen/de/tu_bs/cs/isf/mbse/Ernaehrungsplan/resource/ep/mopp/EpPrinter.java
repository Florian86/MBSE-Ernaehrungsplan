/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

public class EpPrinter implements de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTextPrinter {
	
	protected de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolverFactory tokenResolverFactory = new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpTokenResolverFactory();
	
	protected OutputStream outputStream;
	
	/**
	 * Holds the resource that is associated with this printer. This may be null if
	 * the printer is used stand alone.
	 */
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTextResource resource;
	
	private Map<?, ?> options;
	private String encoding = System.getProperty("file.encoding");
	
	public EpPrinter(OutputStream outputStream, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTextResource resource) {
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
		
		if (element instanceof de.tu_bs.cs.isf.mbse.Ernaehrungsplan.EpElement) {
			print_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_EpElement((de.tu_bs.cs.isf.mbse.Ernaehrungsplan.EpElement) element, globaltab, out);
			return;
		}
		if (element instanceof de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Person) {
			print_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Person((de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Person) element, globaltab, out);
			return;
		}
		if (element instanceof de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Hauptbestandteil) {
			print_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Hauptbestandteil((de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Hauptbestandteil) element, globaltab, out);
			return;
		}
		if (element instanceof de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Beilage) {
			print_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Beilage((de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Beilage) element, globaltab, out);
			return;
		}
		if (element instanceof de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Sauce) {
			print_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Sauce((de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Sauce) element, globaltab, out);
			return;
		}
		if (element instanceof de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht) {
			print_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht((de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht) element, globaltab, out);
			return;
		}
		if (element instanceof de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Ernaehrungsplan) {
			print_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan((de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Ernaehrungsplan) element, globaltab, out);
			return;
		}
		if (element instanceof de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht2Zutat) {
			print_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht2Zutat((de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht2Zutat) element, globaltab, out);
			return;
		}
		
		addWarningToResource("The printer can not handle " + element.eClass().getName() + " elements", element);
	}
	
	protected de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpReferenceResolverSwitch getReferenceResolverSwitch() {
		return (de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpReferenceResolverSwitch) new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpMetaInformation().getReferenceResolverSwitch();
	}
	
	protected void addWarningToResource(final String errorMessage, EObject cause) {
		de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTextResource resource = getResource();
		if (resource == null) {
			// the resource can be null if the printer is used stand alone
			return;
		}
		resource.addProblem(new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.mopp.EpProblem(errorMessage, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.EpEProblemType.PRINT_PROBLEM, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.EpEProblemSeverity.WARNING), cause);
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
	
	public de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTextResource getResource() {
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
	
	public void print_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_EpElement(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.EpElement element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.EP_ELEMENT__EPLAN_ELEMENT));
		printCountingMap.put("eplanElement", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.EP_ELEMENT__PERSON_ELEMENT));
		printCountingMap.put("personElement", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.EP_ELEMENT__ZUTAT_ELEMENT));
		printCountingMap.put("zutatElement", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.EP_ELEMENT__GERICHT_ELEMENT));
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
			List<?> list = (List<?>)element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.EP_ELEMENT__PERSON_ELEMENT));
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
			List<?> list = (List<?>)element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.EP_ELEMENT__ZUTAT_ELEMENT));
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
			List<?> list = (List<?>)element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.EP_ELEMENT__GERICHT_ELEMENT));
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
			List<?> list = (List<?>)element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.EP_ELEMENT__EPLAN_ELEMENT));
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
	
	
	public void print_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Person(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Person element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.PERSON__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.PERSON__KCAL));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.PERSON__NAME));
			if (o != null) {
				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.PERSON__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("kcal");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.PERSON__KCAL));
			if (o != null) {
				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.PERSON__KCAL), element));
				out.print(" ");
			}
			printCountingMap.put("kcal", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Hauptbestandteil(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Hauptbestandteil element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.HAUPTBESTANDTEIL__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.HAUPTBESTANDTEIL__KCAL));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.HAUPTBESTANDTEIL__NAME));
			if (o != null) {
				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.HAUPTBESTANDTEIL__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("kcal");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.HAUPTBESTANDTEIL__KCAL));
			if (o != null) {
				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.HAUPTBESTANDTEIL__KCAL), element));
				out.print(" ");
			}
			printCountingMap.put("kcal", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Beilage(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Beilage element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.BEILAGE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.BEILAGE__KCAL));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.BEILAGE__NAME));
			if (o != null) {
				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.BEILAGE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("kcal");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.BEILAGE__KCAL));
			if (o != null) {
				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.BEILAGE__KCAL), element));
				out.print(" ");
			}
			printCountingMap.put("kcal", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Sauce(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Sauce element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.SAUCE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.SAUCE__KCAL));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.SAUCE__NAME));
			if (o != null) {
				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.SAUCE__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("kcal");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.SAUCE__KCAL));
			if (o != null) {
				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.SAUCE__KCAL), element));
				out.print(" ");
			}
			printCountingMap.put("kcal", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.GERICHT__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.GERICHT__KOMMENTAR));
		printCountingMap.put("kommentar", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.GERICHT__ZUTATEN));
		printCountingMap.put("zutaten", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.GERICHT__IST_SALAT));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.GERICHT__NAME));
			if (o != null) {
				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.GERICHT__NAME), element));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.GERICHT__KOMMENTAR));
			if (o != null) {
				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.GERICHT__KOMMENTAR), element));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.GERICHT__IST_SALAT));
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
			List<?> list = (List<?>)element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.GERICHT__ZUTATEN));
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
	
	
	public void print_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Ernaehrungsplan(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Ernaehrungsplan element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__PERSONEN));
		printCountingMap.put("personen", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__GERICHTE));
		printCountingMap.put("gerichte", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__PERSONEN));
			if (o != null) {
				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getErnaehrungsplanPersonenReferenceResolver().deResolve((de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Person) o, element, (EReference) element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__PERSONEN)), element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__PERSONEN), element));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__GERICHTE));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getErnaehrungsplanGerichteReferenceResolver().deResolve((de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht) o, element, (EReference) element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__GERICHTE)), element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__GERICHTE), element));
				out.print(" ");
			}
			printCountingMap.put("gerichte", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("gerichte");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__GERICHTE));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getErnaehrungsplanGerichteReferenceResolver().deResolve((de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht) o, element, (EReference) element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__GERICHTE)), element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__GERICHTE), element));
				out.print(" ");
			}
			printCountingMap.put("gerichte", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("gerichte");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__GERICHTE));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getErnaehrungsplanGerichteReferenceResolver().deResolve((de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht) o, element, (EReference) element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__GERICHTE)), element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__GERICHTE), element));
				out.print(" ");
			}
			printCountingMap.put("gerichte", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("gerichte");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__GERICHTE));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getErnaehrungsplanGerichteReferenceResolver().deResolve((de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht) o, element, (EReference) element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__GERICHTE)), element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__GERICHTE), element));
				out.print(" ");
			}
			printCountingMap.put("gerichte", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("gerichte");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__GERICHTE));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getErnaehrungsplanGerichteReferenceResolver().deResolve((de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht) o, element, (EReference) element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__GERICHTE)), element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__GERICHTE), element));
				out.print(" ");
			}
			printCountingMap.put("gerichte", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("gerichte");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__GERICHTE));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getErnaehrungsplanGerichteReferenceResolver().deResolve((de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht) o, element, (EReference) element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__GERICHTE)), element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__GERICHTE), element));
				out.print(" ");
			}
			printCountingMap.put("gerichte", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("gerichte");
		if (count > 0) {
			List<?> list = (List<?>)element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__GERICHTE));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getErnaehrungsplanGerichteReferenceResolver().deResolve((de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht) o, element, (EReference) element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__GERICHTE)), element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.ERNAEHRUNGSPLAN__GERICHTE), element));
				out.print(" ");
			}
			printCountingMap.put("gerichte", 0);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
		out.print(" ");
	}
	
	
	public void print_de_tu_005fbs_cs_isf_mbse_Ernaehrungsplan_Gericht2Zutat(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht2Zutat element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.GERICHT2_ZUTAT__MENGE));
		printCountingMap.put("menge", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.GERICHT2_ZUTAT__GERICHT));
		printCountingMap.put("gericht", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.GERICHT2_ZUTAT__ZUTAT));
		printCountingMap.put("zutat", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("zutat");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("menge");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.GERICHT2_ZUTAT__MENGE));
			if (o != null) {
				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolver resolver = tokenResolverFactory.createTokenResolver("INTEGER");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.GERICHT2_ZUTAT__MENGE), element));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.GERICHT2_ZUTAT__ZUTAT));
			if (o != null) {
				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getGericht2ZutatZutatReferenceResolver().deResolve((de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Zutat) o, element, (EReference) element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.GERICHT2_ZUTAT__ZUTAT)), element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.GERICHT2_ZUTAT__ZUTAT), element));
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
			Object o = element.eGet(element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.GERICHT2_ZUTAT__GERICHT));
			if (o != null) {
				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.IEpTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getGericht2ZutatGerichtReferenceResolver().deResolve((de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht) o, element, (EReference) element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.GERICHT2_ZUTAT__GERICHT)), element.eClass().getEStructuralFeature(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.ErnaehrungsplanPackage.GERICHT2_ZUTAT__GERICHT), element));
				out.print(" ");
			}
			printCountingMap.put("gericht", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
}
