package com.Nikhil.TreeQuestions;

import java.util.*;

public class BreadthFirstSearch {

    public static void main(String[] args) {

    }

    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();

        if (root == null){
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){

        }


        return result;
    }
}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){}

    TreeNode(int val){
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
