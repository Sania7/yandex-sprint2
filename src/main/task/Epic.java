package main.task;

import java.util.ArrayList;
import java.util.HashMap;

public class Epic extends Task {

    private HashMap<Integer, SubTask> subtasks = new HashMap<>();

    public Epic(int id) {
        super(id);
    } // конструктор

    public HashMap<Integer, SubTask> getSubtasks() {
        return subtasks;
    } // геттер

    public void setSubtasks(HashMap<Integer, SubTask> subtasks) {
        this.subtasks = subtasks;
    } // сеттер

    public ArrayList<SubTask> getListSubTasks() {
        ArrayList<SubTask> listSubTasks = new ArrayList<>();
        listSubTasks.addAll(subtasks.values());
        return listSubTasks;
    } // получение списка всех подзадач

    public Task getTaskById(int id) {
        for (Integer integer : subtasks.keySet()) {
            if (id == integer) {
                subtasks.get(id);
            }
        }
        return subtasks.get(id);
    } // получение подзадачи по идентефикатору

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
    } // метод обновления задачи

    public void remTaskById() {
        subtasks.clear();
    } // очистить всё

    public void deleteTaskById(int id) {
        for (Integer integer : subtasks.keySet()) {
            if (id == integer) {
                subtasks.remove(id);
                return;
            } else {
                System.out.println("Нет такой задачи!");
            }
        }
    } // удаление подзадачи по id
}
