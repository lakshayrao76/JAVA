public class TestMain {
    public static void main(String[] args) {
        Circle c1 = new Circle(5.0);
        System.out.println(c1);
        System.out.println("Perimeter: " + c1.getPerimeter());
        System.out.println("Area: " + c1.getArea());

        ResizableCircle rc1 = new ResizableCircle(10.0);
        System.out.println(rc1);
        rc1.resize(50);
        System.out.println("After resizing by 50%: " + rc1);
        System.out.println("New Area: " + rc1.getArea());
    }
}
