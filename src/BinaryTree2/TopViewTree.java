package BinaryTree2;

import BinaryTree.TreeNode;

import java.util.*;

public class TopViewTree {

    TreeNode root;

    public static void main(String[] args) {

        TopViewTree topViewTree = new TopViewTree();
        topViewTree.root = new TreeNode(1);
        topViewTree.root.left= new TreeNode(2);
        topViewTree.root.left.left = new TreeNode(4);
        topViewTree.root.left.right = new TreeNode(5);
        topViewTree.root.left.right.left = new TreeNode(6);

        topViewTree.root.right= new TreeNode(3);
        topViewTree.root.right.right = new TreeNode(7);

        ArrayList<Integer> ans = printTopView(topViewTree.root);
        System.out.println("Top of the tree is :"+ans);

        //Code can we written only once  I rught the diagram logic : Dry Run

    }

    private static ArrayList<Integer> printTopView(TreeNode root) {
        ArrayList<Integer> key = new ArrayList<>();
        Queue<Pair> queue = new LinkedList<>();  // Add the Pair calss with line No and Tree Node
        Map<Integer,TreeNode> map  = new HashMap<>();  //Key is lineNo and Node value is value

        queue.add(new Pair(root,0));  //First Entry

        while(!queue.isEmpty()){

            Pair it = queue.remove(); //Fetch the entry
            int hd= it.lineNo;
            TreeNode temp =it.node;

            if(map.get(hd)==null)  //Intution :  Always for new Line No it will check for head
                map.put(hd,temp);
            if(temp.left!=null)   //Storing left and right
                queue.add(new Pair(temp.left,hd-1));
            if(temp.right!=null)
                queue.add(new Pair(temp.right,hd+1));
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for(Map.Entry<Integer,TreeNode> mapIt: map.entrySet()){
            key.add(mapIt.getKey());
        }
        Collections.sort(key);

        for(Integer i : key){
            ans.add(map.get(i).key);
        }

        return ans;

    }


}
