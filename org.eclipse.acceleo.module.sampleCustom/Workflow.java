public class Workflow {

	public HashMap<String,Task> tasks = new HashMap<String,Task>();
	public HashMap<String,Transition> transitions = new HashMap<String,Transition>();




	public myWorkFlow {
    Task Task1 = new Task(, NOT_PROCESSED, false, true, null);
	tasks.put(org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1623605e (eClass: org.eclipse.emf.ecore.impl.EClassImpl@3fbe59d5 (name: Task) (instanceClassName: null) (abstract: false, interface: false)),Task1);
    Task Task2 = new Task(, NOT_PROCESSED, false, false, null);
	tasks.put(org.eclipse.emf.ecore.impl.DynamicEObjectImpl@4ca07de0 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@3fbe59d5 (name: Task) (instanceClassName: null) (abstract: false, interface: false)),Task2);
    Task Task3 = new Task(, NOT_PROCESSED, true, false, null);
	tasks.put(org.eclipse.emf.ecore.impl.DynamicEObjectImpl@42ef8f37 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@3fbe59d5 (name: Task) (instanceClassName: null) (abstract: false, interface: false)),Task3);
    Simple simple = new Simple(simple, tasks.get(org.eclipse.emf.ecore.impl.DynamicEObjectImpl@4ca07de0 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@3fbe59d5 (name: Task) (instanceClassName: null) (abstract: false, interface: false))), tasks.get(org.eclipse.emf.ecore.impl.DynamicEObjectImpl@1623605e (eClass: org.eclipse.emf.ecore.impl.EClassImpl@3fbe59d5 (name: Task) (instanceClassName: null) (abstract: false, interface: false))));
	transitions.put(org.eclipse.emf.ecore.impl.DynamicEObjectImpl@6c8bc6ac (eClass: org.eclipse.emf.ecore.impl.EClassImpl@444622e0 (name: Simple) (instanceClassName: null) (abstract: false, interface: false)),simple);
    Simple simepl2 = new Simple(simepl2, tasks.get(org.eclipse.emf.ecore.impl.DynamicEObjectImpl@42ef8f37 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@3fbe59d5 (name: Task) (instanceClassName: null) (abstract: false, interface: false))), tasks.get(org.eclipse.emf.ecore.impl.DynamicEObjectImpl@4ca07de0 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@3fbe59d5 (name: Task) (instanceClassName: null) (abstract: false, interface: false))));
	transitions.put(org.eclipse.emf.ecore.impl.DynamicEObjectImpl@3ca8246d (eClass: org.eclipse.emf.ecore.impl.EClassImpl@444622e0 (name: Simple) (instanceClassName: null) (abstract: false, interface: false)),simepl2);
	
	
	}		
}
