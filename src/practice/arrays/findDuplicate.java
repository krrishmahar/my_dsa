package practice;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/find-the-duplicate-number/
//Ques says No extra space and no modification to array nums
//So, hashMap and sorting the array are invalidated
/// Floyd Cycle Detection Algo
///
/// int[] nums = [1,3,4,2,1]
///		   0,1,2,3,4
///
/// int slow = fast = nums[0]; // value = 1
/// for  i = 0 -> nums.length
///	slow = nums[slow]
///	fast = nums[nums[fast]]
///
/// slow : 1, 3, 2, 4, 1
/// fast : 1, 2, 1, 2, 1
///
/// slow = nums[0]
///
/// for  i = 0 -> nums.length
///	slow = nums[slow]
///	fast = nums[fast]
///
/// slow : 1, 3, 2, 4, 1
/// fast : 1, 3, 2, 4, 1
///
/// return fast or slow
public class findDuplicate {

    //Uses nested loop with O(n2)
    //fails for some operation, not optimal at all
    static int findDuplicate(int[] nums){
            for (int i=0; i<nums.length; i++){
                for (int j=i+1; j<nums.length; j++){
                    if (nums[i] == nums[j]) return nums[i];
                }
            }
            return -1;
    }

    // Using Floyd Cycle detection Algo -> O(n)
    //Use this
    static int findDuplicate2(int[] nums){
       if (nums.length == 0) return -1;
       int slow = nums[0], fast = nums[0];
       do {
           slow = nums[slow];
           fast = nums[nums[fast]];
       } while (fast != slow);

       //Reset one pointer to start
        slow = nums[0];

        //move one pointer at time
        while (fast != slow){
            slow = nums[slow];
            fast = nums[fast];
        }

        return fast;
    }

    static void main() {
        int[] nums = {1,3,4,2,2};
        int[] nums2 = {1,3,4,2,1};
        int[] nums3 = {2,5,9,6,9,3,8,9,7,1};
        System.out.println(findDuplicate2(nums2));

    }
}
