package org.example;

import org.example.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TaskManager {
    private final List<Task> tasks = new ArrayList<>();
    private int nextId = 1;

    public void addTask(String description) {
        Task newTask = new Task(nextId++, description);
        tasks.add(newTask);
    }

    public void completeTask(int taskId) {
        tasks.stream()
                .filter(task -> task.getId() == taskId)
                .findFirst()
                .ifPresent(task -> task.setCompleted(true));
    }

    public void removeTask(int taskId) {
        tasks.removeIf(task -> task.getId() == taskId);
    }

    public List<Task> getTasks() {
        return tasks;
    }
}
