package Java_DSA.OOPs2;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

class Student{
    int rollNo;
    String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString(){
        return this.name;
    }

    @Override
    public boolean equals(Object obj){
        if (obj instanceof Student s){
            return this.rollNo == s.rollNo && this.name == s.name;
        }
        return false;
    }

}

public class ArrayListIng {
    static ArrayList<Integer> list = new ArrayList<>();
    //ArrayList internally uses dynamic array
    //Only implements List Interface
    //better for storing and accessing the data
    //memory location is continuous (not really in JVM)
    //better for iterate-heavy ops, generally faster

    static void main() {

        list.add(11);
        list.add(Integer.valueOf(12)); // int input in list is directly converted into Integer by autoboxing
//        list.set(0,20);
        list.addFirst(12);
        list.addLast(30);
        System.out.println(list);
        list.remove(1);
        list.remove(Integer.valueOf(11));
        System.out.println(list);

        List<Student> list2 = new ArrayList<>();
        list2.add(new Student(11,"Krrish"));
        list2.add(new Student(11,"Krrish"));
        System.out.println(list2.get(0) == list2.get(1)); // gives false
        System.out.println(list2.get(0).equals(list2.get(1)));
        list2.add(new Student(19,"Mahar"));
//        System.out.println(list2);

        //List Iterator methods to iterate list in reverse and forward manner
        ListIterator<Student> listIterator = list2.listIterator();
//        while (listIterator.hasNext()){
////            System.out.print(listIterator.next() + " ");
//        }
        System.out.println();
//        while (listIterator.hasPrevious()){
////            System.out.print(listIterator.previous() + " ");
//        }
    }
}
