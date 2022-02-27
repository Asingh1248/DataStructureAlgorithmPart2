package BinaryTree2;

import BinaryTree.TreeNode;
//Inplace Method

public class FlattenBinaryTreeToLInkedList {
      TreeNode root;
      static TreeNode prev =null;

    public static void main(String[] args) {
        FlattenBinaryTreeToLInkedList  flattenBinaryTreeToLInkedList = new FlattenBinaryTreeToLInkedList();
        flattenBinaryTreeToLInkedList.root = new TreeNode(1);
        flattenBinaryTreeToLInkedList.root.left = new TreeNode(2);
        flattenBinaryTreeToLInkedList.root.left.left = new TreeNode(3);
        flattenBinaryTreeToLInkedList.root.left.right = new TreeNode(4);


        flattenBinaryTreeToLInkedList.root.right = new TreeNode(5);
        flattenBinaryTreeToLInkedList.root.right.right = new TreeNode(6);
        flattenBinaryTreeToLInkedList.root.right.right.left = new TreeNode(7);

        flattenRecursive(flattenBinaryTreeToLInkedList.root);

        while(flattenBinaryTreeToLInkedList.root.right!=null){
            System.out.print(flattenBinaryTreeToLInkedList.root.key+ " ->");
            flattenBinaryTreeToLInkedList.root = flattenBinaryTreeToLInkedList.root.right;
        }
        System.out.print(flattenBinaryTreeToLInkedList.root.key);
    }

    private static void  flattenRecursive(TreeNode root) {
        //Reverse Pre Order --> Right Side of the Node to : NRL
        if(root==null)
            return ;
        flattenRecursive(root.right);
        flattenRecursive(root.left);
        root.right=prev;
        root.left=null;
        prev=root;

    }
}
