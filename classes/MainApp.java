package classes;

import java.util.Scanner;

public class MainApp {
    private Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        MainApp app = new MainApp();
        app.run();
    }
    
    public void run() {
        System.out.println("=== Welcome to Student Management System ===");
        System.out.println();
        
        while (true) {
            displayMenu();
            int choice = getUserChoice();
            
            try {
                switch (choice) {
                    case 1:
                        addStudent();
                        break;
                    case 2:
                        viewAllStudents();
                        break;
                    case 3:
                        filterStudentsByGrade();
                        break;
                    case 4:
                        sortStudentsByName();
                        break;
                    case 5:
                        System.out.println("Thank you for using Student Management System!");
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (Exception e) {
                System.err.println("An error occurred: " + e.getMessage());
            }
            
            System.out.println();
        }
    }
    
    private void displayMenu() {
        System.out.println("Student Management System");
        System.out.println("--------------------------");
        System.out.println("1. Add Student");
        System.out.println("2. View All Students");
        System.out.println("3. Filter Students by Grade");
        System.out.println("4. Sort Students by Name");
        System.out.println("5. Exit");
        System.out.print("Enter your choice (1-5): ");
    }
    
    private int getUserChoice() {
        try {
            int choice = Integer.parseInt(scanner.nextLine().trim());
            return choice;
        } catch (NumberFormatException e) {
            return -1; 
        }
    }

    private void addStudent() {
        try {
            System.out.println("\n=== Add New Student ===");

            int id = getNextId(); 
            System.out.println("Student ID: " + id + " (auto-generated)");

            System.out.print("Enter student name: ");
            String name = scanner.nextLine().trim();

            System.out.print("Enter student grade (0-100): ");
            int grade = Integer.parseInt(scanner.nextLine().trim());

            Student student = new Student(id, name, grade);
            studentManager.addStudent(student);

        } catch (InvalidStudentException e) {
            System.err.println("Error adding student: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Invalid grade format. Please enter a number.");
        }
    }
     private void viewAllStudents() {}
    private void filterStudentsByGrade() {}
    private void sortStudentsByName() {}

    private StudentManager studentManager = new StudentManager();
}
