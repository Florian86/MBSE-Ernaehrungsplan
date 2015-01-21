/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep;


/**
 * A simple interface for generic functions with one argument.
 */
public interface IEpFunction1<ReturnType, ArgumentType1> {
	
	public ReturnType execute(ArgumentType1 argument1);
}
