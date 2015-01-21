/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ep.resource.ep.mopp;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * The EpTokenResolverFactory class provides access to all generated token
 * resolvers. By giving the name of a defined token, the corresponding resolve can
 * be obtained. Despite the fact that this class is called TokenResolverFactory is
 * does NOT create new token resolvers whenever a client calls methods to obtain a
 * resolver. Rather, this class maintains a map of all resolvers and creates each
 * resolver at most once.
 */
public class EpTokenResolverFactory implements ep.resource.ep.IEpTokenResolverFactory {
	
	private Map<String, ep.resource.ep.IEpTokenResolver> tokenName2TokenResolver;
	private Map<String, ep.resource.ep.IEpTokenResolver> featureName2CollectInTokenResolver;
	private static ep.resource.ep.IEpTokenResolver defaultResolver = new ep.resource.ep.analysis.EpDefaultTokenResolver();
	
	public EpTokenResolverFactory() {
		tokenName2TokenResolver = new LinkedHashMap<String, ep.resource.ep.IEpTokenResolver>();
		featureName2CollectInTokenResolver = new LinkedHashMap<String, ep.resource.ep.IEpTokenResolver>();
		registerTokenResolver("TEXT", new ep.resource.ep.analysis.EpTEXTTokenResolver());
		registerTokenResolver("QUOTED_34_34", new ep.resource.ep.analysis.EpQUOTED_34_34TokenResolver());
	}
	
	public ep.resource.ep.IEpTokenResolver createTokenResolver(String tokenName) {
		return internalCreateResolver(tokenName2TokenResolver, tokenName);
	}
	
	public ep.resource.ep.IEpTokenResolver createCollectInTokenResolver(String featureName) {
		return internalCreateResolver(featureName2CollectInTokenResolver, featureName);
	}
	
	protected boolean registerTokenResolver(String tokenName, ep.resource.ep.IEpTokenResolver resolver){
		return internalRegisterTokenResolver(tokenName2TokenResolver, tokenName, resolver);
	}
	
	protected boolean registerCollectInTokenResolver(String featureName, ep.resource.ep.IEpTokenResolver resolver){
		return internalRegisterTokenResolver(featureName2CollectInTokenResolver, featureName, resolver);
	}
	
	protected ep.resource.ep.IEpTokenResolver deRegisterTokenResolver(String tokenName){
		return tokenName2TokenResolver.remove(tokenName);
	}
	
	private ep.resource.ep.IEpTokenResolver internalCreateResolver(Map<String, ep.resource.ep.IEpTokenResolver> resolverMap, String key) {
		if (resolverMap.containsKey(key)){
			return resolverMap.get(key);
		} else {
			return defaultResolver;
		}
	}
	
	private boolean internalRegisterTokenResolver(Map<String, ep.resource.ep.IEpTokenResolver> resolverMap, String key, ep.resource.ep.IEpTokenResolver resolver) {
		if (!resolverMap.containsKey(key)) {
			resolverMap.put(key,resolver);
			return true;
		}
		return false;
	}
	
}
