package Java_DSA.OOPs.Cloning;

public class CloneHuman {
    int age;
    String name;
    int[] arr;

    public CloneHuman(CloneHuman other) {
        this.age = other.age;
        this.name = other.name;

        // Deep copy the array securely without using clone()
        if (other.arr != null) {
            this.arr = other.arr.clone();
        }
    }

    public CloneHuman(int age, String name, int[] arr) {
        this.age = age;
        this.name = name;
//        this.arr = arr;
        this.arr = (arr != null) ? arr.clone() : null; //better way to not trust outside reference
    }


}
//    Why the Copy Constructor is superior to clone():
//    No exceptions: You don't have to throw or catch CloneNotSupportedException.
//    No type casting: You call it with Human twin = new Human(original); (no (Human) cast needed).
//    Works with final fields: You can initialize final arrays easily inside a constructor.
