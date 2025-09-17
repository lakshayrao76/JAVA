import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
    System.out.println("lakshaya yadav , 24csu112 ");
     Scanner sc = new Scanner(System.in);

System.out.print("Enter temperature in Fahrenheit: ");
double fahrenheit = sc.nextDouble();

 double Celsius = (fahrenheit - 32) * 5 / 9;
System.out.println("Temperature in Celsius is: " + Celsius);

    
 }
}
