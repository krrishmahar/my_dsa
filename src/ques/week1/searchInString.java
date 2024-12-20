package ques.week1;

public class searchInString {

    static boolean searchChar(String str, char ch){
        if (str.isEmpty()){
            return false;
        }
        for (char c : str.toCharArray()){
            if (ch == c){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String name = "krrish";
        char k = 'k';
        System.out.println(searchChar(name,k));

    }

}
