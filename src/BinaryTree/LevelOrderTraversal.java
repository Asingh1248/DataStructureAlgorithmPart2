package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
   TreeNode root;

    public static void main(String[] args) {

        LevelOrderTraversal tree_level = new LevelOrderTraversal();
        tree_level.root=new TreeNode(1);
        tree_level.root.left=new TreeNode(2);
        tree_level.root.right=new TreeNode(3);

        tree_level.root.left.left=new TreeNode(4);
        tree_level.root.left.right= new TreeNode(5);

        tree_level.root.right.left=new TreeNode(6);
        tree_level.root.right.right=new TreeNode(7);

        System.out.println("Level order traversal of binary tree is - ");
        List<List<Integer>> ans= tree_level.printLevelOrder(tree_level.root);
        System.out.println(ans);
    }

    private List<List<Integer>> printLevelOrder(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();

        List<List<Integer>> wrapList = new ArrayList<>();

        if(root==null)
            return  wrapList;

        queue.add(root);
        while(!queue.isEmpty()){
            int levelNum= queue.size();
            List<Integer> subList = new ArrayList<>();

            for(int i=0;i<levelNum;i++){

                TreeNode curr = queue.poll();
                if(curr.left!=null){
                    queue.add(curr.left);
                }
                if(curr.right!=null){
                    queue.add(curr.right);
                }
                subList.add(curr.key);

            }
            wrapList.add(subList);

        }
    return  wrapList;

    }


}
