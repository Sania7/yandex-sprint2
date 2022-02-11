package main.task;

import main.util.TaskStatus;

import java.util.ArrayList;
import java.util.HashMap;

// Класс Эпик - задачи с подзадачами.
public class Epic extends Task {

    // поле-список подзадач
    private ArrayList<SubTask> subTasks;

    // конструктор
    public Epic(Integer id, String name, String description) {
        super(id, name, description);
        subTasks = new ArrayList<>();
    }

    // получение эпика
    public TaskStatus getStatus() {
        TaskStatus rsl;
        int statusCount = TaskStatus.NEW.ordinal();
        if (subTasks.size() == 0) {
            rsl = TaskStatus.NEW;
        } else {
            for (SubTask subTask : subTasks)
                statusCount += subTask.getStatus().ordinal();

            if (statusCount == TaskStatus.NEW.ordinal()) { //Все подзадачи новые
                rsl = TaskStatus.NEW;
            } else if (statusCount == (TaskStatus.DONE.ordinal() * subTasks.size())) {  //Все подзадачи выполнены
                rsl = TaskStatus.DONE;
            } else {
                rsl = TaskStatus.IN_PROGRESS;
            }
        }

        return rsl;
    }

    // получение списка всех подзадач
    public ArrayList<SubTask> getSubTasks() {
        return subTasks;
    }

    // toString

    @Override
    public String toString() {
        return "Epic{" +
                "subTasks=" + subTasks +
                '}';
    }
}

    // получение списка всех подзадач
//    public ArrayList<SubTask> getListSubTasks() {
//        return new ArrayList<>(subTasks.values());
 //   }

    // получение подзадачи по идентефикатору
//    public Task getTaskById(int id) {
//        for (Integer integer : subTasks.keySet()) {
//            if (id == integer) {
//                subTasks.get(id);
//            }
//        }
//        return subTasks.get(id);
//    }

    // метод обновления задачи
//    public void taskUpdate(SubTask subTask, int id) {
//        if (subTask == null) {
//            System.out.println("Нет задания!");
//        }
//        for (Integer integer : subTasks.keySet()) {
//            if (id == integer) {
//                subTasks.put(id, subTask);
//                System.out.println("Вы обновили задачу!");
//            } else {
//                System.out.println("Такой задачи нет!");
//            }
//        }
//    }

    // очистить всё
//    public void remTaskById() {
//        subTasks.clear();
//    }

    // удаление подзадачи по id
//    public void deleteTaskById(int id) {
//        for (Integer integer : subTasks.keySet()) {
//            if (id == integer) {
//                subTasks.remove(id);
//                return;
//            } else {
//                System.out.println("Нет такой задачи!");
//            }
//        }
//    }

