package BinaryTree;

import java.util.ArrayList;
import java.util.Collections;

public class BoundaryTraversal {

    TreeNode root;

    public static void main(String[] args) {

        BoundaryTraversal boundaryTraversal = new BoundaryTraversal();
        boundaryTraversal.root = new TreeNode(1);

        boundaryTraversal.root.left = new TreeNode(2);
        boundaryTraversal.root.left.left = new TreeNode(3);
        boundaryTraversal.root.left.left.right = new TreeNode(4);
        boundaryTraversal.root.left.left.right.left = new TreeNode(5);
        boundaryTraversal.root.left.left.right.right = new TreeNode(6);

        boundaryTraversal.root.right = new TreeNode(7);
        boundaryTraversal.root.right.right = new TreeNode(8);
        boundaryTraversal.root.right.right.left = new TreeNode(9);
        boundaryTraversal.root.right.right.left.left = new TreeNode(10);
        boundaryTraversal.root.right.right.left.left.right = new TreeNode(11);


        ArrayList<Integer> ans = printBoundary(boundaryTraversal.root);
        System.out.println("Boundary for the tree is :"+ans);


    }

    private static ArrayList<Integer> printBoundary(TreeNode root) {

        ArrayList<Integer> ans = new ArrayList<>();
        if(isLeaf(root)==false)  //Not leaf node then add in Ans
            ans.add(root.key);
        addLeftBoundary(root,ans); //Left Boundary
        addLeaves(root,ans); //Leaves
        addRightBoundary(root,ans); //Right Boundary
        return ans;
    }



    private static void addLeftBoundary(TreeNode root, ArrayList<Integer> ans) {
        TreeNode curr = root.left;
        while(curr!=null){
            if(isLeaf(curr)==false)  //Not leaf node then add in Ans
                ans.add(curr.key);
            if(curr.left!=null)
                curr=curr.left;
            else
                curr=curr.right;
        }

    }


    private static void addRightBoundary(TreeNode root, ArrayList<Integer> ans) {
        TreeNode curr = root.right;
        ArrayList<Integer> tmp = new ArrayList<>();
        while(curr!=null) {
            if (isLeaf(curr) == false)
                tmp.add(curr.key);
            if (curr.right != null)
                curr = curr.right;
            else
                curr = curr.left;
        }

        for(int i = tmp.size()-1;i>=0;--i){
            ans.add(tmp.get(i));
        }

    }


    private static void addLeaves(TreeNode root, ArrayList<Integer> ans) {
        if(isLeaf(root)){
            ans.add(root.key);
            return;
        }
        if(root.left!=null) addLeaves(root.left,ans);
        if(root.right!=null) addLeaves(root.right,ans);

    }


    private static boolean isLeaf(TreeNode root) {
        if(root.left == null && root.right == null)
            return true;
        else
            return false;

    }

}
