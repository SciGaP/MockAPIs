package org.apache.airavata.scigap.api;

import java.util.List;

import org.apache.airavata.scigap.api.model.ToolData;

public interface ToolRepository {
	public List<String> getToolIds();
	public ToolData getToolData(String toolId);
}
