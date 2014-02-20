package model;
import java.util.Map;
import Engine.EnginePackage;
import Engine.impl.TaskImpl;
import Engine.TaskState;

public class Workflow {
	
//	public HashMap<String,Transition> transitions = new HashMap<String,Transition>();




	public Workflow() {}


	public static void main(String args) {
		Map<String,TaskImpl> tasks = new HashMap<String,TaskImpl>();
	
		
			Task Task1 = EngineFactory.createTask();
			Task1.setName("Task1");
			Task1.setState(TaskState.NOT_PROCESSED);
			Task1.setEnd(false);
			Task1.setStart(true);
			tasks.put(Task1.getName(), Task1);
			tasks.put("asdf", org.eclipse.emf.ecore.impl.DynamicEObjectImpl@35a0f224 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@6470c46 (name: Task) (instanceClassName: null) (abstract: false, interface: false)));
			System.out.println(Task1.getName() + Task1.getState());
			
		
			Task Task2 = EngineFactory.createTask();
			Task2.setName("Task2");
			Task2.setState(TaskState.NOT_PROCESSED);
			Task2.setEnd(true);
			Task2.setStart(false);
			tasks.put(Task2.getName(), Task2);
			tasks.put("asdf", org.eclipse.emf.ecore.impl.DynamicEObjectImpl@2485fbef (eClass: org.eclipse.emf.ecore.impl.EClassImpl@6470c46 (name: Task) (instanceClassName: null) (abstract: false, interface: false)));
			System.out.println(Task2.getName() + Task2.getState());
			
	}
    SimpleImpl simple1 = new SimpleImpl(simple1, tasks.get("org.eclipse.emf.ecore.impl.DynamicEObjectImpl@2485fbef (eClass: org.eclipse.emf.ecore.impl.EClassImpl@6470c46 (name: Task) (instanceClassName: null) (abstract: false, interface: false))"), tasks.get("org.eclipse.emf.ecore.impl.DynamicEObjectImpl@35a0f224 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@6470c46 (name: Task) (instanceClassName: null) (abstract: false, interface: false))"));
	simple1.setName(simple1);
	simple1.setTask(org.eclipse.emf.ecore.impl.DynamicEObjectImpl@2485fbef (eClass: org.eclipse.emf.ecore.impl.EClassImpl@6470c46 (name: Task) (instanceClassName: null) (abstract: false, interface: false)));
	transitions.put("org.eclipse.emf.ecore.impl.DynamicEObjectImpl@597934fd (eClass: org.eclipse.emf.ecore.impl.EClassImpl@689a5e1b (name: Simple) (instanceClassName: null) (abstract: false, interface: false))","simple1");
	
	
	}		
