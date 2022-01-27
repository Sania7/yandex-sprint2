package main.util;

import main.task.Task;

import java.util.ArrayList;
import java.util.Collection;

public class History {
    final static private int HISTORY_SIZE = 10;
    private ArrayList<Task> history;

    public History() {
        this.history = new ArrayList<>();
    }

    public Collection<Task> getHistory() {
        return history;
    }

    public void add(Task task) {
        if (history.size() >= HISTORY_SIZE) {
            history.remove(0);
        }
        history.add(task);
    }
}
