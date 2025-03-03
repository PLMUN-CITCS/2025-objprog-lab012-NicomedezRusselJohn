public class MethodDemo {
    public static void main(String[] args) {
        greet(); // Calling the greet method
        printMessage("This is my message!");
    }

    // Method to print a greeting
    public static void greet() {
        System.out.println("Hello from the greet method!"); 
    }

    // Method to print a custom message
    public static void printMessage(String message) {
        System.out.println(message);
    }
}