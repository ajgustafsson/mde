package model;

import java.util.*;
public class IfElse extends Transition {

		private java.lang.String name;
	
	
		private List<Task> previousTasks;
	
		private List<Task> tasks;
	
	
	public void transit(
	// Start of user code operation.name
	// 	go fot it anders
	// End of user code
	) {
		// Start of user code transit
		if (previousTasks.get(0).getResult() == 0) {
			//negative outcome of the if else
			tasks.get(0).setReady(previousTasks);			
		} else {
			tasks.get(1).setReady(previousTasks);
		}
		
		tasks.get(previousTasks.get(0).getResult());
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
	
	


	// Start of user code IfElse
	// TODO should be implemented
	// End of user code

}


