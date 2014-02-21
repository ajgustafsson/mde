//org.eclipse.emf.ecore.impl.EClassImpl@18869132 (name: WaitForOne) (instanceClassName: null) (abstract: false, interface: false)
package model;

public class WaitForOne {
		private java.lang.String name;
	
	
		private Task previousTasks;
	
		private ResultTask resultTasks;
	
		private Task task;
	
	
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
	
	public void setTask(Task task) {
		this.task = task;
	}
	
	public Task getTask() {
		return task; 
	}
	
	
}

