package main;

import main.task.Epic;
import main.task.Task;

import java.util.ArrayList;
import java.util.HashMap;

public class Manager {
    private HashMap<Integer, Task> singleTask = new HashMap<>(); // список для Task

    public void addTask(Task task) {
        for (Integer integer : singleTask.keySet()) {
            if (task.getId() == integer) {
                System.out.println("Задача с таким ID уже существует!");
            } else {
                singleTask.put(task.getId(), task);
            }
        }
    } // добавление задачи

    public ArrayList<Task> getListTasks() {
        ArrayList<Task> tasks = new ArrayList<>();
        for (Task value : singleTask.values()) {
            tasks.add(value);
        }
        return tasks;
    } // получить список всех задач

    public Task getTaskId(int id) {
        for (Integer integer : singleTask.keySet()) {
            if (integer == id) {
                singleTask.get(id);
            }
        }
        return singleTask.get(id);
    } // получение задачи по ID

    public void taskUpdate(Task task, int id) {
        if (task == null) {
            System.out.println("Такой задачи нет...");
        } else {
            for (Integer integer : singleTask.keySet()) {
                if (integer == id) {
                    singleTask.put(integer, task);
                    System.out.println("Задача обновлена!");
                    return;
                }
            }

        }
    } // обновление задачи

    public void deleteTask() {
        singleTask.clear();
    } // удалить все задачи

    public void removeTaskId(int id) {
        for (Integer integer : singleTask.keySet()) {
            if (integer == id) {
                singleTask.remove(id);
                return;
            }
        }
    } // удаление задачи по ID

    private HashMap<Integer, Epic> epicTask = new HashMap<>(); // список для Epic

    public void addEpic(Epic epic) {
        for (Integer integer : epicTask.keySet()) {
            if (epic.getId() == integer) {
                System.out.println("Есть такой ID.");
            } else {
                epicTask.put(epic.getId(), epic);
            }
        }
    } // добавление Epic

    public ArrayList<Epic> getEpicList() {
        ArrayList<Epic> listEpic = new ArrayList<>();
        for (Epic value : epicTask.values()) {
            listEpic.add(value);
        }
        return listEpic;
    } // получить список Epic

    public Epic getEpicId(int id) {
        for (Integer integer : epicTask.keySet()) {
            if (integer == id) {
                epicTask.get(id);
            }
        }
        return epicTask.get(id);
    } // получить Epic по id

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
    } // обновление задачи по ID

    public void deleteEpic() {
        epicTask.clear();
    } // удалить все задачи

    public void epicRemoveId(int id) {
        for (Integer integer : epicTask.keySet()) {
            if (integer == id) {
                epicTask.remove(integer);
                return;
            }
        }
    } // удалить Epic по ID
}
