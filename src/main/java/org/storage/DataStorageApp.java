package org.storage;

public class DataStorageApp {
    public static void main(String[] args) {
        DataStorage<Employee> memoryStorage = new MemoryStorage<>();
        String key = memoryStorage.store(new Employee("John", 39));
        Employee retrievedString = memoryStorage.retrieve(key);
        System.out.println("Vi har hentet: " + retrievedString);

        /*DataStorage<Employee> fileStorage = new FileStorage<>();
        String filename = fileStorage.store(new Employee("John", 30));
        Employee retrievedInt = fileStorage.retrieve(filename);*/

        // Create and demonstrate DatabaseStorage
    }
}