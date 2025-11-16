// Custom exception hierarchy
class BaseException extends Exception {
    public BaseException(String message) {
        super(message);
    }
}

class MidLevelException extends BaseException {
    public MidLevelException(String message) {
        super(message);
    }
}

class TopLevelException extends MidLevelException {
    public TopLevelException(String message) {
        super(message);
    }
}

// Base class A
class A {
    // Method throws the base-level exception
    void display() throws BaseException {
        throw new BaseException("Exception thrown from Class A (Base Level)");
    }
}

// Derived class B inherits from A
class B extends A {
    // Overriding the method to throw mid-level exception
    @Override
    void display() throws MidLevelException {
        throw new MidLevelException("Exception thrown from Class B (Mid Level)");
    }
}

// Derived class C inherits from B
class C extends B {
    // Overriding the method to throw top-level exception
    @Override
    void display() throws TopLevelException {
        throw new TopLevelException("Exception thrown from Class C (Top Level)");
    }
}

// Main class to test the hierarchy
public class ExceptionHierarchyDemo {
    public static void main(String[] args) {
        // Upcasting C to A (C → B → A)
        A obj = new C();

        try {
            // This will call C's version of display() since method overriding applies
            obj.display();
        } 
        catch (TopLevelException e) {
            System.out.println("Caught TopLevelException: " + e.getMessage());
        } 
        catch (MidLevelException e) {
            System.out.println("Caught MidLevelException: " + e.getMessage());
        } 
        catch (BaseException e) {
            System.out.println("Caught BaseException: " + e.getMessage());
        }
    }
}
