/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep.debug;

/**
 * DebugMessages are exchanged between the debug server (the Eclipse debug
 * framework) and the debug client (a running process or interpreter). To exchange
 * messages they are serialized and sent over sockets.
 */
public class EpDebugMessage {
	
	private static final char DELIMITER = ':';
	private ep.resource.ep.debug.EEpDebugMessageTypes messageType;
	private String[] arguments;
	
	public EpDebugMessage(ep.resource.ep.debug.EEpDebugMessageTypes messageType, String[] arguments) {
		super();
		this.messageType = messageType;
		this.arguments = arguments;
	}
	
	public EpDebugMessage(ep.resource.ep.debug.EEpDebugMessageTypes messageType, java.util.List<String> arguments) {
		super();
		this.messageType = messageType;
		this.arguments = new String[arguments.size()];
		for (int i = 0; i < arguments.size(); i++) {
			this.arguments[i] = arguments.get(i);
		}
	}
	
	public ep.resource.ep.debug.EEpDebugMessageTypes getMessageType() {
		return messageType;
	}
	
	public String[] getArguments() {
		return arguments;
	}
	
	public String serialize() {
		java.util.List<String> parts = new java.util.ArrayList<String>();
		parts.add(messageType.name());
		for (String argument : arguments) {
			parts.add(argument);
		}
		return ep.resource.ep.util.EpStringUtil.encode(DELIMITER, parts);
	}
	
	public static EpDebugMessage deserialize(String response) {
		java.util.List<String> parts = ep.resource.ep.util.EpStringUtil.decode(response, DELIMITER);
		String messageType = parts.get(0);
		String[] arguments = new String[parts.size() - 1];
		for (int i = 1; i < parts.size(); i++) {
			arguments[i - 1] = parts.get(i);
		}
		ep.resource.ep.debug.EEpDebugMessageTypes type = ep.resource.ep.debug.EEpDebugMessageTypes.valueOf(messageType);
		EpDebugMessage message = new EpDebugMessage(type, arguments);
		return message;
	}
	
	public boolean hasType(ep.resource.ep.debug.EEpDebugMessageTypes type) {
		return this.messageType == type;
	}
	
	public String getArgument(int index) {
		return getArguments()[index];
	}
	
	public String toString() {
		return this.getClass().getSimpleName() + "[" + messageType.name() + ": " + ep.resource.ep.util.EpStringUtil.explode(arguments, ", ") + "]";
	}
	
}
