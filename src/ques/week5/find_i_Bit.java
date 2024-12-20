package ques.week5;

public class find_i_Bit {
    public static void main(String[] args) {

        System.out.println(findI(86,6));

    }

    static int findI(int num, int i){
        return num & (1 << i);
    }

}
