//org.eclipse.emf.ecore.impl.EClassImpl@40c1b4df (name: Workflow) (instanceClassName: null) (abstract: false, interface: false)
package model;

import java.util.*;
public class Workflow {

		private java.lang.String name;
	
	
		private List<Node> nodes;
	
	
	public void start() {
		// Start of user code start
		// TODO should be implemented
		// End of user code
	}
	
	
	public void setName(java.lang.String name) {
		this.name = name;
	}
	
	public java.lang.String getName() {
		return name; 
	}
	
	public void setNodes(List<Node> nodes) {
		this.nodes = nodes;
	}
	
	public List<Node> getNodes() {
		return nodes; 
	}
	
	
}

