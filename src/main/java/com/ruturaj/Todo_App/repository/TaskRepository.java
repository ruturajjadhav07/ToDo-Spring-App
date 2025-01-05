package com.ruturaj.Todo_App.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ruturaj.Todo_App.modal.Task;

public interface TaskRepository extends JpaRepository<Task,Long>{

    
} 