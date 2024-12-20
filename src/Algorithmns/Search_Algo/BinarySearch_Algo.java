package Algorithmns.Search_Algo;

//Binary search is considered as most important algorithm as interview based questions.
//This will further elaborate in BinarySearch.java file.


public class BinarySearch_Algo {

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        try {

            while (start <= end) {
                //Find the middle element.
//                int mid = (start+end) / 2 //might be possible that int mid will exceed Integer.MIN_VALUE.
                int mid = start + (end - start) / 2; //i.e, 2start + end - start = start + end.

                //This is an Ascending BinarySearch algorithm it can be descending by just
//          reversing the operators in if-else conditions.

//               =>For Ascending
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
//                    return arr[mid];// it gives value in that index
                    return mid;
                }

//              =>For Descending
//                if (target > arr[mid]) {
//                    end = mid - 1;
//                } else if (target < arr[mid]) {
//                    start = mid + 1;
//                }else {
//                    return mid;
//                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    //Order Agnostic Binary search algorithms identifies if that sorted array is ascending or descending then search in it.
    static int OrderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAscending;

//      Optimised version is
        isAscending = arr[start] <= arr[end];

//        Or
//        if (arr[start] <= arr[end]){
//            isAscending = true;
//        }else isAscending= false;

        while (start <= end) {
            //Find the middle element.
//                int mid = (start+end) / 2 //might be possible that int mid will exceed Integer.MIN_VALUE.
            int mid = start + (end - start) / 2; //i.e, 2start + end - start = start + end.


            if (arr[mid] == target) {
                return mid;
            }

            //Using nested if-else to distinguished between ascending or descending.
            if (isAscending) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int target = 11;


//        int[] arr1 = {-21,-18,-11,-5,-2,0,4,8,10,11,15,18,19,23,28,30};
//
//        int ans = binarySearch(arr1,target);//will gives target's index.
//        System.out.println(ans);

        int[] arr2 = {-21, -18, -11, -5, -2, 0, 4, 8, 10, 11, 15, 18, 19, 23, 28, 30};
        int[] arr3 = {101, 61, 46, 32, 25, 21, 19, 13, 11, 5, 1, 0, -11};
        int ans2 = OrderAgnosticBS(arr2, target);
        int ans3 = OrderAgnosticBS(arr3, target);
        System.out.println(ans2);
        System.out.println(ans3);
    }

}
