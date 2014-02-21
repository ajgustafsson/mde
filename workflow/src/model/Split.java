//org.eclipse.emf.ecore.impl.EClassImpl@5fae1a85 (name: Split) (instanceClassName: null) (abstract: false, interface: false)
package model;

import java.util.*;
public class Split extends Transition {

		private java.lang.String name;
	
	
		private List<Task> previousTasks;
	
		private List<Task> tasks;
	
	
	public void transit() {
		// Start of user code transit
		for (Task task : tasks) {
			task.setReady(previousTasks);
		}	
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
	
	


	// Start of user code Split
	// TODO should be implemented
	// End of user code

}


