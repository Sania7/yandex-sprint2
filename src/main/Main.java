package main;

import main.task.Epic;
import main.task.SubTask;
import main.task.Task;
import main.task.TaskManager;
import main.util.Managers;

public class Main {

    public static void main(String[] args) {

        TaskManager manager = Managers.getDefaultManager();

        Task task;
        Epic epic;
        SubTask subTask;

        epic = new Epic("Закупка обоев","Стройдвор",1);
        manager.addTask(epic);
    }
}
