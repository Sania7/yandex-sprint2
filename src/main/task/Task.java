package main.task;

import main.controller.TaskStatus;

import java.util.Arrays;
import java.util.Objects;

public class Task {

    // переменные
    private String name;
    private String description;
    private int id;
    private TaskStatus status;

    public Task(int id) { // конструктор
        this.id = id;
    }

    // методы доступа (аксессоры)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return id == task.id && Objects.equals(name, task.name) && Objects.equals(description, task.description) && status == task.status;
    }


    // hashCode переопределен
    @Override
    public int hashCode() {
        int hash = 17;
        if (name != null) {
            hash = hash + name.hashCode();
        }
        hash *= 31;
        if (description != null) {
            hash = hash + description.hashCode();
        }
        return hash;
    }


    // метод toString
    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", id=" + id +
                ", status=" + status +
                '}';
    }
}
