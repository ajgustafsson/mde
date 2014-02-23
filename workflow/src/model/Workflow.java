//org.eclipse.emf.ecore.impl.EClassImpl@109a94ab (name: Workflow) (instanceClassName: null) (abstract: false, interface: false)
package model;

import java.util.*;
public class Workflow {

		private java.lang.String name;
	
	
		private List<Node> nodes = new ArrayList<Node>();
	
	
	public void start(User var1
	) {
	
		// Start of user code start
		Task startTask = getStartTask();
		if (checkThatUserCanExecuteTask(startTask, var1)) {
			startTask.doJob();
		} else {
			System.out.println("You cannot do this task!");
		}
		if (!startTask.getEnd()) {
			boolean running = true;
			while (running) {
				List<Task> executableTasks = getExecutableTasks();
				Task toRun = null;
				if (executableTasks.size() == 1) {
					toRun = executableTasks.get(0);
					toRun.doJob();
					if(toRun.getEnd()) {
						break;
					}
				}
				Scanner sc = null;
				try {
					while (toRun == null) {
						printExecutableTasks(executableTasks);
						sc = new Scanner(System.in);
						String taskNameToStart = sc.nextLine();
						try {
							int id = Integer.parseInt(taskNameToStart);
							if (id < executableTasks.size()) {
								toRun = executableTasks.get(id);
							}
						} catch (NumberFormatException e) {
						}

						if (toRun == null) {
							System.out.println("Task ID " + taskNameToStart
									+ " isn't a valid task ID.");
						}
						if (checkThatUserCanExecuteTask(toRun, var1)) {
							toRun.doJob();
							if (toRun.getEnd()) {
								running = false;
							}
						} else {
							System.out
									.println("Sorry, you don't have permission to do that!");
						}
					}
				} finally {

				}
				
			}
			System.out.println("Good work brother, you completed the workflow");
		}
		// End of user code
	}
	
	
	public void setName(java.lang.String name) {
		this.name = name;
	}
	
	public java.lang.String getName() {
		return name; 
	}
	
	public void setNodes(List<Node> nodes) {
		this.nodes = nodes;
	}
	
	public List<Node> getNodes() {
		return nodes; 
	}
	
	

	//Start of user code Workflow
	private Task getStartTask() {
		for (Node node : this.nodes) {
			if (node instanceof Task) {
				Task task = (Task) node;
				if (task.getStart()) {
					return task;
				}
			}
		}
		throw new UnsupportedOperationException(
				"No task with isStart == true can be found.");
	}
	
	private boolean checkThatUserCanExecuteTask(Task task, User user) {
		Permission permission = task.getPermission();

		if (permission != null) {

			List<UserGroup> groups = user.getGroups();

			for (UserGroup group : groups) {
				if (group.getPermissions().contains(permission)) {
					return true;
				}
			}
			return false;
		} else {
			return true;
		}
	}
	
	private List<Task> getExecutableTasks() {

		List<Task> executableTasks = new ArrayList<>();
		for (Node node : this.nodes) {
			if (node instanceof Task) {
				Task task = (Task) node;
				if (task.getState() == TaskState.PROCESSING) {
					executableTasks.add(task);
				}
			}
		}

		return executableTasks;
	}

	
	private void printExecutableTasks(List<Task> executableTasks) {
		System.out
				.println("Which task do you want to start? (Type the ID of the task you want to start)");
		for (int i = 0; i < executableTasks.size(); i++) {
			Task task = executableTasks.get(i);
			System.out.println("Task ID: " + i + " (" + task.getName() + ")");
		}
	}
	// End of user code
}

