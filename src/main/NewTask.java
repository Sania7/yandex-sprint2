package main;

import java.util.Scanner;

public class NewTask {

    private static int ID = 0;

    public int generateID() {
        ID++;
        return ID;
    } // метод генерации ID

    Scanner scanner = new Scanner(System.in);

    public String nameTask() {
        System.out.println("Введите название новой задачи!");
        return scanner.next();
    } // метод создания имени задачи

    public String taskDescription() {
        System.out.println("Опишите задачу.");
        return scanner.next();
    } // метод описания задачи

    public String setTaskStatus() {
        System.out.println("Установите статус для задачи...");
        System.out.println("1 - Новая, 2 - В процессе, 3 - Завершенная.");
        String status = "";
        int command =  scanner.nextInt();

        switch (command) {
            case 1:
                status = "NEW";
                break;
            case 2:
                status = "IN_PROGRESS";
                break;
            case 3:
                status = "DONE";
                break;
            default:
                System.out.println("Нет такой команды!");
        }
        return status;
    } // метод присвоения статуса задаче

}
