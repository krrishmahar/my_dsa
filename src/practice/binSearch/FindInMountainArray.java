package practice.binSearch;

public class FindInMountainArray {
//    https://leetcode.com/problems/find-in-mountain-array/description/

//    interface MountainArray {
//     public int get(int index) {}
//     public int length() {}
// }

    static int findInMountainArray(int target, int[] mountainArr) {
        int s=0, e=mountainArr.length-1;
        while (s<=e) {
            int mid = s+(e-s)/2;
            if (mountainArr[mid] == target) return mid;
            if (mountainArr[s] > mountainArr[e]) {
                //DESC
                if (mountainArr[mid] > target) {
                    s = mid+1;
                } else {
                    e = mid-1;
                }
            } else {
                if (mountainArr[mid] < target) {
                    s = mid+1;
                } else {
                    e = mid-1;
                }
            }
        }
        return -1;
    }

    static void main() {
        int[] arr = {0,2,3,4,2,1,0};
        System.out.println(findInMountainArray(1, arr ));

    }


}
