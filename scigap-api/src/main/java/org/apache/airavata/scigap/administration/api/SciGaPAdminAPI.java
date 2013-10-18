package org.apache.airavata.scigap.administration.api;

import org.apache.airavata.scigap.api.model.Gateway;
import org.apache.airavata.scigap.api.model.User;

public interface SciGaPAdminAPI {
	public void registerGateway(Gateway gateway);
	public void disableGateway(Gateway gateway);
	public void unregisterGateway(Gateway gateway);
	
	public Gateway[] getGateways();
	
	public void addGatewayAdministrator(Gateway gateway, User user);
	public void disableGatewayAdministrator(Gateway gateway, User user);
	public void removeGatewayAdministrator(Gateway gateway, User user);
	public User[] getGatewayAdministrators(Gateway gateway);
}
