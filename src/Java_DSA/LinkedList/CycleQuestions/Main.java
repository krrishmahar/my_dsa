package Java_DSA.LinkedList.CycleQuestions;

import Java_DSA.LinkedList.LinkedList_XX;

public class Main {
    protected static class ListNode extends LinkedList_XX {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }

        public ListNode() {

        }
    }

    // https://leetcode.com/problems/linked-list-cycle
    // Amazon and Microsoft
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    // find length of the cycle
    public int lengthCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                // calculate the length
                ListNode temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);
                return length;
            }
        }
        return 0;
    }

    // https://leetcode.com/problems/linked-list-cycle-ii/
    public ListNode detectCycle(ListNode head) {
        int length = 0;

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                length = lengthCycle(slow);
                break;
            }
        }

        //if no cycle is present return null
        if (length == 0) {
            return null;
        }

        //find the start node
        ListNode f = head;
        ListNode s = head;
        while (length > 0) {
            s = s.next;
            length--;
        }

        //keep moving both forward and they will meet at cycle start
        while (f != s) {
            f = f.next;
            s = s.next;
        }

        return s;

    }

    //    Happy Number - Google ques
//    https://leetcode.com/problems/happy-number/description/
    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while (fast != slow);

//        if (slow == 1){
//            return true;
//        }
//        return false;
        return slow == 1;
    }

    private static int findSquare(int n) {
        int ans = 0;
        while (n > 0) {
            int rem = n % 10;
            ans += rem * rem;
            n /= 10;
        }
        return ans;
    }

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {

        Main cycle = new Main();
        ListNode list = new ListNode(1);

        System.out.println(isHappy(11));


    }
}
