
package com.nt.service;

import java.sql.Date;
import java.util.List;

import com.nt.model.Task;
import com.nt.model.User;

public interface TaskService 
{
	Task createTask(Task task);
	Task updateTaskbyManager(Long id,Task updatedtask);
	Task updateTaskbyEngineer(Long id, String status, Date statusDate);
	void deleteTask(Long id);
	List<Task>getallTask();
}
