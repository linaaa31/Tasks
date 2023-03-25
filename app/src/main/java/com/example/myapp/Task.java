package com.example.myapp;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "my_tasks")
public class Task {
    private String title;
    private String text;

    @PrimaryKey(autoGenerate = true)
    private int id;

    public Task(String title, String text) {
        this.title = title;
        this.text = text;
    }


    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
