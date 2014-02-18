package model;
import java.util.HashMap;
import Engine.EnginePackage;
import Engine.impl.TaskImpl;
import Engine.TaskState;

public class Workflow {
	
//	public HashMap<String,Transition> transitions = new HashMap<String,Transition>();




	public Workflow() {}


	public static void main(String[] args) {
	HashMap<String,TaskImpl> tasks = new HashMap<String,TaskImpl>();

	TaskImpl Task1 = new TaskImpl();
	Task1.setName("Task1");
	Task1.setState(TaskState.NOT_PROCESSED);
	Task1.setEnd(false);
	Task1.setStart(true);
	tasks.put(Task1.getName(), Task1);
	System.out.println(Task1.getName() + Task1.getState());
	
	TaskImpl Task2 = new TaskImpl();
	Task2.setName("Task2");
	Task2.setState(TaskState.NOT_PROCESSED);
	Task2.setEnd(true);
	Task2.setStart(false);
	tasks.put(Task2.getName(), Task2);
	System.out.println(Task2.getName() + Task2.getState());
	
}/**
    Simple simple1 = new Simple(simple1, tasks.get("org.eclipse.emf.ecore.impl.DynamicEObjectImpl@5f19106d (eClass: org.eclipse.emf.ecore.impl.EClassImpl@17428f15 (name: Task) (instanceClassName: null) (abstract: false, interface: false))"), tasks.get("org.eclipse.emf.ecore.impl.DynamicEObjectImpl@65ff1e0e (eClass: org.eclipse.emf.ecore.impl.EClassImpl@17428f15 (name: Task) (instanceClassName: null) (abstract: false, interface: false))"));
	transitions.put("org.eclipse.emf.ecore.impl.DynamicEObjectImpl@500e5d72 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@6624849b (name: Simple) (instanceClassName: null) (abstract: false, interface: false))","simple1");
*/
	
	
	}		
