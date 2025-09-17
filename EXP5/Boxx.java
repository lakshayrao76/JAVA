
class Box {
    float width;
    float height;
    float depth;

    Box(float w, float h, float d) {
        width = w;
        height = h;
        depth = d;
    }

    float volume() {
        return width * height * depth;
    }
}


class BoxWeight extends Box {
    float weight;


    BoxWeight(float w, float h, float d, float m) {
        super(w, h, d); // Call parent constructor
        weight = m;
    }
}

public class Boxx{
    public static void main(String[] args) {
    
        Box b1 = new Box(10, 20, 15);
        System.out.println("Volume of Box: " + b1.volume());

        BoxWeight bw1 = new BoxWeight(2, 3, 4, 0.5f);
        System.out.println("Volume of BoxWeight: " + bw1.volume());
        System.out.println("Weight of BoxWeight: " + bw1.weight);

        System.out.println("Name: LAKSHAY YADAV");
        System.out.println("Roll No: 24CSU112");
    }
}
