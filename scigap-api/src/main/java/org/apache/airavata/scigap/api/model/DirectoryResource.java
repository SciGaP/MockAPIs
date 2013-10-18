package org.apache.airavata.scigap.api.model;

import java.util.List;

public interface DirectoryResource extends Resource {
	public boolean hasChildren();
	public List<Resource> getChildren();
}
