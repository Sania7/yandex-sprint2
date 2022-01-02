package test;

import java.util.Arrays;

public class Counter {
    public static void main(String[] args) {
        PersonName name = PersonName.parse("Добронравова Юлия");

        System.out.println(name.getFullName());
    }
}

class PersonName {

    private String lastName;
    private String firstName;

    public PersonName(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getFullName() {
        return lastName + " " + firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    // возвращает PersonName из заданной строки:
    public static PersonName parse(String fullName) {
        String[] parts = fullName.split(" ");

        return new PersonName(parts[0], parts[1]);
    }
}
