package main.task;

import java.util.ArrayList;
import java.util.List;

// Класс для управления задачами
public interface TaskManager {

    // получить список всех задач
    public ArrayList<Task> getListTasks();

    // добавление задачи
    public void addTask(Task task);

    // получение задачи по ID
    public Task getTaskId(int id);

    // обновление задачи
    public void taskUpdate(Task task, int id);

    // удалить все задачи
    public void deleteTask();

    // удаление задачи по ID
    public void removeTaskId(int id);

    // список для Epic
   // private HashMap<Integer, Epic> epicTask = new HashMap<>();

    // добавление Epic
    public void addEpic(Epic epic);

    // получить список Epic
    public ArrayList<Epic> getEpicList();

    // получить Epic по id
    public Epic getEpicId(int id);

    // обновление задачи по ID
    public void epicUpdate(Epic epic, int id);

    // удалить все задачи
    public void deleteEpic();

    // удалить Epic по ID
    public void epicRemoveId(int id);

    //Список последних 10 задач
    List<Task> history();
}
