//org.eclipse.emf.ecore.impl.EClassImpl@1d3a3d5c (name: Simple) (instanceClassName: null) (abstract: false, interface: false)
package model;

import java.util.*;
public class Simple extends Transition {

		private java.lang.String name;
	
	
		private List<Task> previousTasks;
	
		private Task task;
	
	
	public void transit() {
		// Start of user code transit
		int i = 99999;
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
	
	public void setTask(Task task) {
		this.task = task;
	}
	
	public Task getTask() {
		return task; 
	}
	
	
}

