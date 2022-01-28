package main.util;


import main.controller.InMemoryTasksManager;

// Утилитарный класс для работы с менеджерами задач
public class Managers {
    private static InMemoryTasksManager defaultManager;

    // получить менеджера задач
    public static InMemoryTasksManager getDefaultManager() {
        if (defaultManager == null) {
            defaultManager = new InMemoryTasksManager();
        }
        return defaultManager;
    }
}
