package krrishna.arrays;

public class unsortedUniquePairs {

    static int COUNT = 0;

    static void main() {
        int[] arr = {2,4,3,5,7,8,1};
        getUniquePairs(arr, 6);
        System.out.println("\nThe count of unique pairs are " + COUNT);
    }

    private static void getUniquePairs(int[] arr, int target) {
        if (arr.length == 0) return;
//        int count = 0;

        for (int i =0; i<arr.length; i++){
            int curr = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target){
                    System.out.printf("(" + curr + "," + arr[j] + ") ");
                    COUNT++;
                }
            }
        }
    }

//    private static int getUniquePairs(int[] arr, int target) {
//        if (arr.length == 0) return -1;
//        int count = 0;
//
//        for (int i =0; i<arr.length; i++){
//            int curr = arr[i];
//            for (int j = i+1; j < arr.length; j++) {
//                if (arr[i] + arr[j] == target){
//                    System.out.printf("(" + curr + "," + arr[j] + ") ");
//                    count++;
//                }
//            }
//        }
//        return count;
//    }

}
