package org.apache.airavata.scigap.administration.gateway.api;

import org.apache.airavata.scigap.api.model.ToolAccessData;

public interface ToolAccessDataHandler {
	public void add(ToolAccessData toolAccessInfo);
	public void remove(String tooldId);
	public void update(ToolAccessData toolAccessInfo);
	public ToolAccessData get(String toolId);
}
