package graphs;

import java.util.*;

public class GraphFromSratch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt();
		int E  = sc.nextInt();
		
		
		ArrayList<ArrayList<Integer>> adj = new  ArrayList<ArrayList<Integer>>();    // creating adjacency list - Al of AL..
		for( int i = 0 ; i<V ; i ++)
		{
			adj.add(new ArrayList<Integer>());
			
		}
		for( int  i = 0; i <E ; i++)
		{
			int u = sc.nextInt();
			int v = sc.nextInt();
			
			adj.get(u).add(v);
			adj.get(v).add(u);   // since undirected graph..
			
			 // for directed graph just remove line 26...
			
		}
		
		for( int i = 0 ; i<adj.size(); i++)
		{
			System.out.println(adj.get(i) +  " ");
		}
		
	}

}


//TC :  O(V+E) -  as first loop ( from i  -> V) runs and then E times as the number of edges given to feed the neighbours in adjacency list. 
//SC : O(V*E)  -  one AL for storing all vertex and mutiple AL( same as number  of vertices)  to store all neighburs of each vertex in separete AL.
//	I/P
//	4 4
//	0 1
//	1 2
//	2 3
//	3 0
//	O/P
//	[1, 3] 
//	[0, 2] 
//	[1, 3] 
//	[2, 0] 
