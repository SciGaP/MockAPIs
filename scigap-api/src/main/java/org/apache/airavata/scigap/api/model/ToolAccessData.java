package org.apache.airavata.scigap.api.model;

public interface ToolAccessData extends ToolData{
	public HostAccessData getHostAccessInfo();
	public void setHostAccessInfo(HostAccessData hostAccessInfo);
	
	public boolean isEnabled();
	public void setEnabled(boolean enabled);
}
