//org.eclipse.emf.ecore.impl.EClassImpl@2fb8e76 (name: UserGroup) (instanceClassName: null) (abstract: false, interface: false)
package model;

import java.util.*;
public class UserGroup {

		private java.lang.String name;
	
	
		private List<Permission> permissions;
	
	
	
	public void setName(java.lang.String name) {
		this.name = name;
	}
	
	public java.lang.String getName() {
		return name; 
	}
	
	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}
	
	public List<Permission> getPermissions() {
		return permissions; 
	}
	
	
}

