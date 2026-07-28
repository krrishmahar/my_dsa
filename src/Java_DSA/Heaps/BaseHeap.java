package Java_DSA.Heaps;

import java.util.ArrayList;

/*
* Heaps are array representation of Binary Tree
* Such that It can be max-Heap with biggest value as root
* min-Heap when smallest value is root or 0th index
* Other values below can be unsorted
* Swapping of max/min works by reading its child and swapping with it
* such that node.val >= node.left/.right for max heap recursively.
* root = i = 1  in 1 based indexing
* parent = i/2
* left = 2*i
* right = 2*i +1 */

public class BaseHeap<T extends Comparable<T>> {
    private ArrayList<T> list;

    public BaseHeap() {
        list = new ArrayList<>();
    }
    private void swap(int f, int s){
        T temp = list.get(f);
        list.set(f, list.get(s));
        list.set(s,temp);
    }

    private int parent(int index){
        return (index-1)/2;
    }
    private int left(int index){
        return (index*2)+1;
    }
    private int right(int index){
        return  (index*2)+2;
    }
    public void insert(T val){
        list.add(val);
        upheap(list.size()-1);
    }

    private void upheap(int ind) {
        if (ind == 0)   return;
        int p = parent(ind);
        if (list.get(ind).compareTo(list.get(p))<0){
            swap(ind, p);
            upheap(p);
        }
    }
    public T remove() throws Exception {
        if (list.isEmpty()){
            throw new Exception("Removing from Empty List");
        }
        T temp = list.get(0);
        T last = list.remove(list.size()-1);
        if (!list.isEmpty()){
            list.set(0, last);
            downheap(0);
        }
        return temp;
    }

    private void downheap(int ind) {
        int min = ind;
        int left = left(ind);
        int right = right(ind);

        if (left < list.size() && list.get(min).compareTo(list.get(left))>0){ // min > left
            min = left;
        }
        if (right < list.size() && list.get(min).compareTo(list.get(right))>0){
            min = right;
        }
        if (min != ind){
            swap(min, ind);
            downheap(min);
        }
    }

    // Min Heap or Min Priority Queue
    public ArrayList<T> heapsort() throws Exception{
        ArrayList<T> data = new ArrayList<>();
        while (!list.isEmpty()){
            data.add(this.remove());
        }
        return data;
    }

//    In Complete BT, all leaf nodes starts after N/2 ie
//    Leaf Nodes starts from N/2+1 ...N
//    Heaps from unsorted Array []


}
