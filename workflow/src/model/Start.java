package model;
import java.util.Map;
import java.util.HashMap;

public class Start {
	
	public static void main() {
		Map<String,Transition> transitions = new HashMap<String,Transition>();
		Map<String,Task> tasks = new HashMap<String,Task>();

		Task myStart = new Task();
		myStart.setName("myStart");
		myStart.setState(TaskState.NOT_PROCESSED);
		myStart.setEnd(false);
		myStart.setStart(true);
		tasks.put(myStart.getName(), myStart);
		System.out.println(myStart.getName() + myStart.getState());

		Task myEnd = new Task();
		myEnd.setName("myEnd");
		myEnd.setState(TaskState.NOT_PROCESSED);
		myEnd.setEnd(true);
		myEnd.setStart(false);
		tasks.put(myEnd.getName(), myEnd);
		System.out.println(myEnd.getName() + myEnd.getState());

		Simple mySimple = new Simple();
		mySimple.setName("mySimple");
		org.eclipse.emf.ecore.impl.DynamicEObjectImpl@34daf85d (eClass: org.eclipse.emf.ecore.impl.EClassImpl@3a04da90 (name: Simple) (instanceClassName: null) (abstract: false, interface: false))
		mySimple.setTask(tasks.get("myStart"));
		mySimple.setTask(tasks.get("myEnd"));

		transitions.put("org.eclipse.emf.ecore.impl.DynamicEObjectImpl@34daf85d (eClass: org.eclipse.emf.ecore.impl.EClassImpl@3a04da90 (name: Simple) (instanceClassName: null) (abstract: false, interface: false))","mySimple");

	
    }

}

