//org.eclipse.emf.ecore.impl.EClassImpl@59ee738f (name: Transition) (instanceClassName: null) (abstract: true, interface: true)
package model;

public class Transition {
		private java.lang.String name;
	
	
		private Task previousTasks;
	
		private ResultTask resultTasks;
	
	
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
	
	public void setPreviousTasks(Task previousTasks) {
		this.previousTasks = previousTasks;
	}
	
	public Task getPreviousTasks() {
		return previousTasks; 
	}
	
	public void setResultTasks(ResultTask resultTasks) {
		this.resultTasks = resultTasks;
	}
	
	public ResultTask getResultTasks() {
		return resultTasks; 
	}
	
	
}

