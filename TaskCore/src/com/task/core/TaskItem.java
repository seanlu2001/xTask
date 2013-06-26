package com.task.core;

import java.util.ArrayList;
import java.util.List;

public class TaskItem {

	public TaskItem(String strID)
	{
		this.strID = strID;
		this.strTaskTitle = "Task";
		listTags = new ArrayList<String>();
	}
	
	public TaskItem(String strID, String strTitle)
	{
		this.strID = strID;
		this.strTaskTitle = strTitle;
		listTags = new ArrayList<String>();
	}
	
	public String getID() {
		return strID;
	}
	
	public String getTaskTitle() {
		return strTaskTitle;
	}
	
	public void setTaskTitle(String strTaskTitle) {
		this.strTaskTitle = strTaskTitle;
	}
	
	public String getTaskContent() {
		return strTaskContent;
	}
	
	public void setTaskContent(String strTaskContent) {
		this.strTaskContent = strTaskContent;
	}

	public void AddTag(String strTag)
	{
		listTags.add(strTag);
	}
	
	public List<String> GetTags()
	{
		return listTags;
	}
	
	private String strID;
	private String strTaskTitle;
	private String strTaskContent;
	private List<String> listTags;
}
