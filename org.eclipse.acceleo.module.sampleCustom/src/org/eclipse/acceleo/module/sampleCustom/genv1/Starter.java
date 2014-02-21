
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
		
		String username = args[ 0 ];
		String workflowName = args[ 1 ];
		EnginePackage.eINSTANCE.eClass();
		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		
		Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("xmi", new XMIResourceFactoryImpl());

	    ResourceSet resSet = new ResourceSetImpl();
	    
    	Resource resource = resSet.getResource(URI.createURI("xmi/MainSystem1.xmi"), true);
	
		MainSystem system = (MainSystem) resource.getContents().get(0);
			
		Workflow workflow = getWorkflow(workflowName, system.getWorkflows());
		if (workflow == null) {
	    	throw new NullPointerException("No workflow can be found with name: " + workflowName);
	    }
		    
	    User user = getUser(username, system.getUsers());
	    if (user == null) {
	    	throw new NullPointerException("No user can be found with name: " + user);
	    }  
	    
	    workflow.start(user);
					
	}

	private static User getUser(String username, EList<User> users) {
		for (User user : users) {
			if (user.getName().equals(username)) {
				return user;
			}
		}
		return null;	
	}   
	
	private static Workflow getWorkflow(String workflowName, EList<Workflow> workflows) {
		for (Workflow wf : workflows) {
			if (wf.getName().equals(workflowName)) {
				return wf;
			}
		}
		return null;
	}
}





