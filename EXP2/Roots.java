import java.util.Scanner;

public class Roots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter cooficient a  : ");
        double a = sc.nextDouble();
        System.out.print("enter cooficient b  : ");
        double b = sc.nextDouble();
        System.out.print("enter cooficient c  : ");
        double c = sc.nextDouble();

        double d = b * b - 4 * a * c ;

     if (d > 0) {
            double root1 = (-b + Math.sqrt(d)) / (2 * a);
            double root2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Roots are real and different:"+root1+ "" +root2);
        } 

     else if (d == 0) {
         double root = -b / (2 * a);
         System.out.println("Roots are real and equal:"+root);
          }

    else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-d) / (2 * a);
            System.out.println("Roots are complex and different:");
            System.out.println("Root 1 = " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2 = " + realPart + " - " + imaginaryPart + "i");
        }

    }
    }