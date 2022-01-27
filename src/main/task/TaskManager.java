package main.task;

import java.util.ArrayList;
import java.util.HashMap;

// Класс для управления задачами
public class TaskManager {

    // список для Task
    private HashMap<Integer, Task> listTask;

    public TaskManager() {
        listTask = new HashMap<>();
    }

    // получить список всех задач
    public ArrayList<Task> getListTasks() {
        ArrayList<Task> tasks = new ArrayList<>();
        for (Task value : listTask.values()) {
            tasks.add(value);
        }
        return tasks;
    }
    // добавление задачи
    public void addTask(Task task) {
        for (Integer integer : listTask.keySet()) {
            if (task.getId() == integer) {
                System.out.println("Задача с таким ID уже существует!");
            } else {
                listTask.put(task.getId(), task);
            }
        }
    }

    // получить список всех задач

    // получение задачи по ID
    public Task getTaskId(int id) {
        for (Integer integer : listTask.keySet()) {
            if (integer == id) {
                listTask.get(id);
            }
        }
        return listTask.get(id);
    }

    // обновление задачи
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
    public void deleteTask() {
        listTask.clear();
    }

    // удаление задачи по ID
    public void removeTaskId(int id) {
        for (Integer integer : listTask.keySet()) {
            if (integer == id) {
                listTask.remove(id);
                return;
            }
        }
    }

    // список для Epic
    private HashMap<Integer, Epic> epicTask = new HashMap<>();

    // добавление Epic
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
    public ArrayList<Epic> getEpicList() {
        ArrayList<Epic> listEpic = new ArrayList<>();
        for (Epic value : epicTask.values()) {
            listEpic.add(value);
        }
        return listEpic;
    }

    // получить Epic по id
    public Epic getEpicId(int id) {
        for (Integer integer : epicTask.keySet()) {
            if (integer == id) {
                epicTask.get(id);
            }
        }
        return epicTask.get(id);
    }

    // обновление задачи по ID
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
    public void deleteEpic() {
        epicTask.clear();
    }

    // удалить Epic по ID
    public void epicRemoveId(int id) {
        for (Integer integer : epicTask.keySet()) {
            if (integer == id) {
                epicTask.remove(integer);
                return;
            }
        }
    }
}
