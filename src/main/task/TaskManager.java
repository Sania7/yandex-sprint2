package main.task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Класс для управления задачами
public interface TaskManager {

    // получить список всех задач
    public HashMap<Integer, Task> getAllListTasks();

    // список задачи + эпики
    ArrayList<Task> getListTask();

    // список подзадач одного конкретного эпика
    ArrayList<Task> getEpics();

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

    //Список последних 10 задач
    List<Task> history();
}
