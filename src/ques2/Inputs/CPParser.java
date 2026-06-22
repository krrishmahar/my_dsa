package ques2.Inputs;
import java.util.*;

public class CPParser {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        System.out.println(parseString(str1));

        // 2. Parsing a 1D Integer Array
        String raw1D = "[1,2,3,4,5,6,7]";
        int[] parsed1D = parse1DArray(raw1D);
        System.out.println("Parsed 1D Array: " + Arrays.toString(parsed1D));

        // 3. Parsing a 2D Integer Array (Ragged Array)
//        String raw2D = "[[1,2,3],[4,5,6,7]]";
//        int[][] parsed2D = parse2DArray(raw2D);
//        System.out.println("Parsed 2D Array: " + Arrays.deepToString(parsed2D));
//
//        // 4. Parsing a Mixed Array (Characters and Numbers)
//        String rawMixed = "['M',2,3,'K',5,6,7]";
//        Object[] parsedMixed = parseMixedArray(rawMixed);
//        System.out.println("Parsed Mixed Array: " + Arrays.toString(parsedMixed));
    }


    static String parseString(String str){
        return str.replaceAll("\"","");
    }
    static int[] parse1DArray(String str){
        String cleanS = str.replaceAll("\\[|\\]","");
        if (cleanS.isEmpty())   return new int[0];

        String[] parts = cleanS.split(",");

        int[] arr = new int[parts.length];
        for (int i=0; i< arr.length; i++){
            arr[i] = Integer.parseInt(parts[i].trim());
        }
        return arr;
    }
}
