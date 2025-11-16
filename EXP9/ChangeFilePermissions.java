import java.io.File;
import java.util.Scanner;

public class ChangeFilePermissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the file path from user
        System.out.print("Enter the file path: ");
        String path = scanner.nextLine();

        File file = new File(path);

        // Check if file exists
        if (!file.exists()) {
            System.out.println("File does not exist!");
            return;
        }

        // Show current permissions
        System.out.println("\nCurrent Permissions:");
        System.out.println("Readable: " + file.canRead());
        System.out.println("Writable: " + file.canWrite());
        System.out.println("Executable: " + file.canExecute());

        // Ask user what to change
        System.out.print("\nDo you want to make it readable? (true/false): ");
        boolean readable = scanner.nextBoolean();
        file.setReadable(readable);

        System.out.print("Do you want to make it writable? (true/false): ");
        boolean writable = scanner.nextBoolean();
        file.setWritable(writable);

        System.out.print("Do you want to make it executable? (true/false): ");
        boolean executable = scanner.nextBoolean();
        file.setExecutable(executable);

        // Show updated permissions
        System.out.println("\nUpdated Permissions:");
        System.out.println("Readable: " + file.canRead());
        System.out.println("Writable: " + file.canWrite());
        System.out.println("Executable: " + file.canExecute());

        scanner.close();
    }
}
