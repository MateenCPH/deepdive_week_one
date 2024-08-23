package org.TaskListApplication;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


import java.time.LocalDate;

public class GardenTask extends Task {
    private String gardenLocation;

    public GardenTask(String title, String description, LocalDate dueDate, String gardenLocation) {
        super(title, description, dueDate);
        this.gardenLocation = gardenLocation;
    }

    public String getGardenLocation() {
        return gardenLocation;
    }

    @Override
    public String toString() {
        return String.format(
                "GardenTask[Title='%s', Description='%s', DueDate=%s, GardenLocation='%s']",
                getTitle(),
                getDescription(),
                getDueDate(),
                gardenLocation
        );
    }
}

