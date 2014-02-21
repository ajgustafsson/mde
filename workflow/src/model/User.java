//org.eclipse.emf.ecore.impl.EClassImpl@5a765561 (name: User) (instanceClassName: null) (abstract: false, interface: false)
package model;

import java.util.*;
public class User {

		private java.lang.String name;
	
	
		private List<UserGroup> groups;
	
	
	
	public void setName(java.lang.String name) {
		this.name = name;
	}
	
	public java.lang.String getName() {
		return name; 
	}
	
	public void setGroups(List<UserGroup> groups) {
		this.groups = groups;
	}
	
	public List<UserGroup> getGroups() {
		return groups; 
	}
	
	
}

