// Custom exception class using 'extends'
class MyCustomException extends Exception {
    // DOD 1: Accept a string argument and store it
    private String message;

    public MyCustomException(String message) {
        this.message = message;
    }

    // DOD 2: Create a separate function to print the stored string
    public void printMessage() {
        System.out.println("Custom Exception Message: " + message);
    }
}

public class CustomExceptionDemo {
    public static void main(String[] args) {
        try {
            // Throwing our custom exception
            throw new MyCustomException("This is a user-defined exception!");
        } 
        catch (MyCustomException e) {
            // Calling our own print method
            e.printMessage();
        }
    }
}
