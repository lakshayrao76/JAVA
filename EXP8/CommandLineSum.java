import java.util.Scanner;

// DOD 1: Create a user-defined exception
class CheckArgumentException extends Exception {
    public CheckArgumentException(String message) {
        super(message);
    }
}

public class CommandLineSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        try {
            // DOD 2: Ask the user how many arguments they want to enter
            System.out.print("Enter the number of arguments: ");
            int count = sc.nextInt();

            // DOD 3: Check for exception condition
            if (count < 5) {
                throw new CheckArgumentException("Error: You must enter at least 5 arguments!");
            }

            // Use for loop to take inputs
            int sum = 0;
            System.out.println("Enter " + count + " integers:");
            for (int i = 0; i < count; i++) {
                int num = sc.nextInt();
                if (i < 5) {
                    sum += num; // DOD 4: Calculate sum of first 5 numbers
                }
            }

            System.out.println("Sum of first 5 integers = " + sum);

        } catch (CheckArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
