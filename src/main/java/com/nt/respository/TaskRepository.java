package com.nt.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.model.Task;
import com.nt.model.User;

public interface TaskRepository extends JpaRepository<Task, Long>
{
	List<Task> findAll();
}
