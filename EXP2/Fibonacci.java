import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("LAKSHAY YADAV , 24CSU112");

        System.out.println("enter number you want series upto");
        int n = sc.nextInt();
        int a = 0 , b = 1;

        for(int i = 0 ; i < n ; i++){
            System.out.println(a);
            int next = a + b;
            a = b ;
            b = next;


        }

    }
}
