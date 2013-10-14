package org.apache.airavata.scigap.api;

import java.util.List;

import org.apache.airavata.scigap.api.model.Resource;
import org.apache.airavata.scigap.api.model.Task;

public interface ExperimentController {
	public String submitTask(Task task);
	public void cancelTask(String executionID);
	public List<Resource> getTaskWorkspaceResources(String executionId);
	public void transfer(Resource fromResource, Resource toResource);
}
