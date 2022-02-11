package main;

import main.controller.InMemoryTasksManager;
import main.task.Epic;
import main.task.SubTask;
import main.task.Task;
import main.task.TaskManager;
import main.util.TaskStatus;

public class Main {

    public static void main(String[] args) {
        TaskManager manager = new InMemoryTasksManager();
        Task task;
        Epic epic;
        SubTask subTask;

        // отдельная задача
        task = new Task(100,"Закупка обоев","Стройдвор");
        task.setStatus(TaskStatus.IN_PROGRESS);
        manager.addTask(task);
        System.out.println(manager.getTaskId(100));

        // отдельная задача
        task = new Task(110, "Закупка плинтуса","Стройдвор");
        task.setStatus(TaskStatus.IN_PROGRESS);
        manager.addTask(task);
        System.out.println(manager.getTaskId(110));

    }
}
