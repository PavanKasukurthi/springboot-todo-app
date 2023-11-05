package com.project.todo.service;

import java.util.List;

import com.project.todo.model.Task;

public interface TaskService {
    
    public Task createNewTask(Task task);
    public List<Task> getAllTask();
    public Task findByTaskId(Long id);
    public List<Task> findAllCompletedTask();
    public List<Task> findAllInCompleteTask();
    public void deleteTask(Long id);
    public Task updateTask(Task task);
}
