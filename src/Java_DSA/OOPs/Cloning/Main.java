package Java_DSA.OOPs.Cloning;

import java.util.Arrays;

public class Main {
        //This is way to implement clonable interface
        //merits -> to clone large arrays
        //demerits -> nit much abstraction
        public static void main(String[] args) throws CloneNotSupportedException {

            int[] arr = {1,2,3,4,5,6};
            Human krrish = new Human( 19, "Krrish", arr);

    //        Human clone = (Human) krrish.clone();
            Human shallowClone = (Human) krrish.clone();
//            CloneHuman cloneHuman = new CloneHuman(19,"krrish", arr); //shallowclone since regular parametrized constructor is used

            CloneHuman original = new CloneHuman(19, "krrish", arr);
            CloneHuman cloneHuman = new CloneHuman(original);

            arr[0] = 11;
            System.out.println(Arrays.toString(krrish.arr));
            System.out.println(Arrays.toString(shallowClone.arr));
            System.out.println(Arrays.toString(cloneHuman.arr));

            cloneHuman.arr[0] = 19;

            System.out.println(Arrays.toString(krrish.arr));
            System.out.println(Arrays.toString(shallowClone.arr));
            System.out.println(Arrays.toString(cloneHuman.arr));
        }
}
