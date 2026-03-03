package com.application.task_manager.service;
import com.application.task_manager.model.Task;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {
 private List<Task> tasks=new ArrayList<>();
 private Long counter=1L;

 public Task addTask(String TaskTitle){
     Task task=new Task(counter++,TaskTitle);
     tasks.add(task);
     return task;
 }

 public List<Task> getAllTasks(){
     return tasks;
 }

 public void deleteTask(Long id){
     tasks.removeIf(task->task.getTaskId().equals(id));
 }

 public Task toggleTask(Long id){
     for(Task task:tasks){
         if(task.getTaskId().equals(id)){
            task.setTaskStatus(!task.isTaskStatus());
            return task;
         }
     }
     return null;
 }
}
