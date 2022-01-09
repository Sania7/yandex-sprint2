package main.task;

import java.util.ArrayList;
import java.util.HashMap;

public class Epic extends Task {

    // поле-список с айдишниками сабтасок этого эпика, или я что то не понимаю???
    private HashMap<Integer, SubTask> subtasks = new HashMap<>();

    // конструктор
    public Epic(int id) {
        super(id);
    }

    // геттер
    public HashMap<Integer, SubTask> getSubtasks() {
        return subtasks;
    }

    // сеттер
    public void setSubtasks(HashMap<Integer, SubTask> subtasks) {
        this.subtasks = subtasks;
    }

    // получение списка всех подзадач
    public ArrayList<SubTask> getListSubTasks() {
        ArrayList<SubTask> listSubTasks = new ArrayList<>();
        listSubTasks.addAll(subtasks.values());
        return listSubTasks;
    }

    // получение подзадачи по идентефикатору
    public Task getTaskById(int id) {
        for (Integer integer : subtasks.keySet()) {
            if (id == integer) {
                subtasks.get(id);
            }
        }
        return subtasks.get(id);
    }

    // метод обновления задачи
    public void taskUpdate(SubTask subTask, int id) {
        if (subTask == null) {
            System.out.println("Нет задания!");
        }
        for (Integer integer : subtasks.keySet()) {
            if (id == integer) {
                subtasks.put(id, subTask);
                System.out.println("Вы обновили задачу!");
            } else {
                System.out.println("Такой задачи нет!");
            }
        }
    }

    // очистить всё
    public void remTaskById() {
        subtasks.clear();
    }

    // удаление подзадачи по id
    public void deleteTaskById(int id) {
        for (Integer integer : subtasks.keySet()) {
            if (id == integer) {
                subtasks.remove(id);
                return;
            } else {
                System.out.println("Нет такой задачи!");
            }
        }
    }
}
