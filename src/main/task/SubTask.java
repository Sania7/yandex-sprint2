package main.task;

import java.util.Objects;

public class SubTask extends Task {

    // ссылка на Epic
    Epic epic;

    // конструктор


    public SubTask(Integer id, String name, String description, Epic epic) {
        super(id, name, description);
        this.epic = epic;
    }

    public Epic getEpic() {
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
