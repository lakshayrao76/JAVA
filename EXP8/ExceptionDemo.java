public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            // Throwing an Exception object with a String message
            throw new Exception("This is a custom exception message!");
        } 
        catch (Exception e) {
            // Catching the exception and printing the message
            System.out.println("Caught Exception: " + e.getMessage());
        } 
        finally {
            // Proving that the finally block always executes
            System.out.println("Finally block executed successfully.");
        }
    }
}
