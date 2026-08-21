package practice.slidingWindow;

import java.util.Arrays;

public class CountOccurenceOfAnagram {

        static void main() {
            String pat = "for";
            String txt = "forxxorfxdofr";
            System.out.println(search(pat, txt));
        }

        static int search(String pat, String txt) {
            int count = 0;
            int[] freqTxt = new int[26];
            int[] freqPat = new int[26];
            int n = txt.length();
            int k = pat.length();

            for(int i = 0; i < k; i++){
                freqTxt[txt.charAt(i) - 'a']++;
            }

            for(int i = 0; i < k; i++){
                freqPat[pat.charAt(i) - 'a']++;
            }

            if(Arrays.equals(freqPat, freqTxt)){
                count++;
            }

            int windowStart = 0;
            int windowEnd = k;

            while(windowEnd < n){
                freqTxt[txt.charAt(windowStart) - 'a']--;
                windowStart++;

                freqTxt[txt.charAt(windowEnd) - 'a']++;
                windowEnd++;

                if(Arrays.equals(freqPat, freqTxt)){
                    count++;
                }
            }

            return count;

    }
}
