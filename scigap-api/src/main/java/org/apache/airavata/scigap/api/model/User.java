package org.apache.airavata.scigap.api.model;


public interface User {
	public UserRole[] getUserRoles();
	public void addUserRole(UserRole userRole);
	public void removeUserRole(UserRole userRole);

	public UserGroup[] getUserGroupes();
	public void addUserGroup(UserGroup userGroup);
	public void removeUserGroup(UserGroup userGroup);

}
