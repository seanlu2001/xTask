package com.task.core;

import java.util.HashMap;
import java.util.Map;

public class TaskCore {

	public TaskCore()
	{
		mapItem = new HashMap<String, TaskItem>();
	}
	
	public void InitConnection()
	{
		
	}
	
	public TaskItem GetItemByID(String strID)
	{	
		return mapItem.get(strID);
	}
	
	public Map<String, TaskItem> GetTaskList()
	{
		return mapItem;
	}
	
	private Map<String, TaskItem> mapItem;
	private String strToken;
}
