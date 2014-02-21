package model;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import  java.util.*;

public class Start {
	
	public static void main(String[] args) {
		Map<String,Transition> transitions = new HashMap<String,Transition>();
		Map<String,Task> tasks = new HashMap<String,Task>();


		
	
		// Start of user code main
		User user = new User();
		user.setName("Eva");
		Permission perm = new Permission();
		perm.setName("perm");
		UserGroup grupp = new UserGroup();
		grupp.setName("grupp");
		List<Permission> permList = new ArrayList<Permission>();
		permList.add(perm);
		grupp.setPermissions(permList);
		List<UserGroup> gruppList = new ArrayList<UserGroup>();
		user.setGroups(gruppList);
		w1.start(user);
		// End of user code
    }

}

