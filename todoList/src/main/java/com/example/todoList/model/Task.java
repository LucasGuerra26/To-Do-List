package com.example.todoList.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Task {
    @Id
    private long id;

    private String title;
    private String description;
    private boolean completed;

    public void task (String title, String description){
        this.title = title;
        this.description = description;
        completed = false;
    }


    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
