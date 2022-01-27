package main.util;

public class ID {
    private static Integer id = 0;

    public static Integer getId() {
        return id;
    }

    Integer generateID() {
        id++;
        return id;
    }
}
