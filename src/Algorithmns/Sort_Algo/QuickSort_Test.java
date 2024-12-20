package Algorithmns.Sort_Algo;

import java.util.Scanner;

public class QuickSort_Test extends QuickSort_Algo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person[] people = new Person[3];
        people[0] = new Person(sc.nextLine());
        people[1] = new Person(sc.nextLine());
        people[2] = new Person(sc.nextLine());

        QuickSortByName(people);

        for (Person person : people
        ) {
            System.out.println(person.getName());
        }

    }
}
