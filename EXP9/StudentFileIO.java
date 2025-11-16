import java.io.*;
import java.util.Scanner;

public class StudentFileIO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "students.txt";

        try {
            // Create BufferedWriter to write data
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

            System.out.print("Enter number of students: ");
            int n = scanner.nextInt();
            scanner.nextLine(); // consume newline

            // Writing data to file
            for (int i = 1; i <= n; i++) {
                System.out.println("\nEnter details for student " + i + ":");

                System.out.print("Serial No.: ");
                int serialNo = scanner.nextInt();
                scanner.nextLine(); // consume newline

                System.out.print("First Name: ");
                String firstName = scanner.nextLine();

                System.out.print("CGPA: ");
                float cgpa = scanner.nextFloat();

                System.out.print("Grade: ");
                char grade = scanner.next().charAt(0);
                scanner.nextLine(); // consume newline

                // Write to file
                writer.write(serialNo + "\t" + firstName + "\t" + cgpa + "\t" + grade);
                writer.newLine(); // move to next line
            }

            writer.close();
            System.out.println("\n✅ Data written successfully to " + fileName);

            // Reading data using BufferedReader
            System.out.println("\n📖 Displaying file contents:\n");
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
