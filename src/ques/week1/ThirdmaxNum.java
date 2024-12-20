package ques.week1;

import java.util.ArrayList;

public class ThirdmaxNum {

        static int thirdMax(int[] nums) {
            if (nums.length ==0){
                return -1;
            }
            int max=0;
            ArrayList<Integer> list = new ArrayList<Integer> (noRepeat(nums));
            for (int i= 0;i < nums.length;i++){
                if ((i+1)%3 == 0){
                    max = list.get(i);
                }else {
                    if ((i >0) && (nums.length%3==2)){
                        max = list.getLast();
                    }
                }
            }
            return max;
        }

        private static void swap(int x, int y){
            int temp = x;
            x=y;
            y=x;
        }

        static ArrayList<Integer> noRepeat(int[] num){
            ArrayList<Integer> list = new ArrayList<>();
            for (int i=0; i< num.length-1; i++){
                if (num[i+1] < num[i]){
                    swap(i+1,i);
                }
            }
            for (int n=0;n<num.length;n++){
                for (int nn=0;nn <num.length;nn++){
                    if (num[n] != num[nn]){
                        list.add(num[n]);
                    }
                }
            }
            return list;
        }

    public static void main(String[] args) {
        int[] num= new int[]{1,2};
        int ans = thirdMax(num);
        System.out.println(ans);
    }

    }

