package org.apache.airavata.scigap.administration.gateway.api;

import java.util.List;

import org.apache.airavata.scigap.api.model.Identity;

public interface ResourceIdentityManagement {
	public void registerIdentity(Identity identity);
	public void unregisterIdentity(Identity identity);
	public List<Identity> getIdentities();
}
