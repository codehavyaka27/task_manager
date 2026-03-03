package com.application.task_manager.model;

public class Task {
    private Long TaskId;
    private String TaskTitle;
    private boolean TaskStatus;

    public Task(Long TaskId,String TaskTitle){
        this.TaskId=TaskId;
        this.TaskTitle=TaskTitle;
        this.TaskStatus=false;
    }

    //getters
    public Long getTaskId(){
        return TaskId;
    }

    public String getTaskTitle(){
        return TaskTitle;
    }

    public boolean isTaskStatus(){
        return TaskStatus;
    }

    //SETTERS

    public void setTaskTitle(String TaskTitle){
        this.TaskTitle=TaskTitle;
    }
    public void setTaskStatus(boolean TaskStatus){
        this.TaskStatus=TaskStatus;
    }

}
