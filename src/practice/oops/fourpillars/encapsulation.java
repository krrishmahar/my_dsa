package practice.oops.fourpillars;

public class encapsulation {

    static void main() {
            
    }
}


//Encapsulation in short is private fields + public getter/setter
//GC link: private fields → fewer external refs → cleaner ref graph → faster GC.
class BankAccount {
    private double balance;

    public void deposit(double amount){
        if (amount < 0)
            throw new IllegalArgumentException("Must be positive amount");
        balance += amount;
    }

    public double getBalance(){
        return balance;
    }
}