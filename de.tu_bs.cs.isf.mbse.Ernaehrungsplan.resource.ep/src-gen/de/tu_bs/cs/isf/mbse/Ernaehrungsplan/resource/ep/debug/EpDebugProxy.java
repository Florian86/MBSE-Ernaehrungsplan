/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.debug;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import org.eclipse.debug.core.model.IValue;
import org.eclipse.debug.core.model.IVariable;

/**
 * The DebugProxy allows to communicate between the interpreter, which runs in a
 * separate thread or process and the Eclipse Debug framework (i.e., the
 * DebugTarget class).
 */
public class EpDebugProxy {
	
	public static final int STARTUP_DELAY = 1000;
	
	private PrintStream output;
	
	private BufferedReader reader;
	
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.debug.EpDebugTarget debugTarget;
	
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.debug.EpDebugCommunicationHelper communicationHelper = new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.debug.EpDebugCommunicationHelper();
	
	public EpDebugProxy(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.debug.EpDebugTarget debugTarget, int requestPort) throws UnknownHostException, IOException {
		this.debugTarget = debugTarget;
		// give interpreter a chance to start
		try {
			Thread.sleep(STARTUP_DELAY);
		} catch (InterruptedException e) {
		}
		startSocket(requestPort);
	}
	
	private void startSocket(int requestPort) throws UnknownHostException, IOException {
		// creating client proxy socket (trying to connect)...
		Socket client = new Socket("localhost", requestPort);
		// creating client proxy socket - done. (connected)
		try {
			BufferedInputStream input = new BufferedInputStream(client.getInputStream());
			reader = new BufferedReader(new InputStreamReader(input));
		} catch (IOException e) {
			System.out.println(e);
		}
		try {
			output = new PrintStream(client.getOutputStream());
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	
	public void resume() {
		sendCommand(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.debug.EEpDebugMessageTypes.RESUME);
	}
	
	public void stepOver() {
		sendCommand(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.debug.EEpDebugMessageTypes.STEP_OVER);
	}
	
	public void stepInto() {
		sendCommand(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.debug.EEpDebugMessageTypes.STEP_INTO);
	}
	
	public void stepReturn() {
		sendCommand(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.debug.EEpDebugMessageTypes.STEP_RETURN);
	}
	
	public void terminate() {
		sendCommand(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.debug.EEpDebugMessageTypes.EXIT);
	}
	
	public de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.debug.EpDebugMessage getStack() {
		return sendCommandAndRead(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.debug.EEpDebugMessageTypes.GET_STACK);
	}
	
	public void addLineBreakpoint(String location, int line) {
		de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.debug.EpDebugMessage message = new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.debug.EpDebugMessage(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.debug.EEpDebugMessageTypes.ADD_LINE_BREAKPOINT, new String[] {location, Integer.toString(line)});
		communicationHelper.sendEvent(message, output);
	}
	
	public void removeLineBreakpoint(String location, int line) {
		de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.debug.EpDebugMessage message = new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.debug.EpDebugMessage(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.debug.EEpDebugMessageTypes.REMOVE_LINE_BREAKPOINT, new String[] {location, Integer.toString(line)});
		communicationHelper.sendEvent(message, output);
	}
	
	public IVariable[] getStackVariables(String stackFrame) {
		de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.debug.EpDebugMessage response = sendCommandAndRead(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.debug.EEpDebugMessageTypes.GET_FRAME_VARIABLES, new String[] {stackFrame});
		String[] ids = response.getArguments();
		// fetch all variables
		IVariable[] variables = getVariables(ids);
		return variables;
	}
	
	public IVariable[] getVariables(String... requestedIDs) {
		de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.debug.EpDebugMessage response = sendCommandAndRead(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.debug.EEpDebugMessageTypes.GET_VARIABLES, requestedIDs);
		String[] varStrings = response.getArguments();
		de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.debug.EpDebugVariable[] variables  = new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.debug.EpDebugVariable[varStrings.length];
		int i = 0;
		for (String varString : varStrings) {
			Map<String, String> properties = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.util.EpStringUtil.convertFromString(varString);
			
			// convert varString to variables and values
			String valueString = properties.get("!valueString");
			String valueRefType = "valueRefType";
			Map<String, Long> childVariables = new TreeMap<String, Long>(new Comparator<String>() {
				public int compare(String s1, String s2) {
					return s1.compareToIgnoreCase(s2);
				}
			});
			for (String property : properties.keySet()) {
				// ignore special properties - they are not children
				if (property.startsWith("!")) {
					continue;
				}
				childVariables.put(property, Long.parseLong(properties.get(property)));
			}
			String id = properties.get("!id");
			IValue value = new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.debug.EpDebugValue(debugTarget, id, valueString, valueRefType, childVariables);
			
			String variableName = properties.get("!name");
			String variableRefType = properties.get("!type");
			
			de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.debug.EpDebugVariable variable = new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.debug.EpDebugVariable(debugTarget, variableName, value, variableRefType);
			variables[i++] = variable;
		}
		return variables;
	}
	
	private void sendCommand(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.debug.EEpDebugMessageTypes command, String... parameters) {
		de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.debug.EpDebugMessage message = new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.debug.EpDebugMessage(command, parameters);
		communicationHelper.sendEvent(message, output);
	}
	
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.debug.EpDebugMessage sendCommandAndRead(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.debug.EEpDebugMessageTypes command, String... parameters) {
		de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.debug.EpDebugMessage message = new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.debug.EpDebugMessage(command, parameters);
		return communicationHelper.sendAndReceive(message, output, reader);
	}
	
}
