package org.TaskListApplication;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TaskList taskList = new TaskList<>();

        taskList.addTask(new Task("Buy Groceries", "Buy milk, eggs, and bread",
                LocalDate.of(2024, 8, 23)));
        taskList.addTask(new Task("Pay Bills", "Pay electricity and water bills",
                LocalDate.of(2024, 8, 10)));
        taskList.addTask(new Task("Car Maintenance", "Change oil and check tire pressure",
                LocalDate.of(2024, 8, 26)));
        taskList.addTask(new Task("Prepare Presentation", "Prepare slides for Monday's meeting",
                LocalDate.of(2024, 8, 27)));
        taskList.addTask(new Task("Doctor Appointment", "Annual check-up with Dr. Smith",
                LocalDate.of(2024, 8, 28)));

        // Creating 5 GardenTask objects with realistic data and specific future dates
        taskList.addTask(new GardenTask("Water Plants", "Water all plants in the backyard",
                LocalDate.of(2024, 8, 24), "Backyard"));
        taskList.addTask(new GardenTask("Weed Garden", "Remove weeds from the vegetable garden",
                LocalDate.of(2024, 8, 25), "Vegetable Garden"));
        taskList.addTask(new GardenTask("Prune Shrubs", "Prune the rose bushes and hedges",
                LocalDate.of(2024, 8, 26), "Front Yard"));
        taskList.addTask(new GardenTask("Harvest Vegetables", "Pick ripe tomatoes and peppers",
                LocalDate.of(2024, 8, 5), "Vegetable Garden"));
        taskList.addTask(new GardenTask("Fertilize Lawn", "Apply fertilizer to the lawn",
                LocalDate.of(2024, 8, 28), "Front Yard"));


        String keyWord = "weed";

        List<Task> filteredByKeyword = taskList.filterTasksBasedOnKeyword(keyWord);
        System.out.println("Search: " + keyWord);
        filteredByKeyword.forEach(System.out::println);
        System.out.println();


        List<Task> sortedByDueDate = taskList.sortTasksByDueDate();
        System.out.println("Tasks sorted by due date: ");
        sortedByDueDate.forEach(System.out::println);
        System.out.println();

        List<Task> tasksDueToday = taskList.displayTasksDueToday();
        System.out.println("Tasks that are due today:  ");
        tasksDueToday.forEach(System.out::println);
        System.out.println();

        List<Task> tasksOverdue = taskList.displayTasksOverdue();
        System.out.println("Tasks that are overdue: ");
        tasksOverdue.forEach(System.out::println);
        System.out.println();

        List<Task> allTasks = taskList.getTasks();
        System.out.println("All tasks: ");
        allTasks.forEach(System.out::println);
    }


}

