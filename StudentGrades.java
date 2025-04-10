import java.util.HashMap;
import java.util.Scanner;

public class StudentGrades {
    private HashMap<String, Integer> studentMap;

    public StudentGrades() {
        studentMap = new HashMap<>();
    }

    // Method to add a new student
    public void addStudent(String name, int grade) {
        studentMap.put(name, grade);
        System.out.println("Added: " + name + " with grade " + grade);
    }

    // Method to remove a student
    public void removeStudent(String name) {
        if (studentMap.containsKey(name)) {
            studentMap.remove(name);
            System.out.println("Removed student: " + name);
        } else {
            System.out.println("Student not found: " + name);
        }
    }

    // Method to display a student's grade
    public void displayGrade(String name) {
        if (studentMap.containsKey(name)) {
            System.out.println(name + "'s grade: " + studentMap.get(name));
        } else {
            System.out.println("Student not found: " + name);
        }
    }

    // Main method to demonstrate functionality
    public static void main(String[] args) {
        StudentGrades grades = new StudentGrades();

        // Example usage
        grades.addStudent("Alice", 90);
        grades.addStudent("Bob", 85);
        grades.displayGrade("Alice");
        grades.removeStudent("Bob");
        grades.displayGrade("Bob");
    }
}