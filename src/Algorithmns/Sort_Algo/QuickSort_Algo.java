package Algorithmns.Sort_Algo;

import java.util.Scanner;

//class Person{
//    private String name;
//
//    public Person(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//}
public class QuickSort_Algo {


    public static void QuickSortByName(Person[] arr) {
        QuickSort(arr, 0, arr.length - 1);
    }

    private static void QuickSort(Person[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = Partition(arr, low, high);
            QuickSort(arr, low, pivotIndex - 1);
            QuickSort(arr, pivotIndex + 1, high);
        }

    }

    private static int Partition(Person[] arr, int low, int high) {
        Person pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j].getName().compareTo(pivot.getName()) < 0) {
                i++;
                Swap(arr, i + 1, high);
            }
        }
        Swap(arr, i + 1, high);
        return i + 1;
    }

    private static void Swap(Person[] arr, int i, int j) {
        Person temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;


    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person[] people = new Person[5];
        people[0] = new Person(sc.next());
        people[1] = new Person(sc.next());
        people[2] = new Person(sc.next());
        people[3] = new Person(sc.next());
        people[4] = new Person(sc.next());

        System.out.println("Before Sorting ->");
        for (Person person : people
        ) {
            System.out.println(person.getName());
        }

        QuickSortByName(people);
        System.out.println("After Sorting. ->");
        for (Person person : people
        ) {
            System.out.println(person.getName());

        }

    }
}



