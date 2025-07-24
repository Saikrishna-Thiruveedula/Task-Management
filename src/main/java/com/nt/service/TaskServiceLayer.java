package com.nt.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Task;
import com.nt.model.User;
import com.nt.respository.TaskRepository;
import com.nt.respository.UserRepository;

@Service
public class TaskServiceLayer implements TaskService
{
	@Autowired
	private TaskRepository taskrepo;
	@Autowired
	private UserRepository userrepo;
	@Override
	public Task createTask(Task task) {
		return taskrepo.save(task);
	}
	@Override
	public Task updateTaskbyManager(Long id, Task updatedtask) {
		Task task=taskrepo.findById(id).orElseThrow(()->new RuntimeException("Task Not found"));
		task.setTitle(updatedtask.getTitle());
		task.setDescription(updatedtask.getDescription());
        task.setTargetDate(updatedtask.getTargetDate());
		return taskrepo.save(task);
	}
	@Override
	public Task updateTaskbyEngineer(Long id, String status, Date statusDate) {
		Task task=taskrepo.findById(id).orElseThrow();
		task.setStatus(status);
		task.setStatusDate(statusDate);
		return taskrepo.save(task);
	}
	@Override
	public void deleteTask(Long id) {
		taskrepo.deleteById(id);
	}
	@Override
	public List<Task> getallTask() {
		
		return taskrepo.findAll();
	}
	

}
