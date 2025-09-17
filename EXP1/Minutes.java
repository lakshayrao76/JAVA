import java.util.Scanner;

public class Minutes{
    public static void main(String[] args) {
System.out.println("lakshay yadav , 24csu112");
     Scanner sc = new Scanner(System.in);

   System.out.print("enter minutes :");
   long minutes = sc.nextLong();
 
        long totalDays = minutes / (60 * 24);  
        long years = totalDays / 365;
        long remainingDays = totalDays % 365;
        long months = remainingDays / 30;
        long days = remainingDays % 30;

    

System.out.println("years : " +years);
System.out.println("months : " +months);
System.out.println("days : "+days);

 }
}