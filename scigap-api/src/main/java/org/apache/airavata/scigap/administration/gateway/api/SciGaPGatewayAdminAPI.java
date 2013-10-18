package org.apache.airavata.scigap.administration.gateway.api;



public interface SciGaPGatewayAdminAPI {
	public ResourceIdentityManagement getResourceIdentityManagement();
	public UserManagement getUserManagement();
	public ToolAccessDataHandler getToolAccessDataHandler();
	public RemoteHostAccessDataHandler getRemoteHostAccessDataHandler();
}
