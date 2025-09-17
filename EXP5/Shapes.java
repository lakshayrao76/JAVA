
class Shape {
    void printShape() {
        System.out.println("This is This is shape");
    }
}

class Rectangle extends Shape {
    void printRectangle() {
        System.out.println("This is rectangular shape");
    }
}

class Circle extends Shape {
    void printCircle() {
        System.out.println("This is circular shape");
    }
}
class Square extends Rectangle {
    void printSquare() {
        System.out.println("Square is a rectangle");
    }
}

public class Shapes{
    public static void main(String[] args) {
     System.out.println("LAKSHAY YADAV , 24CSU112");
        Square sq = new Square();   // Object of Square class

        // Calling methods
        sq.printShape();       // Method from Shape class
        sq.printRectangle();   // Method from Rectangle class
    }
}
