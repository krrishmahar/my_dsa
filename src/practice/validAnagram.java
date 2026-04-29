package practice;

public class validAnagram {
    static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        //s and t should be lowercase
        s = s.toLowerCase();
        t = t.toLowerCase();

        int[] count = new int[26];
        //increment count char till s
        for (int inc : s.toCharArray()){
            ++count[inc -'a'];
        }

        //decrement count
        for (int dec : t.toCharArray()){
            --count[dec - 'a'];
        }

        //check for all count to be zero, not the sum of count
        for (int num : count ){
            if (num != 0)   return false;
        }
        return true;
    }

    boolean isAnagram2(String s, String t) {

        if (s.length() != t.length()) return false;

        int[] AlphaMap = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            ++AlphaMap[index]; //Incrementing value of Alphabet

            index = t.charAt(i) - 'a';
            --AlphaMap[index];
        }

        for (int i=0; i<AlphaMap.length; i++){
            if (AlphaMap[i] != 0) return false;
        }

        return true;
    }


    static void main() {
        String s = "Anagram", t = "nagaram";
        boolean mal = isAnagram(s,t);
        System.out.println(isAnagram("ANAGRAM",t));

        System.out.println(mal);

    }
}

