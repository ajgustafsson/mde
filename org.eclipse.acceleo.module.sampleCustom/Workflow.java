import 

public class Workflow {

	public HashMap<String,Task> tasks = new HashMap<String,Task>();
	public HashMap<String,Transition> transitions = new HashMap<String,Transition>();




	public myWorkFlow {
    Task Task1 = new Task(, NOT_PROCESSED, false, true, null);
	tasks.put(org.eclipse.emf.ecore.impl.DynamicEObjectImpl@575e96c5 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@3fbe59d5 (name: Task) (instanceClassName: null) (abstract: false, interface: false)),Task1);
    Task Task2 = new Task(, NOT_PROCESSED, false, false, null);
	tasks.put(org.eclipse.emf.ecore.impl.DynamicEObjectImpl@12609ead (eClass: org.eclipse.emf.ecore.impl.EClassImpl@3fbe59d5 (name: Task) (instanceClassName: null) (abstract: false, interface: false)),Task2);
    Task Task3 = new Task(, NOT_PROCESSED, false, false, null);
	tasks.put(org.eclipse.emf.ecore.impl.DynamicEObjectImpl@27f168b2 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@3fbe59d5 (name: Task) (instanceClassName: null) (abstract: false, interface: false)),Task3);
    Task Task6 = new Task(, NOT_PROCESSED, false, false, null);
	tasks.put(org.eclipse.emf.ecore.impl.DynamicEObjectImpl@7608eaa7 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@3fbe59d5 (name: Task) (instanceClassName: null) (abstract: false, interface: false)),Task6);
    Task Task5 = new Task(, NOT_PROCESSED, false, false, null);
	tasks.put(org.eclipse.emf.ecore.impl.DynamicEObjectImpl@4365b67b (eClass: org.eclipse.emf.ecore.impl.EClassImpl@3fbe59d5 (name: Task) (instanceClassName: null) (abstract: false, interface: false)),Task5);
    Task  = new Task(, NOT_PROCESSED, true, false, null);
	tasks.put(org.eclipse.emf.ecore.impl.DynamicEObjectImpl@41c82bb0 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@3fbe59d5 (name: Task) (instanceClassName: null) (abstract: false, interface: false)),);

    Simple simple = new Simple(simple, tasks.get(org.eclipse.emf.ecore.impl.DynamicEObjectImpl@12609ead (eClass: org.eclipse.emf.ecore.impl.EClassImpl@3fbe59d5 (name: Task) (instanceClassName: null) (abstract: false, interface: false))), tasks.get(org.eclipse.emf.ecore.impl.DynamicEObjectImpl@575e96c5 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@3fbe59d5 (name: Task) (instanceClassName: null) (abstract: false, interface: false))));
	transitions.put(org.eclipse.emf.ecore.impl.DynamicEObjectImpl@2fc8c53 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@444622e0 (name: Simple) (instanceClassName: null) (abstract: false, interface: false)),simple);
    Simple simepl2 = new Simple(simepl2, tasks.get(org.eclipse.emf.ecore.impl.DynamicEObjectImpl@27f168b2 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@3fbe59d5 (name: Task) (instanceClassName: null) (abstract: false, interface: false))), tasks.get(org.eclipse.emf.ecore.impl.DynamicEObjectImpl@12609ead (eClass: org.eclipse.emf.ecore.impl.EClassImpl@3fbe59d5 (name: Task) (instanceClassName: null) (abstract: false, interface: false))));
	transitions.put(org.eclipse.emf.ecore.impl.DynamicEObjectImpl@5517948 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@444622e0 (name: Simple) (instanceClassName: null) (abstract: false, interface: false)),simepl2);
	
	Merge Merge = new Merge(Merge, tasks.get(), tasks.get(org.eclipse.emf.ecore.impl.DynamicEObjectImpl@4365b67b (eClass: org.eclipse.emf.ecore.impl.EClassImpl@3fbe59d5 (name: Task) (instanceClassName: null) (abstract: false, interface: false))org.eclipse.emf.ecore.impl.DynamicEObjectImpl@7608eaa7 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@3fbe59d5 (name: Task) (instanceClassName: null) (abstract: false, interface: false))));
	transitions.put(org.eclipse.emf.ecore.impl.DynamicEObjectImpl@4aaf67ce (eClass: org.eclipse.emf.ecore.impl.EClassImpl@34227d25 (name: Merge) (instanceClassName: null) (abstract: false, interface: false)),Merge);

	

	Transition t = transitions.get(org.eclipse.emf.ecore.impl.DynamicEObjectImpl@2fc8c53 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@444622e0 (name: Simple) (instanceClassName: null) (abstract: false, interface: false)));
	Task temp = tasks.get(org.eclipse.emf.ecore.impl.DynamicEObjectImpl@575e96c5 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@3fbe59d5 (name: Task) (instanceClassName: null) (abstract: false, interface: false)));
	temp.setTransition(t);
	Transition t = transitions.get(org.eclipse.emf.ecore.impl.DynamicEObjectImpl@5517948 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@444622e0 (name: Simple) (instanceClassName: null) (abstract: false, interface: false)));
	Task temp = tasks.get(org.eclipse.emf.ecore.impl.DynamicEObjectImpl@12609ead (eClass: org.eclipse.emf.ecore.impl.EClassImpl@3fbe59d5 (name: Task) (instanceClassName: null) (abstract: false, interface: false)));
	temp.setTransition(t);
	Transition t = transitions.get(org.eclipse.emf.ecore.impl.DynamicEObjectImpl@5a10929a (eClass: org.eclipse.emf.ecore.impl.EClassImpl@12fd4e58 (name: Split) (instanceClassName: null) (abstract: false, interface: false)));
	Task temp = tasks.get(org.eclipse.emf.ecore.impl.DynamicEObjectImpl@27f168b2 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@3fbe59d5 (name: Task) (instanceClassName: null) (abstract: false, interface: false)));
	temp.setTransition(t);
	Transition t = transitions.get(org.eclipse.emf.ecore.impl.DynamicEObjectImpl@5a10929a (eClass: org.eclipse.emf.ecore.impl.EClassImpl@12fd4e58 (name: Split) (instanceClassName: null) (abstract: false, interface: false))org.eclipse.emf.ecore.impl.DynamicEObjectImpl@4aaf67ce (eClass: org.eclipse.emf.ecore.impl.EClassImpl@34227d25 (name: Merge) (instanceClassName: null) (abstract: false, interface: false)));
	Task temp = tasks.get(org.eclipse.emf.ecore.impl.DynamicEObjectImpl@7608eaa7 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@3fbe59d5 (name: Task) (instanceClassName: null) (abstract: false, interface: false)));
	temp.setTransition(t);
	Transition t = transitions.get(org.eclipse.emf.ecore.impl.DynamicEObjectImpl@5a10929a (eClass: org.eclipse.emf.ecore.impl.EClassImpl@12fd4e58 (name: Split) (instanceClassName: null) (abstract: false, interface: false))org.eclipse.emf.ecore.impl.DynamicEObjectImpl@4aaf67ce (eClass: org.eclipse.emf.ecore.impl.EClassImpl@34227d25 (name: Merge) (instanceClassName: null) (abstract: false, interface: false)));
	Task temp = tasks.get(org.eclipse.emf.ecore.impl.DynamicEObjectImpl@4365b67b (eClass: org.eclipse.emf.ecore.impl.EClassImpl@3fbe59d5 (name: Task) (instanceClassName: null) (abstract: false, interface: false)));
	temp.setTransition(t);
	Transition t = transitions.get();
	Task temp = tasks.get(org.eclipse.emf.ecore.impl.DynamicEObjectImpl@41c82bb0 (eClass: org.eclipse.emf.ecore.impl.EClassImpl@3fbe59d5 (name: Task) (instanceClassName: null) (abstract: false, interface: false)));
	temp.setTransition(t);

	
	
	}		
}
