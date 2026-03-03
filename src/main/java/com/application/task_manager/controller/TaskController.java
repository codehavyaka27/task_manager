package com.application.task_manager.controller;
import com.application.task_manager.model.Task;
import com.application.task_manager.service.TaskService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
@CrossOrigin
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService){
        this.taskService=taskService;
    }

    public Task addTask(@RequestBody Task task){
        return taskService.addTask(task.getTaskTitle());
    }

    @GetMapping
    public List<Task> getAllTasks(){
        return taskService.getAllTasks();
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id){
        taskService.deleteTask(id);
    }

    @PutMapping("/{id}")
    public Task toggleTask(@PathVariable Long id){
        return taskService.toggleTask(id);
    }
}
