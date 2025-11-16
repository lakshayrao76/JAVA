class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

interface Pet {
    void play();
}

interface Wild {
    void hunt();
}

class Dog extends Animal implements Pet, Wild {
    public void play() {
        System.out.println("Dog loves to play fetch!");
    }

    public void hunt() {
        System.out.println("Dog hunts small animals sometimes.");
    }
}

public class ClassExtendsAndImplements {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.play();
        dog.hunt();
    }
}
