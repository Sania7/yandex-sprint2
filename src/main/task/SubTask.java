package main.task;

import java.util.Objects;

public class SubTask extends Task {

    // ссылка на Epic
    private int epic;

    // конструктор

    public SubTask(int id, int epic) {
        super(id);
        this.epic = epic;
    }

    public int getEpic() {
        return epic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SubTask subTask = (SubTask) o;
        return epic == subTask.epic;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), epic);
    }
}
