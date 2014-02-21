//org.eclipse.emf.ecore.impl.EClassImpl@59359d9e (name: MainSystem) (instanceClassName: null) (abstract: false, interface: false)
package model;

public class MainSystem {
	
		private Workflow workflows;
	
		private User users;
	
		private UserGroup userGroups;
	
		private Permission permissions;
	
	
	public void start() {
		// Start of user code start
		// TODO should be implemented
		// End of user code
	}
	
	
	public void setWorkflows(Workflow workflows) {
		this.workflows = workflows;
	}
	
	public Workflow getWorkflows() {
		return workflows; 
	}
	
	public void setUsers(User users) {
		this.users = users;
	}
	
	public User getUsers() {
		return users; 
	}
	
	public void setUserGroups(UserGroup userGroups) {
		this.userGroups = userGroups;
	}
	
	public UserGroup getUserGroups() {
		return userGroups; 
	}
	
	public void setPermissions(Permission permissions) {
		this.permissions = permissions;
	}
	
	public Permission getPermissions() {
		return permissions; 
	}
	
	
}

