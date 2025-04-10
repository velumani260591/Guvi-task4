package task4;
import java.util.Stack;

public class IntegerStack {

    // Stack to store integers
    private Stack<Integer> stack;

    // Constructor
    public IntegerStack() {
        stack = new Stack<>();
    }

    // a) Method to push elements onto the stack
    public void pushElement(int element) {
        stack.push(element);
        System.out.println("Pushed: " + element);
    }

    // b) Method to pop elements from the stack
    public void popElement() {
        if (!stack.isEmpty()) {
            int removedElement = stack.pop();
            System.out.println("Popped: " + removedElement);
        } else {
            System.out.println("Stack is empty. Cannot pop.");
        }
    }

    // Method to display the current stack
    public void displayStack() {
        System.out.println("Current Stack: " + stack);
    }

    // Main method to test the stack functionality
    public static void main(String[] args) {
        IntegerStack intStack = new IntegerStack();

        intStack.pushElement(10);
        intStack.pushElement(20);
        intStack.pushElement(30);

        intStack.displayStack();

        intStack.popElement();
        intStack.displayStack();

        intStack.popElement();
        intStack.popElement();
        intStack.popElement(); // Trying to pop from an empty stack
    }
}
