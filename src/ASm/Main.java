package ASm;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StudentManagement management = new StudentManagement();
        Scanner scanner = new Scanner(System.in);

        // Example of a menu-driven approach
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Student");
            System.out.println("2. Edit Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Display Students");
            System.out.println("5. Sort by Score");
            System.out.println("6. Sort by Name");
            System.out.println("7. Print Using Stack & Queue");
            System.out.println("8. Search by ID");
            System.out.println("9. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Score: ");
                    double score = scanner.nextDouble();
                    management.addStudent(id, name, score);
                    break;
                case 2:
                    System.out.print("Enter ID to edit: ");
                    id = scanner.nextLine();
                    System.out.print("Enter new Name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter new Score: ");
                    score = scanner.nextDouble();
                    management.editStudent(id, name, score);
                    break;
                case 3:
                    System.out.print("Enter ID to delete: ");
                    id = scanner.nextLine();
                    management.deleteStudent(id);
                    break;
                case 4:
                    management.displayStudents();
                    break;
                case 5:
                    management.sortByScoreBubbleSort();
                    management.displayStudents();
                    break;
                case 6:
                    management.sortByNameSelectionSort();
                    management.displayStudents();
                    break;
                case 7:
                    management.printUsingStackQueue();
                    break;
                case 8:
                    System.out.print("Enter ID to search: ");
                    id = scanner.nextLine();
                    Student found = management.searchByID(id);
                    if (found != null) {
                        System.out.println("Found: " + found);
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;
                case 9:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}