package org.apache.airavata.scigap.api;

import java.io.OutputStream;

import org.apache.airavata.scigap.api.model.DirectoryResource;
import org.apache.airavata.scigap.api.model.FileResource;
import org.apache.airavata.scigap.api.model.Resource;

public interface MiddlewareResourceUtils {
	public void copy(Resource fromResource, Resource toResource);
	public void move(Resource fromResource, Resource toResource);
	public void remove(Resource resource);
	public Resource[] getResources(DirectoryResource directory);
	public OutputStream read(FileResource file);
	public boolean isExist(Resource resource);
}
