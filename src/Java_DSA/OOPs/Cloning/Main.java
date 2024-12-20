package Java_DSA.OOPs.Cloning;

import java.util.Arrays;

public class Main {
    //This is way to implement clonable interface
    //merits -> to clone large arrays
    //demerits -> nit much abstraction
    public static void main(String[] args) throws CloneNotSupportedException {

        Human krrish = new Human("Krrish", 19);
        Human clone = new Human(krrish);

//        Human clone = (Human) krrish.clone();
//        System.out.println(clone.age + " "+ clone.name);

        System.out.println(Arrays.toString(clone.arr));
        clone.arr[0] = 14;
        System.out.println(Arrays.toString(krrish.arr));
        System.out.println(Arrays.toString(clone.arr));


    }

}
