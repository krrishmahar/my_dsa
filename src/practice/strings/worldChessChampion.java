package practice.strings;
import java.util.*;
import java.lang.*;
import java.io.*;

//https://www.codechef.com/practice/course/strings/STRINGS/problems/WCC
public class worldChessChampion {

    /*  Inputs
    *   4
        100
        CCCCCCCCCCCCCC
        400
        CDCDCDCDCDCDCD
        30
        DDCCNNDDDCCNND
        1
        NNDNNDDDNNDNDN
    * */

        static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            while (T --> 0){ //while ( (T--) > 0 )
                int X = sc.nextInt();
                String str = sc.next();
                ptsForCarlsen(str, X);
            }
            sc.close();

        }

        static void ptsForCarlsen(String str, int X) {
            int pointC=0, pointN=0;

            for (char ch : str.toCharArray()) {
                if (ch=='C')         pointC +=2;
                else if (ch=='N')    pointN +=2;
                else {
                    ++pointC;
                    ++pointN;
                }
            }
            if (pointC > pointN){
                System.out.println(60*X);
            } else if (pointC < pointN){
                System.out.println(40*X);
            } else{
                System.out.println(55*X);
            }
        }
}
