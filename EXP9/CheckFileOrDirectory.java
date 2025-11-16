import java.io.File;
import java.util.Scanner;

public class CheckFileOrDirectory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user to enter file or directory path
        System.out.print("Enter the path: ");
        String path = scanner.nextLine();

        // Create File object
        File file = new File(path);

        // Check conditions
        if (file.exists()) {
            if (file.isFile()) {
                System.out.println("It is a file.");
            } else if (file.isDirectory()) {
                System.out.println("It is a directory.");
            }
        } else {
            System.out.println("The specified path does not exist.");
        }

        scanner.close();
    }
}
