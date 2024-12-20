package Java_DSA.OOPs.Polymorphism;

public class ObjectPrint {
    int num;

    public ObjectPrint(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Bitch, ya didn't called any meths or instances" +
                "\nWhat are ya smoking?";
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(11);
        ObjectPrint obj2 = null;
        System.out.println(obj);
//        Since, every class created extends Object class. So, if no func() of class is called
//        then, it goes to println() -> valueOf() ->(obj==null) print("null") : obj.toString()
//        -> return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
}
