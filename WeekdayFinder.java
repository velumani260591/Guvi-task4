package task4;

import java.util.Scanner;

public class WeekdayFinder {
    public static void main(String[] args) {
        // Array of weekdays starting with Sunday at index 0
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter day index (0-6): ");

        try {
            int index = scanner.nextInt();
            System.out.println("Day at index " + index + " is: " + weekdays[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index! Please enter a value between 0 and 6.");
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a numeric value.");
        } finally {
            scanner.close();
        }
    }
}
