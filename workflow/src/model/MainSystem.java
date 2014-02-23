//org.eclipse.emf.ecore.impl.EClassImpl@169619fb (name: MainSystem) (instanceClassName: null) (abstract: false, interface: false)
package model;

import java.util.ArrayList;
import java.util.List;
public class MainSystem {

	
		private List<Workflow> workflows = new ArrayList<Workflow>();
	
		private List<User> users = new ArrayList<User>();
	
		private List<UserGroup> userGroups = new ArrayList<UserGroup>();
	
		private List<Permission> permissions = new ArrayList<Permission>();
	
	
	public void start(java.lang.String var1
	, java.lang.String var2
	) {
	
		// Start of user code start
		//var1 == username, var2 == workflow
		Workflow workflow = getWorkflow(var2, getWorkflows());
		if (workflow == null) {
	    	throw new IllegalArgumentException("No workflow can be found with name: " + var2);
	    }
		    
	    User user = getUser(var1, getUsers());
	    if (user == null) {
	    	throw new IllegalArgumentException("No user can be found with name: " + var1);
	    }  
	    
	    workflow.start(user);
		// End of user code
	}
	
	
	public void setWorkflows(List<Workflow> workflows) {
		this.workflows = workflows;
	}
	
	public List<Workflow> getWorkflows() {
		return workflows; 
	}
	
	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	public List<User> getUsers() {
		return users; 
	}
	
	public void setUserGroups(List<UserGroup> userGroups) {
		this.userGroups = userGroups;
	}
	
	public List<UserGroup> getUserGroups() {
		return userGroups; 
	}
	
	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}
	
	public List<Permission> getPermissions() {
		return permissions; 
	}

	//Start of user code MainSystem
	private static User getUser(String username, List<User> users) {
		for (User user : users) {
			if (user.getName().equals(username)) {
				return user;
			}
		}
		return null;	
	}   
	
	private static Workflow getWorkflow(String workflowName, List<Workflow> workflows) {
		for (Workflow wf : workflows) {
			if (wf.getName().equals(workflowName)) {
				return wf;
			}
		}
		return null;
	}
	// End of user code
}

