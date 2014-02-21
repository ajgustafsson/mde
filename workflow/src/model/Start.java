package model;
import java.util.HashMap;

public class Start {
	
	public static void main() {
		Map<String,Transition> transitions = new HashMap<String,Transition>();
		Map<String,Task> tasks = new HashMap<String,Task>();

		Task Customer wants a bank loan = new Task();
		Customer wants a bank loan.setName("Customer wants a bank loan");
		Customer wants a bank loan.setState(TaskState.NOT_PROCESSED);
		Customer wants a bank loan.setEnd(false);
		Customer wants a bank loan.setStart(true);
		tasks.put(Customer wants a bank loan.getName(), Customer wants a bank loan);
		System.out.println(Customer wants a bank loan.getName() + Customer wants a bank loan.getState());

		Task Is the customer credit worthy? = new Task();
		Is the customer credit worthy?.setName("Is the customer credit worthy?");
		Is the customer credit worthy?.setState(TaskState.NOT_PROCESSED);
		Is the customer credit worthy?.setEnd(true);
		Is the customer credit worthy?.setStart(false);
		tasks.put(Is the customer credit worthy?.getName(), Is the customer credit worthy?);
		System.out.println(Is the customer credit worthy?.getName() + Is the customer credit worthy?.getState());

		Task Determine size of bank loan = new Task();
		Determine size of bank loan.setName("Determine size of bank loan");
		Determine size of bank loan.setState(TaskState.NOT_PROCESSED);
		Determine size of bank loan.setEnd(false);
		Determine size of bank loan.setStart(false);
		tasks.put(Determine size of bank loan.getName(), Determine size of bank loan);
		System.out.println(Determine size of bank loan.getName() + Determine size of bank loan.getState());

		Task  = new Task();
		.setName("");
		.setState(TaskState.NOT_PROCESSED);
		.setEnd(false);
		.setStart(false);
		tasks.put(.getName(), );
		System.out.println(.getName() + .getState());

		Task Denied = new Task();
		Denied.setName("Denied");
		Denied.setState(TaskState.NOT_PROCESSED);
		Denied.setEnd(false);
		Denied.setStart(false);
		tasks.put(Denied.getName(), Denied);
		System.out.println(Denied.getName() + Denied.getState());

		Simple Check if worthy = new Task();
		Check if worthy.setName(Check if worthy);
		Check if worthy.setTask(org.eclipse.emf.ecore.impl.DynamicEObjectImpl@c543a2 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@6c02fbbf (name: Task) (instanceClassName: null) (abstract: false, interface: false)));
		Check if worthy.setPreviousTask(org.eclipse.emf.ecore.impl.DynamicEObjectImpl@366cbe67 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@6c02fbbf (name: Task) (instanceClassName: null) (abstract: false, interface: false)));
		transitions.put("org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1d48781b (eClass: org.eclipse.emf.ecore.impl.EClassImpl@51df61e4 (name: Simple) (instanceClassName: null) (abstract: false, interface: false))","Check if worthy");

		Simple choose type = new invalid();
		choose type.setName(choose type);
		choose type.setTask();
		choose type.setPreviousTask();
		transitions.put("org.eclipse.emf.ecore.impl.DynamicEObjectImpl@61f03ed0 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@51df61e4 (name: Simple) (instanceClassName: null) (abstract: false, interface: false))","choose type");

	
    }

}

