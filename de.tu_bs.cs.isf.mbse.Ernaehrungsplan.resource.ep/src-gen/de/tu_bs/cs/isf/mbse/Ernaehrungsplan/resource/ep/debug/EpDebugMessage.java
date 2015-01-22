/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.debug;

import java.util.ArrayList;
import java.util.List;

/**
 * DebugMessages are exchanged between the debug server (the Eclipse debug
 * framework) and the debug client (a running process or interpreter). To exchange
 * messages they are serialized and sent over sockets.
 */
public class EpDebugMessage {
	
	private static final char DELIMITER = ':';
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.debug.EEpDebugMessageTypes messageType;
	private String[] arguments;
	
	public EpDebugMessage(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.debug.EEpDebugMessageTypes messageType, String[] arguments) {
		super();
		this.messageType = messageType;
		this.arguments = arguments;
	}
	
	public EpDebugMessage(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.debug.EEpDebugMessageTypes messageType, List<String> arguments) {
		super();
		this.messageType = messageType;
		this.arguments = new String[arguments.size()];
		for (int i = 0; i < arguments.size(); i++) {
			this.arguments[i] = arguments.get(i);
		}
	}
	
	public de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.debug.EEpDebugMessageTypes getMessageType() {
		return messageType;
	}
	
	public String[] getArguments() {
		return arguments;
	}
	
	public String serialize() {
		List<String> parts = new ArrayList<String>();
		parts.add(messageType.name());
		for (String argument : arguments) {
			parts.add(argument);
		}
		return de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.util.EpStringUtil.encode(DELIMITER, parts);
	}
	
	public static EpDebugMessage deserialize(String response) {
		List<String> parts = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.util.EpStringUtil.decode(response, DELIMITER);
		String messageType = parts.get(0);
		String[] arguments = new String[parts.size() - 1];
		for (int i = 1; i < parts.size(); i++) {
			arguments[i - 1] = parts.get(i);
		}
		de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.debug.EEpDebugMessageTypes type = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.debug.EEpDebugMessageTypes.valueOf(messageType);
		EpDebugMessage message = new EpDebugMessage(type, arguments);
		return message;
	}
	
	public boolean hasType(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.debug.EEpDebugMessageTypes type) {
		return this.messageType == type;
	}
	
	public String getArgument(int index) {
		return getArguments()[index];
	}
	
	public String toString() {
		return this.getClass().getSimpleName() + "[" + messageType.name() + ": " + de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.ep.util.EpStringUtil.explode(arguments, ", ") + "]";
	}
	
}
