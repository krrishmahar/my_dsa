package krrishna.arrays;

class largestNum {
    static int getLargestUnsorted(int[] nums){
        int largest = Integer.MIN_VALUE;
        if (nums.length == 0)   return -1;
        for (int i=0; i<= nums.length-1; ++i) {
            if (largest < nums[i])
                largest = nums[i];
        }
        return largest;
    }

    static void main() {
        int[] var1 = new int[]{2, 6, 50, 4, 8, 10};
        int var2 = getLargestUnsorted(var1);
        System.out.println("Largest Numeber is " + var2);
    }
}
