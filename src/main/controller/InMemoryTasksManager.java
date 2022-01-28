package main.controller;

import main.task.Epic;
import main.task.SubTask;
import main.task.Task;
import main.task.TaskManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class InMemoryTasksManager implements TaskManager {

    private HashMap<Integer, Task> listTask;
    private HashMap<Integer, Epic> epicTask;
    private ArrayList<Task> taskHistory;

    public InMemoryTasksManager() {
        listTask = new HashMap<>();
        epicTask = new HashMap<>();
        taskHistory = new ArrayList<>();
    }

    @Override
    public ArrayList<Task> getListTasks() {
        ArrayList<Task> tasks = new ArrayList<>();
        for (Task value : listTask.values()) {
            tasks.add(value);
        }
        return tasks;
    }

    // добавление задачи
    @Override
    public void addTask(Task task) {
        for (Integer integer : listTask.keySet()) {
            if (task.getId() == integer) {
                System.out.println("Задача с таким ID уже существует!");
            } else {
                listTask.put(task.getId(), task);
            }
        }
    }

    // получение задачи по ID
    @Override
    public Task getTaskId(int id) {
        for (Integer integer : listTask.keySet()) {
            if (integer == id) {
                listTask.get(id);
            }
        }
        return listTask.get(id);
    }

    // обновление задачи
    @Override
    public void taskUpdate(Task task, int id) {
        if (task == null) {
            System.out.println("Такой задачи нет...");
        } else {
            for (Integer integer : listTask.keySet()) {
                if (integer == id) {
                    listTask.put(integer, task);
                    System.out.println("Задача обновлена!");
                    return;
                }
            }

        }
    }

    // удалить все задачи
    @Override
    public void deleteTask() {
        listTask.clear();
    }

    // удаление задачи по ID
    @Override
    public void removeTaskId(int id) {
        for (Integer integer : listTask.keySet()) {
            if (integer == id) {
                listTask.remove(id);
                return;
            }
        }
    }

    // добавление Epic
    @Override
    public void addEpic(Epic epic) {
        for (Integer integer : epicTask.keySet()) {
            if (epic.getId() == integer) {
                System.out.println("Есть такой ID.");
            } else {
                epicTask.put(epic.getId(), epic);
            }
        }
    }

    // получить список Epic
    @Override
    public ArrayList<Epic> getEpicList() {
        ArrayList<Epic> listEpic = new ArrayList<>();
        for (Epic value : epicTask.values()) {
            listEpic.add(value);
        }
        return listEpic;
    }

    // получить Epic по id
    @Override
    public Epic getEpicId(int id) {
        for (Integer integer : epicTask.keySet()) {
            if (integer == id) {
                epicTask.get(id);
            }
        }
        return epicTask.get(id);
    }

    // обновление задачи по ID
    @Override
    public void epicUpdate(Epic epic, int id) {
        if (epic != null) {
            for (Integer integer : epicTask.keySet()) {
                if (integer == id) {
                    epicTask.put(id, epic);
                    System.out.println("Задача обновлена!");
                }
            }
        } else {
            System.out.println("Нет такой задачи!");
        }
    }

    // удалить все задачи
    @Override
    public void deleteEpic() {
        epicTask.clear();
    }

    // удалить Epic по ID
    @Override
    public void epicRemoveId(int id) {
        for (Integer integer : epicTask.keySet()) {
            if (integer == id) {
                epicTask.remove(integer);
                return;
            }
        }
    }

    public void addHistory(Task task) {
        if (taskHistory.size() > 10) {
            taskHistory.remove(0);
        } else {
            taskHistory.add(task);
        }
    }

    @Override
    public List<Task> history() {
        return taskHistory;
    }

}
