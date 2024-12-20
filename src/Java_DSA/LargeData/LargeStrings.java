package Java_DSA.LargeData;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Arrays;

public class LargeStrings {


    public static void main(String[] args) {

        //if multiple thread and thread safety -> String Buffer
        //not multiple thread abd faster -> String Builder

        //String Buffer is mutable sequence of char
        //-> Mutable, Efficient, Thread safe-> means only one thread can access that object making it slow but safe

        //Constructor 1 :
        StringBuffer sb = new StringBuffer();
        //Constructor 2 :
        StringBuffer sb2 = new StringBuffer("String 2");
        //Constructor 3 :
        StringBuffer sb3 = new StringBuffer(20);
        sb.append("DevOps is ");

        String str = sb.toString();
        System.out.println(str.concat("great"));

        //random string
        String r = RandomString.generateString(15);
        System.out.println(r);

        //removing whitespaces
        String sr = "hello this   has      no           white                    spaces";
        System.out.println(sr);
        System.out.println(sr.replace(" ",""));
        System.out.println(sr.replaceAll("\\s",""));

        //split
        String names = "Krrish,Yash,Vedant";
        System.out.println(Arrays.toString(names.split(",")));

        //formating
        DecimalFormat dc = new DecimalFormat("00.0000");
        System.out.println(dc.format(7.2978955));
    }

}
