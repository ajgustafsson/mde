package model;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import  java.util.*;

public class Start {
	
	public static void main() {
		Map<String,Transition> transitions = new HashMap<String,Transition>();
		Map<String,Task> tasks = new HashMap<String,Task>();

		Task myStart = new Task();
		myStart.setName("myStart");
		myStart.setDescription("do start");

		Permission Banking = new Permission();
		Banking.setName("Banking");
		myStart.setPermission(Banking);

		myStart.setState(TaskState.NOT_PROCESSED);
		myStart.setEnd(false);
		myStart.setStart(true);
		tasks.put(myStart.getName(), myStart);
		System.out.println(myStart.getName() + myStart.getState());

		Task myEnd = new Task();
		myEnd.setName("myEnd");
		myEnd.setDescription("do end");

		Permission Public = new Permission();
		Public.setName("Public");
		myEnd.setPermission(Public);

		myEnd.setState(TaskState.NOT_PROCESSED);
		myEnd.setEnd(true);
		myEnd.setStart(false);
		tasks.put(myEnd.getName(), myEnd);
		System.out.println(myEnd.getName() + myEnd.getState());

		Simple mySimple = new Simple();
			
		
		mySimple.setName("mySimple");
		Task temp = tasks.get("myStart");

		List<Task> tempList = new ArrayList<Task>();
		tempList.add(temp);
		mySimple.setPreviousTasks(tempList);

		List<Transition> tempList2 = new ArrayList<Transition>();
		tempList2.add(mySimple);
		temp.setTransition(tempList2);

		mySimple.setTask(tasks.get("myEnd"));

		transitions.put("mySimple",mySimple);
		

		Workflow w1 = new Workflow();
		List<Node> nodes = new ArrayList<Node>();
		nodes.addAll(transitions.values());
		nodes.addAll(tasks.values());
		w1.setNodes(nodes);
		
	
		// Start of user code main
		//
		// End of user code
    }

}

