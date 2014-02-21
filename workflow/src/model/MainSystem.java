//org.eclipse.emf.ecore.impl.EClassImpl@ee9b84e (name: MainSystem) (instanceClassName: null) (abstract: false, interface: false)
package model;

import java.util.*;
public class MainSystem {

	
		private List<Workflow> workflows;
	
		private List<User> users;
	
		private List<UserGroup> userGroups;
	
		private List<Permission> permissions;
	
	
	public void start(java.lang.String var1
	, java.lang.String var2
	) {
	
		// Start of user code start
		// TODO should be implemented
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
	
	
}

