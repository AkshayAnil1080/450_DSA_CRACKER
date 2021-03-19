// TC  : O(V+E) - for every V , it is traversing to all its neighbour
// SC : O(V) - creating an array of all nodes.
class Solution
{
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj)
    {
        // Code here
           ArrayList<Integer> al = new ArrayList<>();
        boolean vis[]  = new boolean[V] ; // mark visited
        
        dfs(0, vis, al , adj);
        return al;
        
    }
    
    public void dfs(int curr , boolean[] vis  , ArrayList<Integer> al , ArrayList<ArrayList<Integer>> adj)
    {
        vis[curr] = true;
        al.add(curr);
        for( int i = 0 ; i<adj.get(curr).size() ; i++) // run loop till all the neighbours of curr node
          if(!vis[adj.get(curr).get(i)]) // if neighbour is not visited-> recursive call the function
                dfs(adj.get(curr).get(i) , vis, al , adj);
                
    }

}

Link:
https://practice.geeksforgeeks.org/problems/depth-first-traversal-for-a-graph/1#

Example 1:

Input:
	0
      / | \
     1  2  4
	   /
	  3

Output: 0 1 2 4 3
Explanation: 
0 is connected to 1, 2, 4.
1 is connected to 0.
2 is connected to 0.
3 is connected to 0.
4 is connected to 0, 3.
so starting from 0, it will go to 1 then 2
then 4, and then from 4 to 3.
Thus dfs will be 0 1 2 4 3.