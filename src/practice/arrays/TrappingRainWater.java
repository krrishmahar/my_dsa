package practice.arrays;

public class TrappingRainWater {

    static int trap(int[] height) {
        int n = height.length;
        if (n< 2)
            return -1;
        int l = 0, r = n-1;
        int leftMax = Integer.MIN_VALUE, rightMax = Integer.MIN_VALUE;
        int water = 0;

        while (l<r) {
            leftMax  = Math.max(leftMax, height[l]);
            rightMax = Math.max(rightMax, height[r]);

            if (leftMax < rightMax) {
                water += leftMax - height[l];
                l++;
            } else {
                water += rightMax - height[r];
                r--;
            }
        }
        return water;
    }

    static void main() {
    int[] height = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
    System.out.println(trap(height));
    }
}
