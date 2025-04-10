public class Main {
    public static void main(String[] args) {
        try {
            Voter v1 = new Voter(101, "Alice", 17); // Will throw exception
            v1.displayInfo();
        } catch (InvalidVoterAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
// Custom checked exception
class InvalidVoterAgeException extends Exception {
    public InvalidVoterAgeException(String message) {
        super(message);
    }
}

public class Voter {
    private int voterId;
    private String name;
    private int age;

    // Parameterized constructor
    public Voter(int voterId, String name, int age) throws InvalidVoterAgeException {
        if (age < 18) {
            throw new InvalidVoterAgeException("Invalid age for voter");
        }
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

    // For displaying voter info
    public void displayInfo() {
        System.out.println("Voter ID: " + voterId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
