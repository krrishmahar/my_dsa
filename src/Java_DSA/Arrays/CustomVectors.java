package Java_DSA.Arrays;

import java.util.*;

public class CustomVectors<E> extends AbstractList<E> implements List<E> {
    protected int SIZE;
    private int DEFAULT_CAPACITY = 10;
    protected int capacityIncrement;
    protected int elementCount;
    protected Object[] elementData;

    /* Vectors are mutable arrays which dynamically allocate memory and manage storage space. */

    public CustomVectors(int CAPACITY) {
        this.DEFAULT_CAPACITY = CAPACITY;
        this.elementData = new Object[DEFAULT_CAPACITY];
    }

    public CustomVectors() {
        this.elementData = new Object[DEFAULT_CAPACITY];
    }

    @Override
    public E get(int index) {
        if (index >= elementCount || index < 0) {
            throw new ArrayIndexOutOfBoundsException(index + " >= " + elementCount);
        }
        return (E) elementData[index];
    }

    @Override
    public int size() {
        return elementCount;
    }

    public int capacity() {
        return elementData.length;
    }

    public boolean isEmpty() {
        return elementCount == 0;
    }

    public E at(int index) {
        return get(index);
    }

    public void push(E obj) {
        ensureCapacity();
        elementData[elementCount++] = obj;
    }

    public void insert(int index, E obj) {
        if (index > elementCount || index < 0) {
            throw new ArrayIndexOutOfBoundsException(index + " > " + elementCount);
        }
        ensureCapacity();
        System.arraycopy(elementData, index, elementData, index + 1, elementCount - index);
        elementData[index] = obj;
        elementCount++;
    }

    public void prepend(E obj) {
        insert(0, obj);
    }

    public E pop() {
        if (elementCount == 0) {
            throw new ArrayIndexOutOfBoundsException("Cannot pop elements from an empty vector");
        }
        E value = (E) elementData[--elementCount];
        elementData[elementCount] = null; // Remove reference for GC
        return value;
    }

    public void delete(int index) {
        if (index >= elementCount || index < 0) {
            throw new ArrayIndexOutOfBoundsException(index + " out of bounds");
        }
        int numMoved = elementCount - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elementData, index + 1, elementData, index, numMoved);
        }
        elementData[--elementCount] = null; // Clear to let GC do its work
    }

    public int find(E value, Comparator<E> comparator) {
        if (elementCount > 16) {
            // Using Binary Search
            return binarySearch(elementData, value, comparator);
        } else {
            for (int i = 0; i < elementCount; i++) {
                if (comparator.compare((E) elementData[i], value) == 0) {
                    return i;
                }
            }
        }
        return -1;
    }

    private int binarySearch(Object[] elementData, E value, Comparator<E> comparator) {
        Arrays.sort((E[]) elementData, 0, elementCount, comparator);
        int start = 0, end = elementCount - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            E midValue = (E) elementData[mid];

            int comparison = comparator.compare(midValue, value);

            if (comparison == 0) {
                return mid;
            } else if (comparison < 0) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    private void ensureCapacity() {
        if (elementCount == elementData.length) {
            int newCapacity = elementData.length + (capacityIncrement > 0 ? capacityIncrement : DEFAULT_CAPACITY);
            elementData = Arrays.copyOf(elementData, newCapacity);
        }
    }

    public static void main(String[] args) {
        CustomVectors<Integer> customVector = new CustomVectors<>();
        customVector.push(3);
        customVector.push(6);
        customVector.push(8);
        customVector.push(10);
        customVector.push(15);
        customVector.push(20);

        Comparator<Integer> comparator = Integer::compareTo;

        int index = customVector.find(10, comparator);
        System.out.println("Index of 10: " + index); // Output: Index of 10: 3

        index = customVector.find(5, comparator);
        System.out.println("Index of 5: " + index); // Output: Index of 5: -1
    }
}
