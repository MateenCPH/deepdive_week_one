package org.TaskListApplication;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Task {

    private String title;
    private String description;
    LocalDate dueDate;

    public Task(String title, String description, LocalDate dueDate) {
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }


    @Override
    public String toString() {
        return String.format(
                "Task[Title='%s', Description='%s', DueDate=%s]",
                title,
                description,
                dueDate
        );
    }

}
