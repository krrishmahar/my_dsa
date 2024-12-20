package Java_DSA.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Recursion_18 {
//    Questions on Subset, Subsequence & String questions.

    //    ques 1 :-
//    static void skip(String processed, String unpros) {
//        if (unpros.isEmpty()) {
//            return;
//        }
//
//        char ch = unpros.charAt(0);
//        if (ch == 'a') {
//            skip(processed, unpros.substring(1));
//        } else {
//            skip(ch + processed, unpros.substring(1));
//        }
//    }
//
//    static String skip2(String up) {
//        if (up.isEmpty()) {
//            return "";
//        }
//        char ch = up.charAt(0);
//        if (ch == 'a') {
//            return skip2(up.substring(1));
//        } else {
//            return ch + skip2(up.substring(1));
//        }
//    }
//
//    //Ques 2 :- skip a String/word - "FOX"
//    static String ans2(String str) {
//        if (str.isEmpty()) {
//            return str;
//        }
//        String lowerstr = str.toLowerCase();
//        String ignore = "fox";
//        if (lowerstr.startsWith(ignore)) {
//            return ans2(str.substring(4));
//        } else {
//            return str.charAt(0) + ans2(str.substring(1));
//        }
//    }
//
////    Ques 3 : Subsequences ->
//    static void subseq(String p, String up){// gives all possible string combinations of a String.
//        if (up.isEmpty()){
//            System.out.println(p);
//            return;
//        }
//
//        char ch = up.charAt(0);
//         subseq(p+ch, up.substring(1));
//         subseq(p, up.substring(1));
//    }
//
//    //    Ques 4 : Subsequences with ArrayList->
////    Better space complexity since it doesn't create new String.
//
//    static ArrayList<String> subseq2(String p, String up){// gives all possible string combinations of a String.
//        if (up.isEmpty()){
//         ArrayList<String> list = new ArrayList<>();
//         list.add(p);
//         return list;
//        }
//
//        char ch = up.charAt(0);
//        ArrayList<String> left =  subseq2(p+ch, up.substring(1));
//         ArrayList<String> right = subseq2(p, up.substring(1));
//
//         left.addAll(right);
//         return left;
//    }
////    Ques 5 : Return the string with its ASCII value.
//
//    static ArrayList<String> subseq3_2(String p, String up){
//        if (up.isEmpty()){
//            ArrayList<String> list = new ArrayList<>();
//            list.add(p);
//            return list;
//        }
//
//        char ch = up.charAt(0);
//        ArrayList<String> first =  subseq3_2(p+ch, up.substring(1));
//        ArrayList<String> second = subseq3_2(p, up.substring(1));
//        ArrayList<String> third = subseq3_2(p + (ch+0), up.substring(1));
//
//        first.addAll(second);
//        first.addAll(third);
//        return first;
//    }
//    static void subseq3_1(String p, String up){// gives all possible string combinations of a String.
//        if (up.isEmpty()){
//            System.out.println(p);
//            return;
//        }
//
//        char ch = up.charAt(0);
//        subseq3_1(p+ch, up.substring(1));
//        subseq3_1(p, up.substring(1));
//        subseq3_1(p + (ch+0), up.substring(1));
//    }
//
////    Ques 6: Whole recursive programs in Iteration format.
//
//    static List<List<Integer>> subsequence(int[] arr){
//        List<List<Integer>> outer = new ArrayList<>();
//
//        outer.add(new ArrayList<>());//outer list gonna have internal list
//
//        for (int num: arr) {
//            int n = outer.size();
//            for (int i = 0; i < n; i++) {
//                List<Integer> internal = new ArrayList<>(outer.get(i));
//                internal.add(num);
//                outer.add(internal);
//            }
//
//        }
//    return outer;
//    }
//
//    static List<List<Integer>> subsequence2(int[] arr){
//        Arrays.sort(arr);
//        List<List<Integer>> outer = new ArrayList<>();
//        int start = 0;
//        int end = 0;
//
//        outer.add(new ArrayList<>());//outer list gonna have internal list
//
//        for (int a =0;a<arr.length; a++) {
//            start = 0;
//            //if current and previous element are same, s = e + 1
//            if (a>0 &&  arr[a] == arr[a - 1]){
//                start = end + 1;
//            }
//            end = outer.size() - 1;
//            int n = outer.size();
//            for (int i = 0; i < n; i++) {
//                List<Integer> internal = new ArrayList<>(outer.get(i));
//                internal.add(arr[i]);
//                outer.add(internal);
//            }
//
//        }
//    return outer;
//    }
//
//    static List<List<Integer>> subsetDuplicate(int[] arr) {
//        Arrays.sort(arr);
//        List<List<Integer>> outer = new ArrayList<>();
//        outer.add(new ArrayList<>());
//        int start = 0;
//        int end = 0;
//        for (int i = 0; i < arr.length; i++) {
//            start = 0;
//            // if current and previous element is same, s = e + 1
//            if (i > 0 && arr[i] == arr[i-1]) {
//                start = end + 1;
//            }
//            end = outer.size() - 1;
//            int n = outer.size();
//            for (int j = start; j < n; j++) {
//                List<Integer> internal = new ArrayList<>(outer.get(j));
//                internal.add(arr[i]);
//                outer.add(internal);
//            }
//        }
//        return outer;
//    }
//

    static void Permutaion(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
        }

        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            Permutaion(first + ch + second, up.substring(1));
        }
    }

    static int PermutaionCount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            count = count + PermutaionCount(first + ch + second, up.substring(1));
        }
        return count;
    }

    public static void main(String[] args) {


//      String sr =  skip2("baccdha");
//        System.out.println(sr);
//skip("","Buddha");

//        String ans2 = ans2("The quick brown lazy fox jumps over a lazy dog.");
//        System.out.println(ans2);

//        subseq("","Krrish");
//        subseq3_1("","abc");
//        System.out.println(subseq2("","Krrish"));
//        System.out.println(subseq3_2("","Krrish"));

//        int[] arr = {1,2,3};
//        int[] arr2 = {1,2,3,11};
////        List<List<Integer>> ans6 = subsequence2(arr2);
//        List<List<Integer>> ans7 = subsetDuplicate(arr2);
//        for (List<Integer> list: ans7 ) {
//            System.out.println(list);
//        }
//        List<List<Integer>> ans6_1= subsequence(arr2);
//        will gives duplicate elements
//         Permutaion("","abc");
        System.out.println(
                PermutaionCount("", "Krrish") //return number of substrings of string
//                The formula is String!
        );

    }
}
