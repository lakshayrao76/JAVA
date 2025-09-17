import java.util.Scanner;

class EvenOddCount {
    public static void main(String[] args) {
        System.out.println("LAKSHAY YADAV 24CSU112");
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scan.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.print("\nArray elements: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        int evenCount = 0, oddCount = 0;
        for (int num : arr) {
            if (num % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }

        System.out.println("\nLength of array: " + n);
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);

        scan.close();
    }
}