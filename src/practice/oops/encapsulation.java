package practice.oops;

public class encapsulation {

/*
    Encapsulation is a core concept of OOPs in which the internal data/varibles are bundled in single unit.
    It restricts external access to internal state.
    JVM handles the access modifier like private, default, protected, public in compile time,
    So it doens't bring any runtime memory overhead
    E.g: In E-commerece app, class Wallet has field balance, balance should not be accessible or changed by others
    but only changed by its function like setBalance or addFunds() or deposit()
*/

    static void main() {
        //Object with changable fields
        Wallet user1 = new Wallet("krrish", 100);
        user1.balance = 100000;
        System.out.println(user1.balance);

        //Object with internal fields capsuled in single unit, no external access
        EncapsulatedWallet user2 = new EncapsulatedWallet("krrish", 100);
//        user2.balance = 100000000; //It is not accessible;
        System.out.println(user2.getBalance());
        user2.setBalance(-9999); // this can be prevented in its function
        System.out.println(user2.getBalance());


    }
}

// WITHOUT ENCAPSULATION
class Wallet {
    String owner;
    double balance = 0.0;
    Wallet(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }
}

class EncapsulatedWallet {
    private final String owner;
    private double balance = 0.0;

    EncapsulatedWallet(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public double getBalance() {
        System.out.printf("Owner: %s has %.2f balance\n",this.owner, this.balance);
        return balance;
    }
    public void setBalance(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        this.balance = balance;
    }
}