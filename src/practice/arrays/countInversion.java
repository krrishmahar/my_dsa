package practice.arrays;

public class countInversion {

    static int countInv(int[] arr) {
            int count =0;
            for (int i=0; i<arr.length; i++) {
                for (int j=i+1; j<arr.length; j++) {
                    if (arr[i] > arr[j] && i < j) {
                        count++;
                    }
                }
            }
            return count;
        }

//        static int countInvMerge(int[] arr) {
//        if (arr.length == 0)    return -1;
//
//
//
//        return -1;
//        }


    static void main() {
//        int[][] requirements = {{2,2},{0,0}};
//        int[] arr = {1,2,3,4,5};
        int[] arr = {4,3,2,1};
//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
//        Collections.reverse(List.of(arr));
        int ans = countInv(arr);
        System.out.println(ans);
    }

}
