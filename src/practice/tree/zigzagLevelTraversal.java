package practice.tree;

import java.util.*;

public class zigzagLevelTraversal {
    //
    // Theory behind it ->
    // 1 ->
    // 2 3 <-
    // 4 5 6 7 ->
    // ans == [1,3,2,4,5,6,7]
    // can be like BFS with root -> [1] then [1,2,3] then queue.poll() == 1
    // [2,3] -> queue.removeLast() == [3] and addFirst()
    // like [6,7,2] and removeLast() == [2] and addFirst(...) -> [4,5,6,7]
    // ans till now is [1,3,2] and so on.
    // It will require Deque or Double-ended queue
    // If !reverse do normal offerLast(currNode.left/.right);
    // If reverse  do offerFirst(currNode.right/.left);
    public List<List<Integer>> zigzagLevelOrder(TreeNode root){
        //Implement base BFS
        List<List<Integer>> result = new ArrayList<>();
        if (root == null)   return result;
        Deque<TreeNode> deque = new LinkedList<>();
        deque.offer(root);

        boolean reverse = false;
        while (!deque.isEmpty()){
            int levelSize = deque.size();
            List<Integer> currLevel = new ArrayList<>(levelSize);
            for (int i =0; i<levelSize; i++){
                if (!reverse){
                    TreeNode currNode = deque.pollFirst();
                    currLevel.add(currNode.val);
                    if (currNode.left !=null){
                        deque.offerLast(currNode.left);
                    }
                    if (currNode.right !=null){
                        deque.offerLast(currNode.right);
                    }
                } else  {
                    TreeNode currNode = deque.pollLast();
                    currLevel.add(currNode.val);
                    if (currNode.right !=null){
                        deque.offerFirst(currNode.right);
                    }
                    if (currNode.left !=null){
                        deque.offerFirst(currNode.left);
                    }
                }

            }
            reverse = !reverse;
            result.add(currLevel);
        }
        return result;
    }
}
