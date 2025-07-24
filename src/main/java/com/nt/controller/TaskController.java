package com.nt.controller;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.nt.model.Task;
import com.nt.service.TaskService;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    private TaskService taskservice;

    @GetMapping
    public List<Task> getallTasks() {
        return taskservice.getallTask();
    }

    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return taskservice.createTask(task);
    }

    @PostMapping("/{id}/manager")
    public Task updateTaskbyManager(@PathVariable Long id, @RequestBody Task task) {
        return taskservice.updateTaskbyManager(id, task);
    }

    @PutMapping("/{id}/engineer")
    public Task updateTaskbyEngineer(@PathVariable Long id, @RequestBody Map<String, String> payload) {
        String status = payload.get("status");
        Date statusDate = Date.valueOf(payload.get("statusDate")); // Format: yyyy-MM-dd
        return taskservice.updateTaskbyEngineer(id, status, statusDate);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteTask(@PathVariable Long id) {
        taskservice.deleteTask(id);
        return ResponseEntity.ok("Deleted");
    }
}
