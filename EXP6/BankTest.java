abstract class Bank {
    abstract void getBalance();
}

class BankA extends Bank {
    void getBalance() {
        System.out.println("Balance in Bank A: $100");
    }
}

class BankB extends Bank {
    void getBalance() {
        System.out.println("Balance in Bank B: $150");
    }
}

class BankC extends Bank {
    void getBalance() {
        System.out.println("Balance in Bank C: $200");
    }
}

public class BankTest {
    public static void main(String[] args) {
        BankA a = new BankA();
        BankB b = new BankB();
        BankC c = new BankC();

        a.getBalance();
        b.getBalance();
        c.getBalance();
    }
}
