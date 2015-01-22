/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.debug;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

public class ErnaehrungsplanDebugCommunicationHelper {
	
	public void sendEvent(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.debug.ErnaehrungsplanDebugMessage message, PrintStream stream) {
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
	public de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.debug.ErnaehrungsplanDebugMessage sendAndReceive(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.debug.ErnaehrungsplanDebugMessage message, PrintStream stream, BufferedReader reader) {
		synchronized (stream) {
			sendEvent(message, stream);
			de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.debug.ErnaehrungsplanDebugMessage response = receive(reader);
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
	public de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.debug.ErnaehrungsplanDebugMessage receive(BufferedReader reader) {
		try {
			String response = reader.readLine();
			if (response == null) {
				return null;
			}
			de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.debug.ErnaehrungsplanDebugMessage receivedMessage = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.debug.ErnaehrungsplanDebugMessage.deserialize(response);
			return receivedMessage;
		} catch (IOException e) {
			return null;
		}
	}
	
}
