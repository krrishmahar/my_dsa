package Algorithmns.Just4Fun_Algo;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Addition2 {

    static int addition(int n) {
        int ans=0;
        while (n > 0)  {
            ans += n;

            n--;
        }
        return ans;
    }

    static int addition2(int[] n) {
        int ans = 0;
        for (int i=0;i<n.length;i++) {
            ans += n[i];
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] arr = {3,4,5,0,0,0};
        System.out.println(addition(5));
        System.out.println(addition2(arr));
    }
}
