package org.TaskListApplication;

import lombok.Getter;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

@Getter
class TaskList<T extends Task> {
    private List<T> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public void addTask(T task) {
        tasks.add(task);
    }

    public List<T> getTasks() {
        return tasks;
    }

    public List<T> filterTasksBasedOnKeyword(String keyword) {
        List<T> filteredTasks = tasks.stream()
                .filter(task -> task.getTitle().toLowerCase().contains(keyword.toLowerCase()))
                .toList();
        return filteredTasks;
    }

    public List<T> sortTasksByDueDate() {
        List<T> filteredTasks = tasks.stream()
                .sorted(Comparator.comparing(Task::getDueDate))
                .toList();
        return filteredTasks;
    }

    public List<T> displayTasksDueToday() {
        //LocalDate today = LocalDate.now();
        List<T> filteredTasks = tasks.stream()
                .filter(task -> task.getDueDate().isEqual(LocalDate.now()))
                .toList();
        return filteredTasks;
    }

    public List<T> displayTasksOverdue() {
        List<T> filteredTasks = tasks.stream()
                .filter(task -> task.getDueDate().isBefore(LocalDate.now()))
                .toList();
        return filteredTasks;
    }




}
