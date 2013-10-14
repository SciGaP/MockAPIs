package org.apache.airavata.scigap.administration.api;

import org.apache.airavata.scigap.api.model.Gateway;
import org.apache.airavata.scigap.api.model.User;

public interface SciGaPAdministration {
	public void registerGateway(Gateway gateway);
	public void disableGateway(Gateway gateway);
	public void unregisterGateway(Gateway gateway);
	
	public void addGatewayAdministrator(User user);
	public void disableGatewayAdministrator(User user);
	public void removeGatewayAdministrator(User user);
}
