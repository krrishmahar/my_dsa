package Java_DSA;

public class Patterns_08 {
//See for Reference : https://www.youtube.com/watch?v=lsOOs5J8ycw&list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&index=22

//    There are 4 steps to solve any Pattern Question.
    //Step 1- Run the Outer For Loop(Rows Loop) for No. of lines for pattern
    //Step 2- Identify how many columns are in each row
    //Step 3- What do you need to print?

    //Note : Try to find Formula related Rows and Column.

    public static void main(String[] args) {
//pattern2(4);
//pattern3(4);
//pattern4(5);
//pattern5(5);
//pattern6(5);
//pattern7(5);
        pattern8(3);
//pattern10(4);


    }

    static void pattern2(int n) {
        //Draw this -:
//        *
//        **
//        ***
//        ****
        //Basic formula for this ques is No. of rows = No. of Column

        for (int row = 0; row <= n; row++) {//for Every Row, run the column

            for (int column = 1; column <= row; column++) {
                System.out.print("* ");
            }//when one row is printed we need new line.
            System.out.println();
        }
    }

    static void pattern3(int n) {

        for (int row = 1; row <= n; row++) {

            for (int column = 1; column <= n - row + 1; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {

        for (int row = 1; row <= n; row++) {
            int i = 1;

            for (int column = 1; column <= row; column++) {
                System.out.print(i);
                i++;
            }

            System.out.println();
        }
    }

    static void pattern5(int n) {

        for (int row = 0; row < 2 * n; row++) {
            int totalColumn = row > n ? 2 * n - row : row;  //IMP
//           int num = 1;


            for (int column = 0; column < totalColumn; column++) {
//                System.out.print(num);
//                num++;
                System.out.print("* ");

            }
            System.out.println();
        }
    }

    static void pattern6(int n) {

        for (int row = 1; row < 2 * n; row++) {

            int totalColumnInRow = row > n ? 2 * n - row : row;
            int NoOfSpace = n - totalColumnInRow;

            for (int j = 0; j < NoOfSpace; j++) {
                System.out.print(" ");
            }
            for (int column = 1; column <= totalColumnInRow; column++) {
                System.out.print("* ");

            }

            System.out.println();
        }
    }

    static void pattern7(int n) {
        for (int row = 0; row <= n; row++) {


            for (int space = 0; space < n - row; space++) {
                System.out.print("  ");
            }

            for (int column = row; column >= 1; column--) {
                System.out.print(column + " ");
            }
            for (int column = 2; column <= row; column++) {
                System.out.print(column + " ");
            }
            System.out.println();
        }


    }

    static void pattern8(int n) {


        for (int row = 0; row <= 2 * n; row++) {

            int c = row > n ? 2 * n - row : row;

            for (int space = 0; space < n - c; space++) {
                System.out.print("  ");
            }

            for (int column = c; column >= 1; column--) {
                System.out.print(column + " ");
            }
            for (int column = 2; column <= row; column++) {
                System.out.print(column + " ");
            }

            System.out.println();
        }


    }

    static void pattern10(int n) {
        int originalN = n;
        n = 2 * n;

        for (int row = 0; row <= n; row++) {


            for (int col = 0; col <= n; col++) {

                int atEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(n - row, n - col));

                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }

    }


}
