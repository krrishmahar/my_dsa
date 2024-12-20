package Java_DSA.OOPs.generics;

public class Student implements Comparable<Student> {
    int rollno;
    public float marks;

    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return rollno + ". marks: " + marks;
    }

    @Override
    public int compareTo(Student o) {
        int diff = (int) (this.rollno - o.rollno);
//        int diff = - (int) (this.rollno - o.rollno); // sort in desc
        //if diff == 0 : both are equal
        //if diff < 0 : O hsd more marks else not
        return diff;
    }
}
