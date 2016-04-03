package com.mycompany.myproject.impl;

import java.util.Map;
import java.util.Set;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Properties;
import org.apache.felix.scr.annotations.Service;
import org.apache.sling.api.resource.LoginException;
import org.apache.sling.api.resource.ResourceProvider;
import org.apache.sling.api.resource.ResourceProviderFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(metatype = true, label = "Fisher & Paykel REST ApiEndpointResourceProviderFactory")
@Service
@Properties({ @org.apache.felix.scr.annotations.Property(name = "provider.roots", value = { MarksResourceProviderFactoryImpl.ROOT }) })
public class MarksResourceProviderFactoryImpl implements ResourceProviderFactory{

	public static final String ROOT="/marks-api/v1-0";
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public ResourceProvider getAdministrativeResourceProvider(Map<String, Object> paramMap) throws LoginException {
		return getResourceProvider(paramMap);
	}

	public ResourceProvider getResourceProvider(Map<String, Object> arg0) throws LoginException {
		Set<String> keySet = arg0.keySet();
		for (String key : keySet){
			logger.info("markolsen" + key);
		}
		
		String path = "";
		return new MarksResourceProvider(path);
	}

}
