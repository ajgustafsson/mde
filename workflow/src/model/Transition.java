//org.eclipse.emf.ecore.impl.EClassImpl@19a93cb1 (name: Transition) (instanceClassName: null) (abstract: true, interface: true)
package model;

import java.util.*;
public class Transition extends Node {

		private java.lang.String name;
	
	
		private List<Task> previousTasks;
	
	
	public void transit() {
		// Start of user code transit
		// TODO should be implemented
		// End of user code
	}
	
	
	public void setName(java.lang.String name) {
		this.name = name;
	}
	
	public java.lang.String getName() {
		return name; 
	}
	
	public void setPreviousTasks(List<Task> previousTasks) {
		this.previousTasks = previousTasks;
	}
	
	public List<Task> getPreviousTasks() {
		return previousTasks; 
	}
	
	
}

