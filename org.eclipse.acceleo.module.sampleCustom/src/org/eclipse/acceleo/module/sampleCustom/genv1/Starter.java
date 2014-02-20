package org.eclipse.acceleo.module.sampleCustom.genv1;


import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import Engine.EnginePackage;
import Engine.MainSystem;
import Engine.User;
import Engine.Workflow;

public class Starter {

	public static void main(String[] args) {
			
		//load xmi model through *.xmi file
		
		//arg[0] == user and arg[1] == 1
	
		//init model
		EnginePackage.eINSTANCE.eClass();
		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		
		Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("xmi", new XMIResourceFactoryImpl());

	    // Obtain a new resource set
	    ResourceSet resSet = new ResourceSetImpl();
	    
	    // Get the resource
	    Resource resource = resSet.getResource(URI.createURI("xmi/MainSystem.xmi"), true);
	    // Get the first model element and cast it to the right type, in my
	    // example everything is hierarchical included in this first node
	    MainSystem system = (MainSystem) resource.getContents().get(0);
	    
	    Workflow workflow = system.getWorkflows().get(0);
	    
	    User user = system.getUsers().get(0);
	    
	    workflow.start(user);
			
			
	}
	
}
