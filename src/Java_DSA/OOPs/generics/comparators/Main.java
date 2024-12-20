package Java_DSA.OOPs.generics.comparators;

import Java_DSA.OOPs.accessModifier.A;
import Java_DSA.OOPs.generics.Student;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Student krrish = new Student(11, 93.34f);
        Student harsh = new Student(29, 73.34f);
        Student vedanth = new Student(9, 83.34f);
        Student omkar = new Student(29, 95.4f);
        Student yash = new Student(29, 69.69f);

        Student[] list = new Student[]{krrish, harsh, vedanth, omkar, yash};

        System.out.println(Arrays.toString(list));

//        Arrays.sort(list);
//        //sort() tries to internally check toCompare() if yes, sort else gives error[ClassCastException]

//        Arrays.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return - (int) (o1.marks - o2.marks);
//            }
//        });

        Arrays.sort(list, (o1, o2) -> -(int) (o1.marks - o2.marks));
        //lambda expression

        System.out.println(list);

        System.out.println(Arrays.toString(list));

//        if (krrish.compareTo(harsh) < 0){ //there are more arguments hence it requires interface Comparable
//            System.out.println("Krrish has more marks than harsh");
//        }else {
//            System.out.println("Harsh has more marks than krrish");
//        }

    }

}
