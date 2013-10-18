package org.apache.airavata.scigap.administration.gateway.api;

import org.apache.airavata.scigap.api.model.HostAccessData;

public interface RemoteHostAccessDataHandler {
	public void add(HostAccessData hostAccessInfo);
	public void remove(String hostId);
	public void update(HostAccessData hostAccessInfo);
	public HostAccessData get(String hostId);
}
