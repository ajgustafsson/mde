//org.eclipse.emf.ecore.impl.EClassImpl@5f3aa034 (name: Switch) (instanceClassName: null) (abstract: false, interface: false)
package model;

public class Switch {
		private java.lang.String name;
	
	
		private Task previousTasks;
	
		private Task tasks;
	
	
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
	
	public void setTasks(Task tasks) {
		this.tasks = tasks;
	}
	
	public Task getTasks() {
		return tasks; 
	}
	
	
}

