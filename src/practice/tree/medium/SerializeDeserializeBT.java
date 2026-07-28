package practice.tree.medium;

import practice.tree.TreeNode;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class SerializeDeserializeBT {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder strb = new StringBuilder();
        helper(root, strb);
        return strb.toString();
    }
    private void helper(TreeNode node, StringBuilder list){
        if (node == null){
            list.append("null,").toString();
            return;
        }
        list.append(node.val).append(",");
        helper(node.left, list);
        helper(node.right, list);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
//        Collections.reverse(data);
//        data = new StringBuilder(data).reverse().toString();
        String[] nodesArr = data.split(",");
        Queue<String> nodesQueue = new LinkedList<>(Arrays.asList(nodesArr));

        return helper2(nodesQueue);
    }
    TreeNode helper2(Queue<String> nodes){

        String val = nodes.poll();
        if (val == null || val.equals("null")){
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(val));
        node.left = helper2(nodes);
        node.right = helper2(nodes);

        return node;
    }

    void reverseString(String data){
        if (data == null || data.isEmpty()) return;
        char[] ch = data.toCharArray();
        int i=0, j= ch.length-1;
        while (i < j){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
    }
}
