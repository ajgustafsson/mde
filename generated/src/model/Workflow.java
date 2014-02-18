package model;
import java.util.HashMap;
import Engine.EnginePackage;
import Engine.impl.TaskImpl;
import Engine.TaskState;

public class Workflow {
	
//	public HashMap<String,Transition> transitions = new HashMap<String,Transition>();




	public Workflow() {}


	public static void main(String args) {
	HashMap<String,TaskImpl> tasks = new HashMap<String,TaskImpl>();

	TaskImpl Task1 = new TaskImpl();
	Task1.setName("Task1");
	Task1.setState(TaskState.NOT_PROCESSED);
	Task1.setIsEnd(false);
	Task1.setIsStart(true);
	tasks.put(Task1.getName(), Task1);
	System.out.println(Task1.getName() + Task1.getState());
	
	TaskImpl Task2 = new TaskImpl();
	Task2.setName("Task2");
	Task2.setState(TaskState.NOT_PROCESSED);
	Task2.setIsEnd(false);
	Task2.setIsStart(false);
	tasks.put(Task2.getName(), Task2);
	System.out.println(Task2.getName() + Task2.getState());
	
	TaskImpl Task3 = new TaskImpl();
	Task3.setName("Task3");
	Task3.setState(TaskState.NOT_PROCESSED);
	Task3.setIsEnd(true);
	Task3.setIsStart(false);
	tasks.put(Task3.getName(), Task3);
	System.out.println(Task3.getName() + Task3.getState());
	
}/**
    Simple simple = new Simple(simple, tasks.get("org.eclipse.emf.ecore.impl.DynamicEObjectImpl@54d09daa (eClass: org.eclipse.emf.ecore.impl.EClassImpl@7728415e (name: Task) (instanceClassName: null) (abstract: false, interface: false))"), tasks.get("org.eclipse.emf.ecore.impl.DynamicEObjectImpl@7bea6a2c (eClass: org.eclipse.emf.ecore.impl.EClassImpl@7728415e (name: Task) (instanceClassName: null) (abstract: false, interface: false))"));
	transitions.put("org.eclipse.emf.ecore.impl.DynamicEObjectImpl@5ae0ae42 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@29c7e94a (name: Simple) (instanceClassName: null) (abstract: false, interface: false))","simple");
    Simple simepl2 = new Simple(simepl2, tasks.get("org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1360f895 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@7728415e (name: Task) (instanceClassName: null) (abstract: false, interface: false))"), tasks.get("org.eclipse.emf.ecore.impl.DynamicEObjectImpl@54d09daa (eClass: org.eclipse.emf.ecore.impl.EClassImpl@7728415e (name: Task) (instanceClassName: null) (abstract: false, interface: false))"));
	transitions.put("org.eclipse.emf.ecore.impl.DynamicEObjectImpl@4c1f2f66 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@29c7e94a (name: Simple) (instanceClassName: null) (abstract: false, interface: false))","simepl2");
*/
	
	
	}		
