package org.apache.airavata.scigap.administration.gateway.api;

import org.apache.airavata.scigap.api.model.User;
import org.apache.airavata.scigap.api.model.UserGroup;
import org.apache.airavata.scigap.api.model.UserRole;

public interface UserManagement {
	public void addGatewayUser(User user);
	public void removeGatewayUser(User user);
	public void disableGatewayUser(User user);
	public User[] getGatewayUsers();
	public User[] getGatewayUsers(UserRole role);
	public User[] getGatewayUsers(UserGroup group);
}
