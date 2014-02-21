package model;

import java.util.*;

import model.Task;
import model.TaskState;
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
		Scanner input = null;
		try {

			System.out.println("----------- Executing " + this.name + " -----------\n");

			System.out.println("----------- Data from previous tasks: -----------\n");
			if (previousTasks != null) {
				for (Task task : previousTasks) {
					System.out.println(task.getName() + ":");
					System.out.println(task.getData());
				}
			}
			System.out.println("----------- End of data from previous tasks -----------\n");

			System.out.println("----------- " + this.name + " description: -----------\n");
			System.out.println(this.description);
			System.out.println("----------- Type or past any data that is required for next step in the workflow: -----------\n");
			input = new Scanner(System.in);
			String dataInput = input.nextLine();
			this.data = dataInput;

			System.out.println("Set the result of the task...");
			dataInput = input.nextLine();

			this.Result = Integer.parseInt(dataInput);
			System.out.println(this.transition.get(0));
			System.out.println("----------- Done executing " + this.name + " -----------\n");
			this.setState(TaskState.PROCESSED);
			this.transition.get(0).transit();
			
			
			
		} finally {
		//	if (input != null) {
	//			input.close();
	//		}
		}
		// End of user code
	}
	
	public void setReady(List previousTasks) {
		// Start of user code setReady
		this.previousTasks.addAll(previousTasks);
		this.state = TaskState.PROCESSING;
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
	
	


	// Start of user code Task
	// TODO should be implemented
	// End of user code

}


