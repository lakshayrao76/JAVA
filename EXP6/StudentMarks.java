abstract class Marks {
    abstract double getPercentage();
}

class A extends Marks {
    double m1, m2, m3;

    A(double m1, double m2, double m3) {
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    @Override
    double getPercentage() {
        double total = m1 + m2 + m3;
        return (total / 300) * 100;
    }
}

class B extends Marks {
    double m1, m2, m3, m4;

    B(double m1, double m2, double m3, double m4) {
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.m4 = m4;
    }

    @Override
    double getPercentage() {
        double total = m1 + m2 + m3 + m4;
        return (total / 400) * 100;
    }
}

public class StudentMarks {
    public static void main(String[] args) {
        A studentA = new A(80, 90, 85);
        B studentB = new B(70, 88, 92, 85);

        System.out.println("Percentage of Student A: " + studentA.getPercentage() + "%");
        System.out.println("Percentage of Student B: " + studentB.getPercentage() + "%");
    }
}
