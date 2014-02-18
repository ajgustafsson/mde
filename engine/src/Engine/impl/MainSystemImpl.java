/**
 */
package Engine.impl;

import Engine.EnginePackage;
import Engine.MainSystem;
import Engine.Permission;
import Engine.User;
import Engine.UserGroup;
import Engine.Workflow;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Main System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Engine.impl.MainSystemImpl#getWorkflows <em>Workflows</em>}</li>
 *   <li>{@link Engine.impl.MainSystemImpl#getUsers <em>Users</em>}</li>
 *   <li>{@link Engine.impl.MainSystemImpl#getUserGroups <em>User Groups</em>}</li>
 *   <li>{@link Engine.impl.MainSystemImpl#getPermissions <em>Permissions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MainSystemImpl extends MinimalEObjectImpl.Container implements MainSystem {
	/**
	 * The cached value of the '{@link #getWorkflows() <em>Workflows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkflows()
	 * @generated
	 * @ordered
	 */
	protected EList<Workflow> workflows;

	/**
	 * The cached value of the '{@link #getUsers() <em>Users</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsers()
	 * @generated
	 * @ordered
	 */
	protected EList<User> users;

	/**
	 * The cached value of the '{@link #getUserGroups() <em>User Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<UserGroup> userGroups;

	/**
	 * The cached value of the '{@link #getPermissions() <em>Permissions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermissions()
	 * @generated
	 * @ordered
	 */
	protected EList<Permission> permissions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MainSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnginePackage.Literals.MAIN_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Workflow> getWorkflows() {
		if (workflows == null) {
			workflows = new EObjectContainmentEList<Workflow>(Workflow.class, this, EnginePackage.MAIN_SYSTEM__WORKFLOWS);
		}
		return workflows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<User> getUsers() {
		if (users == null) {
			users = new EObjectContainmentEList<User>(User.class, this, EnginePackage.MAIN_SYSTEM__USERS);
		}
		return users;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserGroup> getUserGroups() {
		if (userGroups == null) {
			userGroups = new EObjectContainmentEList<UserGroup>(UserGroup.class, this, EnginePackage.MAIN_SYSTEM__USER_GROUPS);
		}
		return userGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Permission> getPermissions() {
		if (permissions == null) {
			permissions = new EObjectContainmentEList<Permission>(Permission.class, this, EnginePackage.MAIN_SYSTEM__PERMISSIONS);
		}
		return permissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void start(String userName, String workflowName) {
		
		Workflow workflow = getWorkflow(workflowName);
		for(User user : this.users){
			if(userName.equals(user.getName())){
				workflow.start(user);
			}
		}
	}

	private Workflow getWorkflow(String name) {
		for (Workflow workflow : workflows) {
			if (workflow.getName().equals(name)) {
				return workflow;
			}
		}
		throw new UnsupportedOperationException("No workflow with name: " + name + ".");
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EnginePackage.MAIN_SYSTEM__WORKFLOWS:
				return ((InternalEList<?>)getWorkflows()).basicRemove(otherEnd, msgs);
			case EnginePackage.MAIN_SYSTEM__USERS:
				return ((InternalEList<?>)getUsers()).basicRemove(otherEnd, msgs);
			case EnginePackage.MAIN_SYSTEM__USER_GROUPS:
				return ((InternalEList<?>)getUserGroups()).basicRemove(otherEnd, msgs);
			case EnginePackage.MAIN_SYSTEM__PERMISSIONS:
				return ((InternalEList<?>)getPermissions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EnginePackage.MAIN_SYSTEM__WORKFLOWS:
				return getWorkflows();
			case EnginePackage.MAIN_SYSTEM__USERS:
				return getUsers();
			case EnginePackage.MAIN_SYSTEM__USER_GROUPS:
				return getUserGroups();
			case EnginePackage.MAIN_SYSTEM__PERMISSIONS:
				return getPermissions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EnginePackage.MAIN_SYSTEM__WORKFLOWS:
				getWorkflows().clear();
				getWorkflows().addAll((Collection<? extends Workflow>)newValue);
				return;
			case EnginePackage.MAIN_SYSTEM__USERS:
				getUsers().clear();
				getUsers().addAll((Collection<? extends User>)newValue);
				return;
			case EnginePackage.MAIN_SYSTEM__USER_GROUPS:
				getUserGroups().clear();
				getUserGroups().addAll((Collection<? extends UserGroup>)newValue);
				return;
			case EnginePackage.MAIN_SYSTEM__PERMISSIONS:
				getPermissions().clear();
				getPermissions().addAll((Collection<? extends Permission>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EnginePackage.MAIN_SYSTEM__WORKFLOWS:
				getWorkflows().clear();
				return;
			case EnginePackage.MAIN_SYSTEM__USERS:
				getUsers().clear();
				return;
			case EnginePackage.MAIN_SYSTEM__USER_GROUPS:
				getUserGroups().clear();
				return;
			case EnginePackage.MAIN_SYSTEM__PERMISSIONS:
				getPermissions().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EnginePackage.MAIN_SYSTEM__WORKFLOWS:
				return workflows != null && !workflows.isEmpty();
			case EnginePackage.MAIN_SYSTEM__USERS:
				return users != null && !users.isEmpty();
			case EnginePackage.MAIN_SYSTEM__USER_GROUPS:
				return userGroups != null && !userGroups.isEmpty();
			case EnginePackage.MAIN_SYSTEM__PERMISSIONS:
				return permissions != null && !permissions.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case EnginePackage.MAIN_SYSTEM___START__STRING_STRING:
				start((String)arguments.get(0), (String)arguments.get(1));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("Need to provide username and name of the workflow to execute");
		} else {
			String userName = args[0];
			String workflowName = args[1];
			
			MainSystemImpl system = new MainSystemImpl();
			system.start(userName, workflowName);
			
		}
		
		
	}

} //MainSystemImpl
