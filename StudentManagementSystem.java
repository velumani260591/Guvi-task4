// Custom Exception for Age
class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

// Custom Exception for Name
class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

// Student Class
class Student {
    int rollNo;
    String name;
    int age;
    String course;

    // Constructor
    public Student(int rollNo, String name, int age, String course)
            throws AgeNotWithinRangeException, NameNotValidException {
        // Validate age
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age not within range (15-21)");
        }

        // Validate name (should only contain letters and spaces)
        if (!name.matches("[a-zA-Z\\s]+")) {
            throw new NameNotValidException("Name not valid: only alphabets and spaces allowed");
        }

        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Display student details
    public void display() {
        System.out.println("Student Details:");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

// Main Class
public class StudentManagementSystem {
    public static void main(String[] args) {
        try {
            // Change these values to test different cases
            Student s = new Student(101, "Ramesh", 20, "Computer Science");
            s.display();
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}