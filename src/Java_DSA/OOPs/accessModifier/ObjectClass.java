package Java_DSA.OOPs.accessModifier;

import Java_DSA.OOPs.Human;

public class ObjectClass {

//    Object class is class which is internally implemented to all objs made since java doesn't support multiple inheritance
//    Object class has some methods which can be overriden by Ctr+O or Alt+Ins -> Override methods

    int num;
    float cgp;

    public ObjectClass(int num, float cgp) {
        this.num = num;
        this.cgp = cgp;
    }

    public ObjectClass(int num) {
        this.num = num;
    }

//    @Override
//    protected void finalize() throws Throwable { //calls during garbage collection to let user know that obj is being deleted
//        super.finalize();
//    }

    @Override   //calls for String representation of an obj
    public String toString() {
        return super.toString();

        //e.g:
        // Object Box = new Object();
        // System.out.println(Box);
    }

    @Override
    public int hashCode() {
//        return super.hashCode();
        return num;
        //hashcode is unique representation of ab object via number
        //each obj has unique hascode which can be overriden
        //hashcode doesn't return address since it can't be access in java
        //it just returns random unique number via some internal algorithm
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectClass) obj).num;
    }

    public ObjectClass() {
        super();
    }

    public static void main(String[] args) {
        Object obj = new Object();
        ObjectClass obj1 = new ObjectClass(11, 81.45f);
        ObjectClass obj2 = new ObjectClass(11, 94.15f);
//        System.out.println(obj.hashCode());
//        System.out.println(obj2.hashCode());

        if (obj1 == obj2) {
            System.out.println("Obj 1 and Obj 2 are Equal");
        }
        if (obj1.equals(obj2)) {
            System.out.println("Obj 1 and Obj 2 are Equal");
        }

        System.out.println(obj1 instanceof Object);
//        System.out.println(obj1 instanceof A);

        System.out.println(obj1.getClass().getName());

    }

}
