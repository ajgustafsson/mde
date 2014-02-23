package model;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import  java.util.*;

public class Start {
	
	public static void main(String[] args) {


	//Start System generation
	MainSystem system = new MainSystem();
	
	//Start Permission generation 
	Map<String, Permission> permissions = new HashMap<>();
	Permission tempPermission;

	tempPermission = new Permission();
	tempPermission.setName("perm");
	permissions.put("perm", tempPermission);
	
	tempPermission = new Permission();
	tempPermission.setName("perm1");
	permissions.put("perm1", tempPermission);
	
	system.setPermissions(new ArrayList<Permission>(permissions.values()));	
	//End permission generation	

	//Start Usergroup generation 
	Map<String, UserGroup> userGroups = new HashMap<>();
	List<Permission> tempPermissions = new ArrayList<Permission>();
	UserGroup tempUserGroup;

	tempUserGroup = new UserGroup();
	tempUserGroup.setName("grupp");
	
	tempPermissions = new ArrayList<>();
	tempPermission = permissions.get("perm");
	tempPermissions.add(tempPermission);	
	tempPermission = permissions.get("perm1");
	tempPermissions.add(tempPermission);	
	tempUserGroup.setPermissions(tempPermissions);

	userGroups.put("grupp", tempUserGroup);
	
	system.setUserGroups(new ArrayList<UserGroup>(userGroups.values()));	
	//End usergroup generation	

	//Start User generation 
	Map<String, User> users = new HashMap<>();
	User tempUser;
	List<UserGroup> tempUserGroups = new ArrayList<>();

	tempUser = new User();
	tempUser.setName("Eva");
	tempUserGroups = new ArrayList<>();
	tempUserGroup  = userGroups.get("grupp");
	tempUserGroups.add(tempUserGroup);	
	tempUser.setGroups(tempUserGroups);
	users.put("Eva", tempUser);

	
	system.setUsers(new ArrayList<User>(users.values()));	
	//End User generation	



	//Start workflow generation
	List<Workflow> tempWorkflows = new ArrayList<Workflow>();

	
		Map<String,Transition> transitions = new HashMap<String,Transition>();
		Map<String,Task> tasks = new HashMap<String,Task>();

		//Start task generation
		Task task1 = new Task();
		task1.setName("task1");
		task1.setDescription("Detta ar den forsta tasken");

		task1.setPermission(permissions.get("perm1"));

		task1.setState(TaskState.NOT_PROCESSED);
		task1.setEnd(false);
		task1.setStart(true);
		tasks.put(task1.getName(), task1);
		System.out.println(task1.getName() + task1.getState());
		//End task generation
		Task task2 = new Task();
		task2.setName("task2");
		task2.setDescription("Detta ar task2");

		task2.setPermission(permissions.get("perm"));

		task2.setState(TaskState.NOT_PROCESSED);
		task2.setEnd(false);
		task2.setStart(false);
		tasks.put(task2.getName(), task2);
		System.out.println(task2.getName() + task2.getState());
		//End task generation
		Task p1 = new Task();
		p1.setName("p1");
		p1.setDescription("Do p1");

		p1.setPermission(permissions.get("perm"));

		p1.setState(TaskState.NOT_PROCESSED);
		p1.setEnd(false);
		p1.setStart(false);
		tasks.put(p1.getName(), p1);
		System.out.println(p1.getName() + p1.getState());
		//End task generation
		Task p2 = new Task();
		p2.setName("p2");
		p2.setDescription("Do p2");

		p2.setPermission(permissions.get("perm"));

		p2.setState(TaskState.NOT_PROCESSED);
		p2.setEnd(false);
		p2.setStart(false);
		tasks.put(p2.getName(), p2);
		System.out.println(p2.getName() + p2.getState());
		//End task generation
		Task endMaddafakka = new Task();
		endMaddafakka.setName("endMaddafakka");
		endMaddafakka.setDescription("klaaaaart!");

		endMaddafakka.setPermission(permissions.get("perm1"));

		endMaddafakka.setState(TaskState.NOT_PROCESSED);
		endMaddafakka.setEnd(true);
		endMaddafakka.setStart(false);
		tasks.put(endMaddafakka.getName(), endMaddafakka);
		System.out.println(endMaddafakka.getName() + endMaddafakka.getState());
		//End task generation

		//Start Simple transition generation
		Simple simple1 = new Simple();
					
		simple1.setName("simple1");
		Task temp = tasks.get("task1"); //Only declared in the first transition generator and then reused for the different transitions
		
		List<Task> tempList = new ArrayList<Task>(); //Only declared in the first transition generator and then reused for the different transitions
		tempList.add(temp);
		simple1.setPreviousTasks(tempList);

		List<Transition> tempList2 = new ArrayList<Transition>(); //Only declared in the first transition generator and then reused for the different transitions
		tempList2.add(simple1);
		temp.setTransition(tempList2);

		simple1.setTask(tasks.get("task2"));

		transitions.put("simple1",simple1);
		
		//End Simple transition generation

		//Start Split transition generation
		Split parallelFlowMaddafaaaaakka = new Split();
			
		parallelFlowMaddafaaaaakka.setName("parallelFlowMaddafaaaaakka");
		temp = tasks.get("task2");

		tempList = new ArrayList<Task>();
		tempList.add(temp);
		parallelFlowMaddafaaaaakka.setPreviousTasks(tempList);

		tempList2 = new ArrayList<Transition>();
		tempList2.add(parallelFlowMaddafaaaaakka);
		temp.setTransition(tempList2);

		List<Task> tempTasks = new ArrayList<>();
		tempTasks.add(tasks.get("p1")); 	
		tempTasks.add(tasks.get("p2")); 	
		
		parallelFlowMaddafaaaaakka.setTasks(tempTasks);

		transitions.put("parallelFlowMaddafaaaaakka",parallelFlowMaddafaaaaakka);
		
		//End Split transition generation

		//Start Merge transition generation
		Merge waitForParallels = new Merge();
			
		waitForParallels.setName("waitForParallels");
		
		temp = tasks.get("p1");

		tempList = new ArrayList<Task>();
		tempList2 = new ArrayList<Transition>();
		tempList2.add(waitForParallels);
		temp = tasks.get("p1");
		
		temp.setTransition(tempList2);
		tempList.add(tasks.get("p1"));
		temp = tasks.get("p2");
		
		temp.setTransition(tempList2);
		tempList.add(tasks.get("p2"));
		waitForParallels.setPreviousTasks(tempList);

		tempList2 = new ArrayList<Transition>();
		tempList2.add(waitForParallels);
		temp.setTransition(tempList2);

		waitForParallels.setTask(tasks.get("endMaddafakka"));

		transitions.put("waitForParallels",waitForParallels);
		
		//End Merge transition generation



		Workflow w1 = new Workflow();
		w1.setName("w1");
		List<Node> nodes = new ArrayList<Node>();
		nodes.addAll(transitions.values());
		nodes.addAll(tasks.values());
		w1.setNodes(nodes);
		
		tempWorkflows.add(w1);
 //End workflow generation
		system.setWorkflows(tempWorkflows);
	
		// Start of user code main
//		User user = new User();
//		user.setName("Eva");
//		UserGroup grupp = new UserGroup();
//		grupp.setName("grupp");
//		List<Permission> permList = new ArrayList<Permission>();
//		permList.add(perm);
//		permList.add(perm1);
//		grupp.setPermissions(permList);
//		List<UserGroup> gruppList = new ArrayList<UserGroup>();
//		gruppList.add(grupp);
//		user.setGroups(gruppList);
		String username = args[0];
		String workflow = args[1];
		
		system.start(username, workflow);
		
		// End of user code
    }

}

