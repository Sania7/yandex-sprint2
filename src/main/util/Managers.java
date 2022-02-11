package main.util;


import main.controller.InMemoryTasksManager;
import main.task.TaskManager;

// Утилитарный класс для работы с менеджерами задач
public class Managers {

    public static TaskManager getDefaultHistory() {
        return new InMemoryTasksManager();
    }
}
