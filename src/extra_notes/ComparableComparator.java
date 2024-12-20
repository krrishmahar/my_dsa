package extra_notes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students implements Comparable<Students> {
    int age;
    String name;

    public Students(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Students " +
                "[age= " + age +
                ", name= '" + name + ']';
    }

    @Override
    public int compareTo(Students that) {
        //here, this = current element, that = new/next element
        return (this.age != that.age) && (this.age % 10 > that.age % 10) ? 1 : -1;
    }

}
public class ComparableComparator {

    public static void main(String[] args) {
    //comparable are sued when a class is given feature to sort based on custom logic
    //Comparator are interfaces defined in an Object like ArrayList, HashMap, HashSet,etc to sort on custom logic

        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(25);
        list.add(86);
        list.add(91);
//        let list be sorted on last index of numbers
        Comparator<Integer> comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 % 10 > o2 % 10) return 1;
                return -1;
            }
        };
        //else use lambda expression
//        Comparator<Integer> comp = (o1, o2) -> (o1 % 10 > o2 % 10)? 1 : -1;

        list.sort(comp);
//        list.forEach(i -> System.out.println(i));
        list.forEach(System.out::println);
//        for (int i : list){
//            System.out.println(i);
//        }


        List<Students> details = new ArrayList<>();
        details.add(new Students(18, "Krrish"));
        details.add(new Students(99, "yash"));
        details.add(new Students(24, "harsh"));
        details.add(new Students(42, "Uncle"));

        System.out.println(details.toString());





        Comparator<Students> com = (o1,  o2) -> (o1.age != o2.age) && (o1.age % 10 > o2.age % 10) ? 1 : -1;

    }

}
