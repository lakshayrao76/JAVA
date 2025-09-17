class Point {
    private double x;
    private double y;

    // Non-parameterized constructor
    public Point() {
        this.x = 0.0;
        this.y = 0.0;
    }

    // Parameterized constructor
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getter and Setter for x
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }

    // Getter and Setter for y
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }

    // Static method to calculate distance between two points
    public static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2));
    }

    // Display function with width of 7 and precision of 2
    public void display() {
        System.out.printf("%7.2f %7.2f\n", x, y);
    }
}