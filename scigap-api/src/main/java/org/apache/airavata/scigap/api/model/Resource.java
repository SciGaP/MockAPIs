package org.apache.airavata.scigap.api.model;

import java.util.Date;

public interface Resource {
	public ResourceLocator getResourceLocator();
	public String getName();
	public int getType();
	public Date getCreationDate();
	public Date getModificationDate();
	
}
