//org.eclipse.emf.ecore.impl.EClassImpl@3137b4fd (name: Merge) (instanceClassName: null) (abstract: false, interface: false)
package model;

import java.util.*;
public class Merge extends Transition {

		private java.lang.String name;
	
	
		private List<Task> previousTasks = new ArrayList<Task>();
	
		private Task task;
	
	
	public void transit(
	// Start of user code operation.name
	// 	go fot it anders
	// End of user code
	) {
		// Start of user code transit
		boolean allDone = true;
		for (Task task : previousTasks) {
			if (!task.getState().equals(TaskState.PROCESSED)) {
				allDone = false;
				break;
			}
		}
		
		if (allDone) {
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
	
	public void setTask(Task task) {
		this.task = task;
	}
	
	public Task getTask() {
		return task; 
	}
	
	

	//Start of user code Merge
	// TODO should be implemented
	// End of user code
}

