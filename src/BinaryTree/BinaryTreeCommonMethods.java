package BinaryTree;

public class BinaryTreeCommonMethods {

    TreeNode root;

    public static void main(String[] args) {
        BinaryTreeCommonMethods binaryTreeCommonMethods = new BinaryTreeCommonMethods();
        binaryTreeCommonMethods.root = new TreeNode(1);
        binaryTreeCommonMethods.root.left = new TreeNode(2);
        binaryTreeCommonMethods.root.left.left = new TreeNode(3);
        binaryTreeCommonMethods.root.left.right = new TreeNode(5);
        binaryTreeCommonMethods.root.left.right.left = new TreeNode(6);

        binaryTreeCommonMethods.root.right= new TreeNode(8);

        preOrderTraversal(binaryTreeCommonMethods.root);
    }

    private static void preOrderTraversal(TreeNode root) {

        if(root==null)
            return;
        System.out.print(root.key + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }


}
