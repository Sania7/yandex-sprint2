package main.task;

import main.util.TaskStatus;

import java.util.ArrayList;
import java.util.HashMap;

// Класс Эпик - задачи с подзадачами.
public class Epic extends Task {

    // поле-список с айдишниками сабтасок этого эпика
    private HashMap<Integer, SubTask> subTasks;

    // конструктор
    public Epic(String name, String description, int id) {
        super(name, description, id);
        subTasks = new HashMap<>();
    }

    // геттер
     public HashMap<Integer, SubTask> getSubtasks() {
        return subTasks;
    }

    // сеттер
    public void setSubtasks(HashMap<Integer, SubTask> subtasks) {
        this.subTasks = subtasks;
    }

    // получение списка всех подзадач
    public ArrayList<SubTask> getListSubTasks() {
        return new ArrayList<>(subTasks.values());
    }

    // получение подзадачи по идентефикатору
    public Task getTaskById(int id) {
        for (Integer integer : subTasks.keySet()) {
            if (id == integer) {
                subTasks.get(id);
            }
        }
        return subTasks.get(id);
    }

    // метод обновления задачи
    public void taskUpdate(SubTask subTask, int id) {
        if (subTask == null) {
            System.out.println("Нет задания!");
        }
        for (Integer integer : subTasks.keySet()) {
            if (id == integer) {
                subTasks.put(id, subTask);
                System.out.println("Вы обновили задачу!");
            } else {
                System.out.println("Такой задачи нет!");
            }
        }
    }

    // очистить всё
    public void remTaskById() {
        subTasks.clear();
    }

    // удаление подзадачи по id
    public void deleteTaskById(int id) {
        for (Integer integer : subTasks.keySet()) {
            if (id == integer) {
                subTasks.remove(id);
                return;
            } else {
                System.out.println("Нет такой задачи!");
            }
        }
    }
}
