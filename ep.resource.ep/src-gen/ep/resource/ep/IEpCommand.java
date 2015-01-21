/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep;


/**
 * A simple interface for commands that can be executed and that return
 * information about the success of their execution.
 */
public interface IEpCommand<ContextType> {
	
	public boolean execute(ContextType context);
}
