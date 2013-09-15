package com.task.core;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

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
	
	public void AddTaskItem(String strTitle, String strContent)
	{
		TaskItem item = new TaskItem(UUID.randomUUID().toString(), strTitle, strContent);
		mapItem.put(item.getID(), item);
	}
	
	private Map<String, TaskItem> mapItem;
	private String strToken;
}
