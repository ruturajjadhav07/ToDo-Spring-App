package com.ruturaj.Todo_App.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ruturaj.Todo_App.modal.Task;
import com.ruturaj.Todo_App.repository.TaskRepository;

@Service


public class TaskService {

    private final TaskRepository taskRepository;

    private TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTask() {
        return taskRepository.findAll();
    }

    public void createTask(String title){
        Task task = new Task();
        task.setTitle(title);
        taskRepository.save(task);
    }

    public void deleteTask(Long id){
        taskRepository.deleteById(id);
    }

}
