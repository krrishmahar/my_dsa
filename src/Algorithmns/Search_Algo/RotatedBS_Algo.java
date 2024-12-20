package Algorithmns.Search_Algo;

public class RotatedBS_Algo {

    public static void main(String[] args) {
        int[] main = {4, 5, 6, 7, 8, 1, 2, 3};
//        This isn't sorted so binary search is inapplicable.
//        Hence, we use rotated binary search.


    }

    static int RBS(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int mid = s + (e - s) / 2;
        if (arr[mid] == target) {
            return mid;
        }

        if (arr[s] < arr[mid]) {
            if (target >= arr[s] && target <= arr[mid]) {
                return RBS(arr, target, s, mid - 1);
            } else {
                return RBS(arr, target, mid + 1, e);
            }
        }

        if (target >= arr[mid] && target <= arr[e]) {
            return RBS(arr, target, mid + 1, e);
        }

        return RBS(arr, target, s, mid - 1);


    }

}
