package main.util;


import main.task.Task;

import java.util.List;

/*
В этом интерфейсе три метода:
 void add(Task task) для добавления нового просмотра задачи,
 void remove(int id) для удаления просмотра из истории и
 List<Task> getHistory() для получения истории последних просмотров.
 */
public interface HistoryManager {

    // добавления нового просмотра задачи
    void add(Task task);

     // удаление просмотра из истории
    void remove(int id);

    // получение истории последних просмотров
    List<Task> getHistory();
}
