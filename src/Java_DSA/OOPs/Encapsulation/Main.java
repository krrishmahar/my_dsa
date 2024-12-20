package Java_DSA.OOPs.Encapsulation;

public class Main {

//    Encapsulation: Wrapping/ hiding data/implementation in a class
//    Abstraction:   Hiding unnecessary detail and showing valuable info
//    Data hiding: hiding (private/protected) value via getter and setter ->for Encapsulation

//   Must read: Encapsulation V/S Abstraction
//   https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/lectures/17-oop/notes/Abstraction%20Vs%20Encapsulation.png

//    Encapsulation V/S Data hiding:
//    encapsulation is just for hiding complexity, doesn't matter if func() are public or not
//    while, data hiding is more towards data security, and it must be private/protected
//      Encapsulation is subprocess of Data hiding


    static void printPrimeNo(int n) {
        if (n < 2)
            return;

        for (int num = 2; num <= n; num++) { //O(n) time
            boolean isPrime = true;  //No object is created i.e, O(1) space
            for (int i = 2; i <= Math.sqrt(num); i++) {  //O(sqrt(n))
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                System.out.print(num + " ");
        }
    }


    public static void main(String[] args) {

        printPrimeNo(1);
    }

}
