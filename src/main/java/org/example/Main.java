package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager manager = new TaskManager();

        while (true) {
            System.out.println("1. Add Task");
            System.out.println("2. Complete Task");
            System.out.println("3. Remove Task");
            System.out.println("4. List Tasks");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int option = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (option) {
                case 1:
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    manager.addTask(description);
                    break;
                case 2:
                    System.out.print("Enter task ID to complete: ");
                    int completeId = scanner.nextInt();
                    manager.completeTask(completeId);
                    break;
                case 3:
                    System.out.print("Enter task ID to remove: ");
                    int removeId = scanner.nextInt();
                    manager.removeTask(removeId);
                    break;
                case 4:
                    manager.getTasks().forEach(System.out::println);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option! Please choose again.");
                    break;
            }
        }
    }
}
