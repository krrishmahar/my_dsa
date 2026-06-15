package practice.strings;

import java.util.Scanner;

//https://www.codechef.com/practice/course/strings/STRINGS/problems/TITLECASE
public class convertToTiltledCase {

    //TIme -> O(n2)
    static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T --> 0){
            String line = sc.nextLine().trim();
            String[] words = line.split(" ");

            StringBuilder res = new StringBuilder();

            for (int i=0; i<words.length; i++){
                String word = words[i];

                if (word.equals(word.toUpperCase())){
                    res.append(word);
                } else {
                    String titledCased = word.substring(0,1).toUpperCase() +
                            word.substring(1).toLowerCase();
                    res.append(titledCased);
                }
                // Add a space between words, but not after the last word
                if (i < words.length - 1) {
                    res.append(" ");
                }
            }
            System.out.println(res);
        }
        sc.close();
    }
}
