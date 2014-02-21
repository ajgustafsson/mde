package model;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import  java.util.*;

public class Start {
	
	public static void main(String[] args) {
		Map<String,Transition> transitions = new HashMap<String,Transition>();
		Map<String,Task> tasks = new HashMap<String,Task>();

		Task task1 = new Task();
		task1.setName("task1");
		task1.setDescription("Detta ar den forsta tasken");

		Permission perm1 = new Permission();
		perm1.setName("perm1");
		task1.setPermission(perm1);

		task1.setState(TaskState.NOT_PROCESSED);
		task1.setEnd(false);
		task1.setStart(true);
		tasks.put(task1.getName(), task1);
		System.out.println(task1.getName() + task1.getState());

		Task task2 = new Task();
		task2.setName("task2");
		task2.setDescription("Detta ar task2");

		Permission perm = new Permission();
		perm.setName("perm");
		task2.setPermission(perm);

		task2.setState(TaskState.NOT_PROCESSED);
		task2.setEnd(true);
		task2.setStart(false);
		tasks.put(task2.getName(), task2);
		System.out.println(task2.getName() + task2.getState());

		Simple simple1 = new Simple();
			
		
		simple1.setName("simple1");
		Task temp = tasks.get("task1");

		List<Task> tempList = new ArrayList<Task>();
		tempList.add(temp);
		simple1.setPreviousTasks(tempList);

		List<Transition> tempList2 = new ArrayList<Transition>();
		tempList2.add(simple1);
		temp.setTransition(tempList2);

		simple1.setTask(tasks.get("task2"));

		transitions.put("simple1",simple1);
		

		Workflow w1 = new Workflow();
		List<Node> nodes = new ArrayList<Node>();
		nodes.addAll(transitions.values());
		nodes.addAll(tasks.values());
		w1.setNodes(nodes);
		
	
		// Start of user code main
		User user = new User();
		user.setName("Eva");
		UserGroup grupp = new UserGroup();
		grupp.setName("grupp");
		List<Permission> permList = new ArrayList<Permission>();
		permList.add(perm);
		permList.add(perm1);
		grupp.setPermissions(permList);
		List<UserGroup> gruppList = new ArrayList<UserGroup>();
		gruppList.add(grupp);
		user.setGroups(gruppList);
		w1.start(user);
		// End of user code
    }

}

