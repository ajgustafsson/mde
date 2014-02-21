//org.eclipse.emf.ecore.impl.EClassImpl@78c67815 (name: Switch) (instanceClassName: null) (abstract: false, interface: false)
package model;

import java.util.*;
public class Switch extends Transition {

		private java.lang.String name;
	
	
		private List<Task> previousTasks;
	
		private List<Task> tasks;
	
	
	public void transit(
	// Start of user code operation.name
	// 	go fot it anders
	// End of user code
	) {
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
	
	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}
	
	public List<Task> getTasks() {
		return tasks; 
	}
	
	
}

