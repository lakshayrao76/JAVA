import java.util.Scanner;


class Vehicle {
    void display() {
        System.out.println("This is a Vehicle");
    }
}

class Car extends Vehicle {
    @Override
    void display() {
        System.out.println("This is a Car");
    }
}

class Bike extends Vehicle {
    @Override
    void display() {
        System.out.println("This is a Bike");
    }
}

public class Vechiles{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Enter number of tyres: ");
        int N = sc.nextInt();

        Vehicle v; 

    
        if (N == 2) {
            v = new Bike();
        } else if (N == 4) {
            v = new Car();
        } else {
            v = new Vehicle();
        }

        
        v.display();

        System.out.println("Name: LAKSHAY YADAV");
        System.out.println("Roll No: 24CSU112");

        sc.close();
    }
}
