package Java_DSA.OOPs.Cloning;

public class Human implements Cloneable {
    int age;
    String name;
    int[] arr;

    public Human(Human other) {
        this.age = other.age;
        this.name = other.name;
    }


    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Human(String name, int age) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{1, 2, 3, 4, 5, 6};
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("This is deep copy");
        Human twin = (Human) super.clone(); // this is actually shallow copy

        //make a deep copy
        twin.arr = new int[twin.arr.length];
        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }

//    @Override
//    public Object clone() throws CloneNotSupportedException{
//        System.out.println("This is Shallow copy");
//        return super.clone();
//    }


}
