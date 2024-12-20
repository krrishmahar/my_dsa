package Algorithmns.Search_Algo;

//Most important file of this package, extremely useful for interview questions,
//This will explain and solve 11 important questions that are surely asked in an Interview.


import java.util.Scanner;

public class BinarySearch_IMP {

    static int ModifiedBinarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {// IMP condition
            int mid = start + (end - start) / 2; //i.e, 2start + end - start = start + end.

            boolean isAscending;
            isAscending = arr[start] <= arr[end];


            if (arr[mid] == target) {
                return mid;
            }
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


    //Returns Greater No. or Target.
    static int Ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAscending;
        isAscending = arr[start] <= arr[end];

        //Condition in which Target No. is greater than the largest No. ->>
        if (target > arr[arr.length - 1]) {
            return -1;
        }

        while (start <= end) {// IMP condition
            int mid = start + (end - start) / 2; //i.e, 2start + end - start = start + end.


            if (arr[mid] == target) {
                return mid;
            }
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

        return start;//condition that changes code
    }

    //returns smaller No. or target No.
    static int Floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAscending;
        isAscending = arr[start] <= arr[end];

        while (start <= end) {// IMP condition
            int mid = start + (end - start) / 2; //i.e, 2start + end - start = start + end.


            if (arr[mid] == target) {
                return mid;
            }
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
        return end;
    }

    static char FindSmallestLetter(char[] letter, char target) {
        int start = 0;
        int end = letter.length - 1;

        boolean isAscending;
        isAscending = letter[start] <= letter[end];
        while (start <= end) { // IMP condition
            int mid = start + (end - start) / 2; //i.e, 2start + end - start = start + end.
            if (isAscending) {
                if (target < letter[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > letter[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return letter[start % letter.length];//condition that changes code
    }

    public int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};

//        int start = search(nums,target,true);
//        int end =  search(nums,target,false);
//        ans[0] = start;
//        ans[1] = end;
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
//  Above code is to print first ans from ans[0] or lst ans from ans[1] in the main function.
//Without this code, answer won't be printed.
        return ans;
    }

    //    This Function just returns the index value of the target.
    static int search(int[] nums, int target, boolean findSearchIndex) {

        int ans = -1;

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) { // IMP condition
            int mid = start + (end - start) / 2; //i.e, 2start + end - start = start + end.

            if (target == nums[mid]) {
                ans = mid;
                //potential start answers and major change in this code.
                if (findSearchIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return ans;
    }

    static int infiniteBinarySearch(int[] arr, int target, int start, int end) {

        //This code will initiate by searching from 0->1 index then doubling it from 2->5 and keep doubling it.
//  If target lies behind initial start, it will find it by using { if (target<arr[mid]){ end = mid -1;} }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid == 0) {
                mid = 0;
            }
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
//                    return arr[mid];// it gives value in that index
                return mid;
            }
        }
        return -1;
    }

    static int Ans5(int[] arr, int target) {

        int start = 0;
        int end = 1;//Initiating from search range of 2 indexes

        //Condition for code to search next chunk

        while (target > arr[end]) {
            int temp = end + 1;//temp will be New start.
            end = end + (end - start + 1) * 2; // new end will : end = previous end + size of previous array*2
//            E.g : int[] arr = {1,2,3,4,5,6,7,8,9,10}; int target = 6; int start= arr[0]; int end = arr[1];
//            start = 1+1  =2
//            end = previous end + size of previous array*2 = 1 + (1-0+1)*2 = 1+4 = index 5.
            start = temp;//Will declare and initiates new start.
        }
        return infiniteBinarySearch(arr, target, start, end);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//    int target = sc.nextInt();
        //1.Find the ceiling of the target in the array.
        // Ceiling of a Number -> Smallest No. that is greater or equal to target.
        int[] arr1_2 = {1, 3, 4, 8, 9, 11, 15, 19, 20, 25, 27, 30, 34, 38, 40};//15 is middle
        // let target = 23;
//      After reducing search size to { 20, 25 }  following required condition for ceiling
//      middle = 20(start), but since [middle != target] and [target > middle(start) ]
//      that says [start = mid+1(end)]. And start(20) and end(25) will be exchanged that violates the while condition
//      and breaks the loop. proceeding to take start(25) = middle, this fulfill the ceiling condition.
//      Since, middle(25) > target it prints 25.
//
//        int ans1 = Ceiling(arr1_2,50);//gives index 9 -> 25
//        System.out.println(ans1);
//
////        2.Floor of the target -> Greatest No. that is lesser or equal to target.
//        int ans2 = Floor(arr1_2,0);//  gives index 8 -> 20. If target is lesser than start No. then it returns index -1.
//        System.out.println(ans2);
//
////        3.Find the Smallest letter greater than the target -> almost Same concept as Ceiling.
//        char[] arr3 = {'a','b','c','e','g','h','i','j','k'};
//        int ans3 = FindSmallestLetter(arr3,'f');
//        System.out.println(ans3);

//        4.Find First and Last Position of Element in Sorted Array
//        int [] arr4 = {1,2,3,3,3,4,4,5,6,7,7};
//        int ans4 = search(arr4,3,true);//gives first index value of 3 i.e, 2
//        int ans5 = search(arr4,3,false);//gives last index value of 3 i.e, 4
//        System.out.println(ans4);
//        System.out.println(ans5);

//        5.Position of an Element in Infinite sorted Array.
/*  Ans : Lord Shiv is only eternal and infinite being.
        There is nothing infinite in system(memory) of computer.
        We have to consider a large array without using .length method as infinite array.
        And to apply BinarySearch, we have to search a large chunk indexes from start/end.
        If not found, search next chunk.
*/
//        int[] arr5 = {1, 3, 7, 11, 14, 15, 16, 17, 19, 23, 29, 30, 31, 32};
//        int[] arr51 = {1, 3, 7, 11, 13, 14, 15, 16, 19, 31, 32};
//        //Due to double progression method, elements in array must 2,6,14,30, and so on.
//        int target = 19;
//        System.out.println(Ans5(arr51,target));

//        int ans5 = Ans5(arr5, 19); //will give index 8
//        System.out.println(ans5);

        /*
        6. Peak index in a Mountain array or Biotonic array.
        Mountain/Biotonic array is an array in which index values first increases then decreases.
    E.g : int[] arr6= {1,2,3,4,5,6,7,6,4,3,2,0}; =>This bring 3 possibilities.
        1. if (arr6[mid] > arr[mid+1]) {end of ascending side = mid; }
        2. if (arr6[mid] < arr[mid+1]) {start = mid +1;}
        3. if (start==end) {both pointing at the same highest No. in mountain array.}
           */
        int[] arr6 = {1, 2, 3, 4, 5, 6, 7, 6, 4, 3, 2, 0};
        int ans6 = peakIndexInMountainArray(arr6);
//        System.out.println(ans6);

//        7.Finding element in mountain/biotonic array.
        int[] arr7 = {1, 3, 4, 5, 8, 9, 11, 14, 16, 19, 23, 25, 30, 15, 10, 5, 0};
        int ans7 = infiniteBinarySearch(arr7, 19, 0, arr7.length - 1);
        System.out.println(ans7);
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            //Both codes find the best possible answer at single time
//            And at the end, both points to the best possible answer in all the array.
            if (arr[mid] > arr[mid + 1]) {
                end = mid;//indicates pointer is in des part of an array.

            } else {//pointer is in asc part of an array
                start = mid + 1;
            }
//      In the end, start==end and both pointing at the greatest element in an array.

        }
        return start;//or return end since atlast both will be same.
    }

    public int findInBiotonicArray(int[] arr, int target) {

        int peak = peakIndexInMountainArray(arr);
        int firstTry = ModifiedBinarySearch(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        //else search in second(des) part of the array.
        return ModifiedBinarySearch(arr, target, peak + 1, arr.length - 1);
    }

}
