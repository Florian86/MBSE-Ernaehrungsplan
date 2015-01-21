/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep.debug;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

public class EpDebugCommunicationHelper {
	
	public void sendEvent(ep.resource.ep.debug.EpDebugMessage message, PrintStream stream) {
		synchronized (stream) {
			stream.println(message.serialize());
		}
	}
	
	/**
	 * <p>
	 * Sends a message using the given stream and waits for an answer.
	 * </p>
	 * 
	 * @param messageType the type of message to send
	 * @param stream the stream to send the message to
	 * @param reader the reader to obtain the answer from
	 * @param parameters additional parameter to send
	 * 
	 * @return the answer that is received
	 */
	public ep.resource.ep.debug.EpDebugMessage sendAndReceive(ep.resource.ep.debug.EpDebugMessage message, PrintStream stream, BufferedReader reader) {
		synchronized (stream) {
			sendEvent(message, stream);
			ep.resource.ep.debug.EpDebugMessage response = receive(reader);
			return response;
		}
	}
	
	/**
	 * <p>
	 * Receives a message from the given reader. This method block until a message has
	 * arrived.
	 * </p>
	 * 
	 * @param reader the read to obtain the message from
	 * 
	 * @return the received message
	 */
	public ep.resource.ep.debug.EpDebugMessage receive(BufferedReader reader) {
		try {
			String response = reader.readLine();
			if (response == null) {
				return null;
			}
			ep.resource.ep.debug.EpDebugMessage receivedMessage = ep.resource.ep.debug.EpDebugMessage.deserialize(response);
			return receivedMessage;
		} catch (IOException e) {
			return null;
		}
	}
	
}
