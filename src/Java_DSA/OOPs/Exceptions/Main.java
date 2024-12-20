package Java_DSA.OOPs.Exceptions;

public class Main {

    public static void main(String[] args) {

        try {
//            int a = 5, b = 0, c = a / b;
//            System.out.println(c);
            throw new Exception("just 4 fun");

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("This will always execute");
        }

//        divide(5,0);
    }

    public static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Please don't divide by 0");
        }
        return a / b;
    }


}
