package com.mycompany.myproject.impl;

import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceProvider;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.SyntheticResource;

public class MarksResourceProvider implements ResourceProvider {

	public MarksResourceProvider(String path) {
		// TODO Auto-generated constructor stub
	}

	public Resource getResource(ResourceResolver resourceResolver, String path) {
		
		return getResource(resourceResolver, null, path);
	}

	public Resource getResource(ResourceResolver resourceResolver, HttpServletRequest req, String path) {
		String resourceType = "myproject/components/resource";
		SyntheticResource resource = new SyntheticResource(resourceResolver, path, resourceType);
		return resource;
	}

	public Iterator<Resource> listChildren(Resource arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
