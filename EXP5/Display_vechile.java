
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

public class Display_vechile{
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.display();

        Car c = new Car();
        c.display();

        Bike b = new Bike();
        b.display();

        // Printing your details
        System.out.println("Name: LAKSHAY YADAV");
        System.out.println("Roll No: 24CSU112");
    }
}
