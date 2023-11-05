package com.project.todo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.todo.model.Task;
import com.project.todo.repository.TaskRepository;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public Task createNewTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public List<Task> getAllTask() {
        return taskRepository.findAll();
    }

    @Override
    public Task findByTaskId(Long id) {
        return taskRepository.getById(id);
    }

    @Override
    public List<Task> findAllCompletedTask() {
        return taskRepository.findByCompletedTrue();
    }

    @Override
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }

    @Override
    public Task updateTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public List<Task> findAllInCompleteTask() {
        return taskRepository.findByCompletedFalse();
    }
    
}
