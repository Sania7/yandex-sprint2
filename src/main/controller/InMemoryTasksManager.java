package main.controller;

import main.task.Epic;
import main.task.SubTask;
import main.task.Task;
import main.task.TaskManager;
import main.util.InMemoryHistoryManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// тотальный рефакторинг...
// класс для управления задачами
public class InMemoryTasksManager implements TaskManager {

    private HashMap<Integer, Task> listTask; // список всех задач
    private ArrayList<Task> useTaskHistory; // список обращений к задачам
    private InMemoryHistoryManager taskHistory;

    // конструктор
    public InMemoryTasksManager() {
        listTask = new HashMap<>();
        useTaskHistory = new ArrayList<>();
        taskHistory = new InMemoryHistoryManager();
    }

    // получение списка всех задач + эпик + подзадачи
    @Override
    public HashMap<Integer, Task> getAllListTasks() {
        return listTask;
    }

    // получение списка задач + эпик
    @Override
    public ArrayList<Task> getListTask() {
        ArrayList<Task> rsl = new ArrayList<>();
        for (Integer key : listTask.keySet()) {
            if (listTask.get(key).getClass() != SubTask.class) {
                rsl.add(listTask.get(key));
            }
        }
        return rsl;
    }

    // получение списка эпиков
    @Override
    public ArrayList<Task> getEpics() {
        ArrayList<Task> rsl = new ArrayList<>();
        for (Task value : listTask.values()) {
            if (value instanceof Epic) {
                rsl.add(value);
            }
        }
        return rsl;
    }

    // добавление новой задачи
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

    // получение задачи по id
    @Override
    public Task getTaskId(int id) {
        for (Integer task : listTask.keySet()) {
            if (task == id) {
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

    // удалить задачу по id
    @Override
    public void removeTaskId(int id) {
        for (Integer integer : listTask.keySet()) {
            if (integer == id) {
                listTask.remove(id);
                return;
            }
        }
    }
    void addHistory(Task task) {
        if (useTaskHistory.size() > 10) {
            taskHistory.remove(0);
        } else {
            taskHistory.add(task);
        }
    }

    // история просмотренных задач
    @Override
    public List<Task> history() {
        return (ArrayList)taskHistory.getHistory();
    }
}
