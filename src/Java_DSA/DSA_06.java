package Java_DSA;

//See package Data_Structure for more Algorithms.
//Suppose, an Array of 200 items exist with the required item included.
//By space and time complexity's best case of O(1), required time and space(memory) will equal to index of item.

// int [] arr = new int [] {11,26,216,3,1,2,19,3,1,21,2.............189 more items}
// To find value 11 and 19, algorithms has to make comparison with index value and required value.
// Best case  : Big O of 1 : O(1)-> 11 at arr(0) and 19 at arr(6) then, total space is 1+7 = 8
// Worst case : Big 0 of n : O(n)-> iterating every item and item not find


//Reasons not to have high space complexity,
//-> More data means more processing
//-> Network calls, means even a normal or small code taking few milliseconds to complete can overheat the main memory.
//-> Expensive, as Cache space, SSDs are very expensive.


import java.util.Arrays;

//Below examples of data structures.

//Question : Maximum wealth of a person in an 2D array =>
// 5 people has multiple bank accounts and ya have to find wealthiest among them to raid him/her.
// By adding all elements in inner array(bank accounts) and comparing them
class maxWealth {
    public int maxWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;

        for (int person = 0; person < accounts.length; person++ //outside loop for every row
        ) {
            int sum = 0;//when entering new column(account) new sum should be used to not get aggregated value.

            for (int acc = 0; acc < accounts[person].length; acc++ //inside loop for every column
            ) {
//                sum += accounts[acc][person];//It is incorrect due to misindication of inner arrays.
                sum += accounts[person][acc];

            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}


public class DSA_06 {
//    static boolean search(String str,char target){
//        if (str.length() == 0)
////-> String has .length function that requires ()call different from arr.length which is a variable but both are same internal array.
//        {
//            return false;
//        }
//        for (int i = 0; i <str.length() ; i++) {
//            if (target == str.charAt(i)){
//                return true;
//            }
//        }
//
//        return false;
//    }
//
//    static boolean search2(String str,char target){
//        if (str.length() == 0)
////-> String has .length function that requires ()call different from arr.length which is a variable but both are same internal array.
//        {
//            return false;
//        }
//        for (char ch:str.toCharArray()) {
//            if (ch == target){
//                return true;
//            }
//        }
//
//        return false;
//    }

    public static void main(String[] args) {
//        String name = "Krrish Mahar";
//        char ch = 'K';
//        System.out.println(Arrays.toString(name.toCharArray()));

//        Search Algorithm in Arrays -


//        ->Search in 2-D array =>
//        int [][] arr = {
//                {1,2,15,1},
//                {64,561,13,12},
//                {521,311,21,12},
//        };
//        int[] ans = searchIn2D(arr,12);//shows where element is located
//        System.out.println(Arrays.toString(ans));
//int ans2 = maxima(arr);
//        System.out.println(ans2);//shows what is maximum value in array

//        System.out.format("The range of integers in Java is from %d to %d ",Integer.MIN_VALUE,Integer.MAX_VALUE);
//        System.out.println();
//        System.out.format("The range of floats in Java is from %f to %f ",Float.MIN_VALUE,Float.MAX_VALUE);
//        System.out.println();
//        System.out.format("The range of doubles in Java is from %f to %f ",Double.MIN_VALUE,Double.MAX_VALUE);


        //To find number of Even No.s in an Array.
        //-> This requires various function and objects to call, it involves
        //Function to count No. of Digits of a number like, 1111 contains 4 digit.
        //Function to check if No. is an even No. or Not.
        //Function to find No. from the array and print it.
// Let's Start,
        int[][] arr1 = {
                {1, 2, 15, 1},
                {64, 561, 13, 2, 12},
                {52, 32, 62, 6, 92, 52, 42},
        };
        int[] arr2 = {31, 1, 321, 2, 21, 152, 56, 11, 19, 2};
        int[] arr3 = {-31, -1, -321, 2, 21, -152, 56, -11, -19, -22};

//        System.out.println(digits(5126));//shows No. of digits in it.
//        System.out.println(digits2(-2524224));

        //All functions below uses method (digit) by even method, but they can also use method (digit2).
        //Using digit2 in even method, program is more optimised and becomes 16% to compile and process.
        //It also optimises the time complexity.
//        System.out.println(FindNumber(arr1));
//
//        System.out.println(FindNumber2(arr2));
//
//        System.out.println(FindNumber2(arr3));

        int[][] arr11 = {{12, 12, 46},
                {1, 2, 15, 1},
                {999},
                {12, 112, 12, 12, 5}
        };
//maxWealth mx = new maxWealth();//making object from class maxWealth and using it in arr11.
//mx.maxWealth(arr11);

        System.out.println(maxWealth(arr11));

    }


    static int FindNumber(int[][] arr3) { // Function for 2 D array.
        int count = 0;

        for (int num1[] : arr3) {
            for (int num2 : num1) {

                if (even(num2)) {
                    count++;
                }
            }
        }

        return count;
    }

    static int FindNumber2(int[] arr4) { // Function for 1 D array
        int count = 0;
        for (int num : arr4) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int numberOfDigits = digits2(num);
/*if (numberOfDigits % 2 ==0){
    return true;
}return false;
//Or,
*/
        return numberOfDigits % 2 == 0;
    }
//    static int digits(int num){
//int count = 0;
//
//if (num<0) {//Modification for Negative numbers
//    num = num * -1;
//}
//
//while (num>0){
//    count++;
//    num = num/10;
//}
//return count;
//    }

    static int digits2(int num) {

        if (num < 0) {//Since logarithm for negative numbers is Undefined.
            num = num * -1;
        }

        return (int) (Math.log10(num)) + 1;
    }

//    static  int[] searchIn2D(int [][] arr1,int target)
//    {
//        for (int row = 0; row < arr1.length; row++) {
//            for (int column = 0; column <arr1[row].length ; column++) {
//                if (arr1[row][column]==target){
//                    return new int[]{row,column};
//
//                }
//            }
//        }
//return new int[]{-1};
//    }
//
//    static int maxima(int [][] arr2){//->method maxima gives maximum value in an array.
//        int max = Integer.MIN_VALUE;//considering max value = something
//        for (int[] ints : arr2) {
//            //for each and every element in [][]arr and []ints comparing them and,
//            //for each ints considered as int element, if
//            for (int element: ints
//                 ) {
//                if (element>max){
//                    max = element;
//                }
//            }
//        }
//
// return max;   }


    static int maxWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;

        //outside loop for every row
        for (int[] account : accounts) {
            int sum = 0;//when entering new column(account) new sum should be used to not get aggregated value.

            //inside loop for every column
            for (int i : account) {
                sum += i;

            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}

