package practice;

import java.util.HashSet;
import java.util.Set;

class longestSubstringWithoutRepeatingChar {

    static int lengthOfLongestSubstring(String s) {
//        Set<String> charSet = new HashSet<>();
//        int left = 0;
//
//        int i = s.length();
//        int ss = s.toCharArray();
//        for (int right : s.toCharArray()){
//            while (i > 0){
//                charSet.remove(ss[left]);
//                ++left;
//                i--;
//            }
//            charSet.add(ss[right]);
//            return Math.max(0, right - left -1);
//        }
        return -1;
    }

    static void main() {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
