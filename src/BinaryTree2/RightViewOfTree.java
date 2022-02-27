package BinaryTree2;

import BinaryTree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class RightViewOfTree {

    TreeNode root;
    static int maxLevelSoFar =-1;
    public static void main(String[] args) {

        RightViewOfTree rightViewOfTree = new RightViewOfTree();
        rightViewOfTree.root = new TreeNode(1);
        rightViewOfTree.root.left = new TreeNode(2);
        rightViewOfTree.root.left.left = new TreeNode(4);
        rightViewOfTree.root.left.right = new TreeNode(5);
        rightViewOfTree.root.left.right.left = new TreeNode(6);

        rightViewOfTree.root.right = new TreeNode(3);
        rightViewOfTree.root.right.right = new TreeNode(7);

        ArrayList<Integer>  ans = rightSideView(rightViewOfTree.root);
        System.out.println("Right view of the tree is :"+ans);
    }

    private static ArrayList<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        rightRecursive(root,0,result);
        return result;
    }

    private static void rightRecursive(TreeNode root, int level,ArrayList<Integer> result) {

        //Reverse Pre Order PreOrder : NLR --> NRL ? Why this --Right Side View go to right side
        if(root==null)
            return;
        if(level==result.size())
            result.add(root.key);
        rightRecursive(root.right,level+1,result);  //Why
        rightRecursive(root.left,level+1,result);
        maxLevelSoFar = Math.max(maxLevelSoFar,level);  // Max Level
    }
}
