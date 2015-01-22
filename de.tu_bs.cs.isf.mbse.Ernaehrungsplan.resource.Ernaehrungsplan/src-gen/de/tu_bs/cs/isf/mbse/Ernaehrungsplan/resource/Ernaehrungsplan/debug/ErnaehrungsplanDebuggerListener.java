/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.debug;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * The DebuggerListener receives commands from the Eclipse Debug framework and
 * sends these commands to a debuggable process (e.g., an interpreter or generated
 * code).
 */
public class ErnaehrungsplanDebuggerListener<ResultType, ContextType> implements Runnable {
	
	private static final Class<?>[] PRIMITIVE_TYPES = new Class<?>[] {
		String.class,
		Integer.class, int.class,
		Long.class, long.class,
		Boolean.class, boolean.class,
		Float.class, float.class,
		Double.class, double.class,
		Byte.class, byte.class,
		Short.class, short.class,
		Character.class, char.class,
	};
	
	private final static class ArrayPartition {
		
		private final Object array;
		private final int startIndex;
		private final int endIndex;
		
		public ArrayPartition(Object array, int startIndex, int endIndex) {
			super();
			this.array = array;
			this.startIndex = startIndex;
			this.endIndex = endIndex;
		}
		
		public int getStartIndex() {
			return startIndex;
		}
		
		public int getEndIndex() {
			return endIndex;
		}
		
		public Object getArray() {
			return array;
		}
		
	}
	
	private boolean stop = false;
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.debug.AbstractErnaehrungsplanDebuggable debuggable;
	/**
	 * The last object id that was used.
	 */
	private long id = 0;
	/**
	 * This map maps object ids to pairs of object names and object values.
	 */
	private Map<Long, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.util.ErnaehrungsplanPair<String, Object>> objectMap = new LinkedHashMap<Long, de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.util.ErnaehrungsplanPair<String, Object>>();
	
	private de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.debug.ErnaehrungsplanDebugCommunicationHelper communicationHelper = new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.debug.ErnaehrungsplanDebugCommunicationHelper();
	
	private int requestPort;
	
	public ErnaehrungsplanDebuggerListener(int requestPort) {
		super();
		this.requestPort = requestPort;
	}
	
	public void run() {
		try {
			runDebugger();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void runDebugger() throws IOException {
		ServerSocket server = new ServerSocket(requestPort);
		Socket accept = server.accept();
		InputStream inputStream = accept.getInputStream();
		BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
		PrintStream output = new PrintStream(accept.getOutputStream());
		
		de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.debug.ErnaehrungsplanDebugMessage command;
		while (!stop) {
			command = communicationHelper.receive(reader);
			if (command == null) {
				break;
			}
			if (command.hasType(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.debug.EErnaehrungsplanDebugMessageTypes.EXIT)) {
				debuggable.terminate();
				stop = true;
			} else if (command.hasType(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.debug.EErnaehrungsplanDebugMessageTypes.RESUME)) {
				debuggable.resume();
			} else if (command.hasType(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.debug.EErnaehrungsplanDebugMessageTypes.STEP_OVER)) {
				debuggable.stepOver();
			} else if (command.hasType(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.debug.EErnaehrungsplanDebugMessageTypes.STEP_INTO)) {
				debuggable.stepInto();
			} else if (command.hasType(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.debug.EErnaehrungsplanDebugMessageTypes.STEP_RETURN)) {
				debuggable.stepReturn();
			} else if (command.hasType(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.debug.EErnaehrungsplanDebugMessageTypes.ADD_LINE_BREAKPOINT)) {
				String location = command.getArgument(0);
				int line = Integer.parseInt(command.getArgument(1));
				debuggable.addLineBreakpoint(location, line);
			} else if (command.hasType(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.debug.EErnaehrungsplanDebugMessageTypes.REMOVE_LINE_BREAKPOINT)) {
				String location = command.getArgument(0);
				int line = Integer.parseInt(command.getArgument(1));
				debuggable.removeLineBreakpoint(location, line);
			} else if (command.hasType(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.debug.EErnaehrungsplanDebugMessageTypes.GET_STACK)) {
				final String[] stack = debuggable.getStack();
				String controlStack = de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.util.ErnaehrungsplanStringUtil.encode('#', stack);
				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.debug.ErnaehrungsplanDebugMessage message = new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.debug.ErnaehrungsplanDebugMessage(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.debug.EErnaehrungsplanDebugMessageTypes.GET_STACK_RESPONSE, new String[] {controlStack});
				communicationHelper.sendEvent(message, output);
			} else if (command.hasType(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.debug.EErnaehrungsplanDebugMessageTypes.GET_FRAME_VARIABLES)) {
				String stackFrame = command.getArgument(0);
				Map<String, Object> frameVariables = debuggable.getFrameVariables(stackFrame);
				
				List<String> topVariableIDs = new ArrayList<String>();
				for (String name : frameVariables.keySet()) {
					Object value = frameVariables.get(name);
					long id = getObjectID(name, value);
					topVariableIDs.add(Long.toString(id));
				}
				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.debug.ErnaehrungsplanDebugMessage message = new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.debug.ErnaehrungsplanDebugMessage(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.debug.EErnaehrungsplanDebugMessageTypes.GET_FRAME_VARIABLES_RESPONSE, topVariableIDs);
				communicationHelper.sendEvent(message, output);
			} else if (command.hasType(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.debug.EErnaehrungsplanDebugMessageTypes.GET_VARIABLES)) {
				String[] arguments = command.getArguments();
				Long[] requestedIDs = new Long[arguments.length];
				int i = 0;
				for (String argument : arguments) {
					requestedIDs[i++] = Long.parseLong(argument);
				}
				// create variable strings
				String[] varStrings = new String[arguments.length];
				i = 0;
				for (Long requestedID : requestedIDs) {
					Object next = objectMap.get(requestedID).getRight();
					String varString = convertToString(requestedID, next);
					varStrings[i++] = varString;
				}
				de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.debug.ErnaehrungsplanDebugMessage message = new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.debug.ErnaehrungsplanDebugMessage(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.debug.EErnaehrungsplanDebugMessageTypes.GET_VARIABLES_RESPONSE, varStrings);
				communicationHelper.sendEvent(message, output);
			} else {
				System.out.println("ERROR: Unrecognized command (" + command + ")!");
				output.append("Unrecognized command!");
			}
		}
		// closing server
		server.close();
	}
	
	private String convertToString(long id, Object object) {
		String name = objectMap.get(id).getLeft();
		
		Map<String, Object> properties = new LinkedHashMap<String, Object>();
		properties.put("!name", name);
		properties.put("!id", Long.toString(id));
		String valueString = object == null ? "null" : object.toString();
		if (object != null) {
			if (object instanceof EObject) {
				EObject eObject = (EObject) object;
				EClass eClass = eObject.eClass();
				String eClassName = eClass.getName();
				valueString = eClassName + " (id=" + id + ")";
				properties.put("!type", eClassName);
				
				List<EStructuralFeature> features = eClass.getEAllStructuralFeatures();
				for (EStructuralFeature feature : features) {
					Object value = eObject.eGet(feature);
					String featureName = feature.getName();
					long valueID = getObjectID(featureName, value);
					properties.put(featureName, Long.toString(valueID));
				}
			} else if (object instanceof ArrayPartition) {
				ArrayPartition partition = (ArrayPartition) object;
				valueString = "";
				// if there is only a single partition, the elements of the array are directly
				// used a children
				for (int i = partition.getStartIndex(); i < partition.getEndIndex(); i++) {
					Object array = partition.getArray();
					Object objectAtIndex = java.lang.reflect.Array.get(array, i);
					String fieldName = "[" + i + "]";
					long valueID = getObjectID(fieldName, objectAtIndex);
					properties.put(fieldName, Long.toString(valueID));
				}
			} else {
				Class<? extends Object> javaClass = object.getClass();
				valueString = javaClass.getSimpleName() + " (id=" + id + ")";
				if (!isPrimitiveTypeClass(javaClass)) {
					addFields(object, properties, javaClass);
				} else {
					valueString = object.toString();
				}
				if (javaClass.isArray()) {
					int length = Array.getLength(object);
					int partitions = getPartitionCount(length);
					Class<?> componentType = javaClass.getComponentType();
					valueString = componentType.getName() + "[" + length + "] (id=" + id + ")";
					if (partitions == 1) {
						// if there is only a single partition, the elements of the array are directly
						// used a children
						for (int i = 0; i < length; i++) {
							Object objectAtIndex = Array.get(object, i);
							String fieldName = "[" + i + "]";
							long valueID = getObjectID(fieldName, objectAtIndex);
							properties.put(fieldName, Long.toString(valueID));
						}
					} else {
						// if there are multiple partitions, we introduce artificial objects that
						// represent partitions of the array
						for (int i = 0; i < partitions; i++) {
							int startIndex = i * 100;
							int endIndex = Math.min((i + 1) * 100, length);
							String fieldName = "[" + startIndex + ".." + (endIndex - 1) + "]";
							ArrayPartition newPartition = new ArrayPartition(object, startIndex, endIndex);
							long valueID = getObjectID(fieldName, newPartition);
							properties.put(fieldName, Long.toString(valueID));
						}
					}
				}
			}
		}
		properties.put("!valueString", valueString);
		
		return de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.util.ErnaehrungsplanStringUtil.convertToString(properties);
	}
	
	private int getPartitionCount(int arraySize) {
		int partitionSize = 100;
		int numPartitions = arraySize / partitionSize;
		int remainder = arraySize % partitionSize;
		if (remainder > 0) {
			numPartitions++;
		}
		return numPartitions;
	}
	
	private void addFields(Object object, Map<String, Object> properties, Class<?> javaClass) {
		Field[] fields = javaClass.getDeclaredFields();
		for (Field field : fields) {
			// here we should check the settings of the debug view
			if (Modifier.isStatic(field.getModifiers())) {
				continue;
			}
			try {
				field.setAccessible(true);
				Object value = field.get(object);
				String fieldName = field.getName();
				long valueID = getObjectID(fieldName, value);
				properties.put(fieldName, Long.toString(valueID));
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		Class<?> superclass = javaClass.getSuperclass();
		if (superclass != null) {
			addFields(object, properties, superclass);
		}
	}
	private boolean isPrimitiveTypeClass(Class<?> javaClass) {
		for (Class<?> clazz : PRIMITIVE_TYPES) {
			if (clazz.getName().equals(javaClass.getName())) {
				return true;
			}
		}
		return false;
	}
	
	private long getObjectID(String name, Object value) {
		de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.util.ErnaehrungsplanPair<String, Object> pair = new de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.util.ErnaehrungsplanPair<String, Object>(name, value);
		if (objectMap.containsValue(pair)) {
			for (Long nextID : objectMap.keySet()) {
				Object next = objectMap.get(nextID);
				if (pair.equals(next)) {
					return nextID;
				}
			}
			// This should not happen, because objectMap.containsValue() was true. Maybe there
			// is a fault equals() method?
			assert false;
			return -1;
		} else {
			long usedID = id;
			objectMap.put(usedID, pair);
			id++;
			return usedID;
		}
	}
	
	public de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.debug.AbstractErnaehrungsplanDebuggable getDebuggable() {
		return debuggable;
	}
	
	public void setDebuggable(de.tu_bs.cs.isf.mbse.Ernaehrungsplan.resource.Ernaehrungsplan.debug.AbstractErnaehrungsplanDebuggable debuggable) {
		this.debuggable = debuggable;
	}
	
}
