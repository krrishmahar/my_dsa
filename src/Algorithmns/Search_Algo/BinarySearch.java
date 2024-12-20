package Algorithmns.Search_Algo;

//What is binary search algorithm?
//Ans : It is an Optimised algorithms that runs on a sorted array(sort in ascending or descending order), searches
//      target and print it on display.

//Working of BinarySearch Algorithm ->
//1. Taking a middle element in an Array.
//2. If middle element>target, search right side of array and vice versa.
//*. If middle element = target, print it.
//3. If not, iterate from step 1 again and again till target is found.
//Note : At step 2, program doesn't create new array but just changes starting index/ending index
//       and reduce search space by half.

//E.g ->> let target be 8
// At step 1 : int [] arr = {1,2,3,4,5,6,7,8,9,10,11}; arr[0] will be 11/2 ~= 5 i.e,
// At step 2 :   arr = {5,6,7,8,9} then,
//    Step 3 :   arr = {7,8,9} them,initiating step 1 then step *.

// Best case : O(1) : everytime target in index of middle element. So that, even if size is increased and target being
//                    is middle element then, space complexity doesn't affect the code and time is constant.

//Worst case : O(log n) : If there are 1 million units in an array then worst case of comparison will be
//             Log (1000000) to base 2 = 19.93 ~ 20.
//Note : If same units were used in linear search then, comparison would have been 1000000 that has O(0).

public class BinarySearch {

}
