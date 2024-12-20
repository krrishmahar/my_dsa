package ques.week4;

public class patterns {

    public static void main(String[] args) {
        //trick to solve any pattern ques:
//        1. Run outer loop to No of lines times
//        2- Identify how many columns are in each row
//        3- What do you need to print?

        print9();


    }

//    print this:
//9.  *********
//     *******
//      *****
//       ***
//        *
    static void print9(){

        for (int i = 5; i >= 1; i--) {
            int space = 5;
            for (int j = 1; j < space; j++) {
                System.out.print(" ");

            }
            for (int k = 0; k < 2*i ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
