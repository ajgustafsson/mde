//org.eclipse.emf.ecore.impl.EClassImpl@4cd8b12a (name: Task) (instanceClassName: null) (abstract: false, interface: false)
package model;

import java.util.*;
public class Task extends Node {

		private java.lang.String name;
	
		private TaskState state;
	
		private boolean end;
	
		private boolean start;
	
		private java.lang.String description;
	
		private int Result;
	
		private java.lang.String data;
	
	
		private Permission permission;
	
		private List<Transition> transition;
	
		private List<Task> previousTasks;
	
	
	public void doJob(
	// Start of user code operation.name
	// 	go fot it anders
	// End of user code
	) {
		// Start of user code doJob
		// TODO should be implemented
		// End of user code
	}
	
	public void setReady(
	// Start of user code operation.name
	// 	go fot it anders
	// End of user code
	) {
		// Start of user code setReady
		// TODO should be implemented
		// End of user code
	}
	
	
	public void setName(java.lang.String name) {
		this.name = name;
	}
	
	public java.lang.String getName() {
		return name; 
	}
	
	public void setState(TaskState state) {
		this.state = state;
	}
	
	public TaskState getState() {
		return state; 
	}
	
	public void setEnd(boolean end) {
		this.end = end;
	}
	
	public boolean getEnd() {
		return end; 
	}
	
	public void setStart(boolean start) {
		this.start = start;
	}
	
	public boolean getStart() {
		return start; 
	}
	
	public void setDescription(java.lang.String description) {
		this.description = description;
	}
	
	public java.lang.String getDescription() {
		return description; 
	}
	
	public void setResult(int Result) {
		this.Result = Result;
	}
	
	public int getResult() {
		return Result; 
	}
	
	public void setData(java.lang.String data) {
		this.data = data;
	}
	
	public java.lang.String getData() {
		return data; 
	}
	
	public void setPermission(Permission permission) {
		this.permission = permission;
	}
	
	public Permission getPermission() {
		return permission; 
	}
	
	public void setTransition(List<Transition> transition) {
		this.transition = transition;
	}
	
	public List<Transition> getTransition() {
		return transition; 
	}
	
	public void setPreviousTasks(List<Task> previousTasks) {
		this.previousTasks = previousTasks;
	}
	
	public List<Task> getPreviousTasks() {
		return previousTasks; 
	}
	
	
}

