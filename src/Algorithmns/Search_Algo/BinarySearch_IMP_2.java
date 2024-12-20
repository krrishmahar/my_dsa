package Algorithmns.Search_Algo;

public class BinarySearch_IMP_2 {

    //Below code cannot find the duplicate No. from rotated array.

    //Use this for array with non-duplicate index values.
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            //4 cases :
            if (mid < end && arr[mid] > arr[mid + 1]) {//mid is pivot and is greatest element
                return mid;
            } else if (mid > start && arr[mid] < arr[mid - 1]) {//mid-1 is pivot and also larger than mid.
                return mid - 1;
            } else if (arr[mid] <= arr[start]) {//case in which pivot is in start.
                end = mid - 1;
            } else {//condition in which mid is not pivot
                start = mid + 1;
            }

        }
        return -1;
    }

    public static int search(int[] nums, int target) {

//    This won't work for array with duplicate values.

//    int pivot = findPivot(nums);

        int pivot = findPivotWithDuplicate(nums);//Modification

        //if you did not find pivot then array is non-rotary.
        if (pivot == -1) {
            //just run Normal binary search
            return binarySearch(nums, target, 0, nums.length - 1);
        }

//  if pivot is found, then there are 2 asc sorted array
        if (nums[pivot] == target) {
            return pivot;
        }
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }

        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    static int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {// IMP condition
            int mid = start + (end - start) / 2; //i.e, 2start + end - start = start + end.

            if (nums[mid] == target) {
                return mid;
            }

            if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
//        8.Search in a rotated sorted array.
//        What is rotating array?
// Ans :  int[] arr8 = {1,2,3,4,5,6,7,8,9,10,11}; after 1 rotation
//        int[] arr8 = {11,1,2,3,4,5,6,7,8,9,10}; //pivot == 11;
//      To search in rotated array, we consider an element as pivot.
//pivot element is the largest element in array that draws line from other part of asc array.

//        int[] arr8 = {1,2,3,4,5,6,7,8,9,10,11};
//        int[] arr8 = {11,1,2,3,4,5,6,7,8,9,10,};
//        int ans8 = search(arr8,5);
//        System.out.println(ans8);

//        9.Search of duplicate No. in a rotated sorted array.
//      Same as previous code, but you have to skip the duplicate No. from the array.
//        int[] arr9 = {11,1,2,3,4,5,5,6,7,7,7,8,9,10,11};

//        int ans9_1 = search(arr9,8);//will print index 11
//        int ans9_2 = search(arr9,11);//will print index 0
////        System.out.println(ans9_2);
//        System.out.println(ans9_1);

//        10. Rotation count of a rotary binary search array.
//        rotation count can be easily known by index of pivot from its primary position.
//        If pivot == index 0 after 3 rotations it wil be at
//        int[] arr10 = {11,1,2,3,4,5,5,6,7,7,7,8,9,10,11};//gives 1  from formula pivot+1 = 0+1
//        int[] arr10_2 = {5,6,7,8,1,2,3,4};//gives 4 by pivot(8) +1 = index 4 + 1 = 5 rotations
//        System.out.println(rotationCount(arr10));
//        System.out.println(rotationCount(arr10_2));

        //11.Split array largest sum.
//        int[] arr11 = {7,2,5,10,8};  let int m = No. of parts array can be divided; m = 2;
//        An array to sub-array must be continuous. And should give largest sum value.

//        E.g, not associated with question.
//        Maximum No. of sub-arrays from array, m = arr.length-1;-> {7,2,5,10,8}  ->{7}{2}{5}{10}{8} ->> 32.
//     => int max  = sum of all elements in an array. = 32;

//        Minimum No. of sub-arrays from array, m = 1; -> {7,2,5,10,8} -> {10} ->> 10.
//     => int min = max value of an array(from sub-arrays) = 10;

        int[] arr11 = {7, 2, 5, 10, 8};
        int ans11 = ModifiedSplitArray(arr11, 2);
        System.out.println(ans11);


    }

    public int splitArray(int[] nums, int parts) {
        int start = 0;
        int end = 0;

        for (int j : nums) {
            start = Math.max(start, j);//in the end, loop will contain max item from array.
            end += j;//similar to linear search

        }
        //binary search
        while (start < end) {
            //try to put mid as potential answer
            int mid = start + (end - start) / 2;

//            calculate how many pieces ya can divide this in with this max sum.
            int sum = 0;
            int piece = 1;

            for (int num : nums
            ) {
                if (sum + num > mid) {
                    //you cannot add this in sub-array, make new one.
                    //say you add this num in new sub-array, then sum = new.
                    sum = num;
                    piece++;
                } else {
                    sum += num;
                }
            }
            if (piece > parts) {
                start = mid + 1;
            } else {
                end = mid;
            }

        }
        return end;
    }


    static int check(int[] arr, int mid) {
        int count = 1;
        int sum = 0;
        for (int j : arr) {
            sum += j; //arr.elements get added
            if (sum > mid) {//becomes true after sum of 7,2,5,10,sum = 24,mid = 21
                count++;
                sum = j;//converts sum= 10; then in next loop, sum = 18;
                // And this condition becomes false and return count.
            }
        }
        return count;
    }

    public static int ModifiedSplitArray(int[] arr, int parts) {
        if (parts > arr.length) {
            return -1;
        }
        int low = 0;
        int high = 0;
        for (int j : arr) {
            low = Math.max(low, j); //low : 0,1,2,3,4 becomes -> j : 7,2,5,10,8
            // but due to max method                  -> low = maxElement(); = 10;
            high += j;//every No. get added and atlas -> high = 32; And loop breaks;
        }

        while (low < high) {
            int mid = low + (high - low) / 2;
            int subArraysCount = check(arr, mid);
            if (subArraysCount > parts) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }


    //Use this for array with duplicate index values.
    static int findPivotWithDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            //4 cases :
            if (mid < end && nums[mid] > nums[mid + 1]) {//mid is pivot and is greatest element
                return mid;
            } else if (mid > start && nums[mid] < nums[mid - 1]) {//mid-1 is pivot and also larger than mid.
                return mid - 1;
            } else if (nums[mid] <= nums[start]) {//case in which pivot is in start.
                end = mid - 1;
            } else {//condition in which mid is not pivot
                start = mid + 1;
            }

            //Modifications :
//              if elements at middle, start, end are equal then just skip the duplicate.
            if (nums[mid] == nums[start] && nums[mid] == nums[end]) {
                //skip the duplicate.

                //Note : what if elements at start and end were the pivot
                //ya gotta check it.

                if (nums[start] > nums[start + 1]) {
                    return start;
                }
                start++;
                if (nums[end] < nums[end - 1]) {
                    return end - 1;
                }
                end--;
            } else if (nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end])) {
                //left side is sorted so pivot lies in right side.
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    private static int rotationCount(int[] arr) {
        int pivot = findPivotWithDuplicate(arr);
//    if(pivot == -1){
//        return 0;
//    }
        return pivot + 1;//If no rotation then last index considered as -1 then return -1+1 = 0;
    }
}
