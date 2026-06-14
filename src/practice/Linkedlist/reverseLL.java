package practice.Linkedlist;

public class reverseLL {

    static void main(String[] args) {

        GenericLinkedList<Number> numberList = new GenericLinkedList<>();
        numberList.add(10);
        numberList.add(20.5); // Double fits into Number

        // Creating a list of Integers (Subtype)
        GenericLinkedList<Integer> intList = new GenericLinkedList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);

        System.out.print("Original Integer List: ");
        intList.display();

        System.out.print("Reversed Integer List: ");
        intList.reverse();
        intList.display();

        // Testing Producer Wildcard (? extends T)
        // We can add all elements of intList (Integer) into numberList (Number)
        numberList.addAll(intList);
        System.out.print("Combined Number List: ");
        numberList.display();
    }

}


