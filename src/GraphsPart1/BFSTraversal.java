package GraphsPart1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSTraversal {

    public static void main(String[] args) {
        int V=7; //Imp
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);

        for(int i=0;i<V;i++)
            adj.add(new ArrayList<Integer>());


        AdjacencyList.addEdge(adj,0,1);
        AdjacencyList.addEdge(adj,1,2);
        AdjacencyList.addEdge(adj,1,6);
        AdjacencyList.addEdge(adj,2,4);
        AdjacencyList.addEdge(adj,3,5);
        AdjacencyList.addEdge(adj,4,6);

        AdjacencyList.printGraph(adj);
        ArrayList<Integer> ans=bfsOfGraph(V,adj);

        System.out.println("Bfs of the Graph is :"+ans);

    }

    public static ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ansBfs = new ArrayList<>();
        boolean vis[]= new boolean[V+1];

        for(int i=0;i<V;i++){
            if(vis[i]==false){

                Queue<Integer> q = new LinkedList<>();
                q.add(i); //head is added

                vis[i]=true; //Once its gets in Queue for processing visited is marked to true

                while(!q.isEmpty()){

                    Integer node = q.poll();
                    ansBfs.add(node); // First in First out that its polling

                    for(Integer it: adj.get(node)){
                        if(vis[it]==false){  // Unvisited marked as false
                            vis[it]=true;
                            q.add(it); //Edges are added if not visited
                        }
                    }
                }
            }
        }

        return ansBfs;

    }

}
