//org.eclipse.emf.ecore.impl.EClassImpl@18e8dae5 (name: ResultTask) (instanceClassName: null) (abstract: false, interface: false)
package model;

public class ResultTask {
		private java.lang.String ResultName;
	
		private int Result;
	
	
		private Task task;
	
	
	
	public void setResultName(java.lang.String ResultName) {
		this.ResultName = ResultName;
	}
	
	public java.lang.String getResultName() {
		return ResultName; 
	}
	
	public void setResult(int Result) {
		this.Result = Result;
	}
	
	public int getResult() {
		return Result; 
	}
	
	public void setTask(Task task) {
		this.task = task;
	}
	
	public Task getTask() {
		return task; 
	}
	
	
}

