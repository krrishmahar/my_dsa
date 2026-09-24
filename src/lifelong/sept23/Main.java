package lifelong.sept23;

import practice.Linkedlist.GenericLinkedList;
import practice.Linkedlist.ListNode;

import java.util.Arrays;
import java.util.List;

public class Main {
    /*
    Questions I did today were:
        - Find the Duplicate Number ✅
        - Duplicate Zeros ✅
        - Remove Duplicates from Sorted Array II ✅
        - Remove Duplicates from Sorted List II ✅
        - Remove Duplicates from Sorted List
    */

    /// REVISION BELOW
    static void main() {

        int[] ques1 = {3,1,3,4,2};
        System.out.println(findDuplicate(ques1));

        int[] ques2 = {1,0,2,3,0,4,5,0};
        duplicateZeros(ques2);
        System.out.println(Arrays.toString(ques2));

        int[] ques3 = {1,1,1,2,2,3}; //give arr.length of less than 2 duplicates k
        System.out.println(removeDuplicates(ques3));

        GenericLinkedList<Integer> ques4 = new GenericLinkedList<>();
//        ques4.addAll();
        ques4.add(1);
        ques4.add(1);
        ques4.add(1);
        ques4.add(2);
        ques4.add(3);
        ques4.display();
//        ListNode ans = deleteDuplicates(ques4);

    }
/*  Q1
    Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
    There is only one repeated number in nums, return this repeated number.
    You must solve the problem without modifying the array nums and using only constant extra space.
    E.g : Input: nums = [1,3,4,2,2]
          Output: 2
*/
    public static int findDuplicate(int[] nums) {
        int fast=nums[0], slow=nums[0];
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }


/*   Q2
     Given a fixed-length integer array arr, duplicate each occurrence of zero,
     shifting the remaining elements to the right.
     Note that elements beyond the length of the original array are not written.
     Do the above modifications to the input array in place and do not return anything.

E.g: Input: arr = [1,0,2,3,0,4,5,0] -> [1,0,0,2,3,0,0,4|,5,0,0]
     Output: [1,0,0,2,3,0,0,4]
     Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
*/
    public static void duplicateZeros(int[] nums){
        int val=0, i=0;
        while (val < nums.length) {
            if (nums[i] == 0)   val += 2;
            else val += 1;
            i++;
        }
        i--; //make it nums.length-1

        int back = nums.length-1;
        if (val > nums.length && nums[i]==0) {
            nums[back--] = 0;
            i--;
        }

        for (int j=i; j >= 0; j--) {
            if (nums[j] == 0) {
                nums[back--] = 0;
                nums[back--] = 0;
            } else {
                nums[back--] = nums[j];
            }
        }
    }

/*  Q3
    Given an integer array nums sorted in non-decreasing order,
    remove some duplicates in-place such that each unique element appears at most twice.
    The relative order of the elements should be kept the same.
    Do it in-place with O(1) extra memory.
    https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/
    */
    public static int removeDuplicates(int[] nums) {
        int l=0, r=0;
        int n= nums.length;
        while (r<n) {
            int count = 1;
            while (r+1 < n && nums[r] == nums[r+1]) {
                count++;
                r++;
            }
            for (int i = 0; i < Math.min(2, count); i++) {
                nums[l] = nums[r];
                l++;
            }
            r++;
        }
        return l;
    }

/*  Q3
    You are given the head of a sorted linked list.
    Delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.
    Return the linked list sorted as well.
    E.g: Input: head = [1,2,3,3,4,4,5]
         Output: [1,2,5]
*/
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr = head;

        while (curr != null) {
            if (curr.next != null && curr.getVal() == curr.next.getVal()) {
                while (curr.next != null && curr.getVal() == curr.next.getVal()) {
                    curr = curr.next;
                }
                prev.next = curr.next;
            } else {
                prev = prev.next;
            }
            curr = curr.next;
        }
        return dummy.next;
    }

}
