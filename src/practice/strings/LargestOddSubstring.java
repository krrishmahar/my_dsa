package practice.strings;

public class LargestOddSubstring {
    static String findLargestOddSubstring(String num) {
        //write your code here...
        if (num == null || num.isEmpty()) {
            return "-1";
        }

        for (int i = num.length()-1; i>=0; i--){
            char ch = num.charAt(i);
            //  if (ch=='1' || ch=='3' || ch=='5' || ch=='7' || ch=='9'){
            if ((ch - '0') % 2 != 0){
                return num.substring(0,i+1);
            }
        }
        return "-1";
    }

    static void main() {
        System.out.println(findLargestOddSubstring("128764"));
    }
}
