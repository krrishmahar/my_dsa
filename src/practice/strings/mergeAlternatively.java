package practice.strings;

public class mergeAlternatively {

    //cleaner approach


    static String mergeAlternately(String word1, String word2) {
        //2 pointer approach
        int i=0, j=0;
        StringBuilder ans = new StringBuilder();
        while (i < word1.length() && j < word2.length()){
            ans.append(word1.charAt(i));
            ans.append(word2.charAt(j));
            i++;
            j++;
        }
        //if one string ends before other, add remaining char of that string
        while (i>0 && i<word1.length()){
            ans.append(word1.charAt(i));
            i++;
        }
        while (j>0 && j<word2.length()){
            ans.append(word2.charAt(j));
            j++;
        }
        return ans.toString();
    }

}
