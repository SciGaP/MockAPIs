package org.apache.airavata.scigap.api;

import java.util.List;

import org.apache.airavata.scigap.api.model.ToolInfo;

public interface ToolRepository {
	public List<String> getToolIds();
	public ToolInfo getToolInformation(String toolId);
}
