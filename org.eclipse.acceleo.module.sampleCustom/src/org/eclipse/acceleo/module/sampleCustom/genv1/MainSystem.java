
package org.eclipse.acceleo.module.sampleCustom.genv1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Engine.EngineFactory;
import Engine.Node;
import Engine.Task;
import Engine.TaskState;
import Engine.Workflow;

public class MainSystem {
	
	Map<String, Workflow> workflows = new HashMap<>();
	
	public MainSystem() {
		

		Workflow w1 = EngineFactory.eINSTANCE.createWorkflow();
		List<Node> nodes = w1.getNodes();
		
			Task Task1 = EngineFactory.eINSTANCE.createTask();
			Task1.setName("Task1");
			Task1.setState(TaskState.NOT_PROCESSED);
			Task1.setEnd(false);
			Task1.setStart(true);
//			nodes.put(Task1.getName(), Task1);
			System.out.println(Task1.getName() + Task1.getState());

			
		
			Task Task2 = EngineFactory.eINSTANCE.createTask();
			Task2.setName("Task2");
			Task2.setState(TaskState.NOT_PROCESSED);
			Task2.setEnd(true);
			Task2.setStart(false);
//			nodes.put(Task2.getName(), Task2);
			System.out.println(Task2.getName() + Task2.getState());

			

	workflows.put("w1", w1);
	}


}
	


