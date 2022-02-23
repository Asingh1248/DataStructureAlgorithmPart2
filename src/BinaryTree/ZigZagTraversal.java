package BinaryTree;

import java.util.*;

public class ZigZagTraversal {

    TreeNode root;

    public static void main(String[] args) {

        ZigZagTraversal zigZagTraversal = new ZigZagTraversal();
        zigZagTraversal.root=new TreeNode(1);
        zigZagTraversal.root.left=new TreeNode(2);
        zigZagTraversal.root.right=new TreeNode(3);

        zigZagTraversal.root.left.left=new TreeNode(4);
        zigZagTraversal.root.left.right= new TreeNode(5);
        zigZagTraversal.root.right.left=new TreeNode(6);
        zigZagTraversal.root.right.right=new TreeNode(7);

        System.out.println("Zig Zag traversal of binary tree is - ");
        List<List<Integer>> ans= zigZagTraversal.printZigOrder(zigZagTraversal.root);
        System.out.println(ans);

    }

    private List<List<Integer>> printZigOrder(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> wrapList = new ArrayList<>();

        if(root==null)
            return  wrapList;

        queue.add(root);
        boolean leftToRight = true;
        while(!queue.isEmpty()){

            int level = queue.size();
            List<Integer> subList = new ArrayList<>();
            for(int i=0;i<level;i++) {

                TreeNode curr = queue.poll();

                if (curr.left != null)
                    queue.add(curr.left);
                if (curr.right != null)
                    queue.add(curr.right);
                subList.add(curr.key);

            }

            if (leftToRight) {} // Do Nothing;

            else {
                Collections.reverse(subList);
            }
            wrapList.add(subList);
            leftToRight = !leftToRight;
            }
     return wrapList;

    }

}
