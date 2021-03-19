// TC : O(V+E)
// SC : O(V+V) =  O(V)  

class Solution {
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        boolean vis[] =  new boolean[V] ;
        boolean restack[]  = new boolean[V];
    //   return isCyc(0 , vis , restack ,  adj);
    for (int i = 0; i < V; i++)   // need to run the same code for every vertex.
            if ( isCyc(i, vis, restack, adj) )
                return true;

        return false;
    }
        // using DFS...
    boolean  isCyc(int curr , boolean vis[] ,boolean restack[] , ArrayList<ArrayList<Integer>> adj)
    {
        if( vis[curr]  == false)
        {
            vis[curr] =  true;
            restack[curr] = true;

            
            for( int i = 0 ; i<adj.get(curr).size() ; i++)
            { //  int c = 0;
             if(!vis[adj.get(curr).get(i)])
                {
                   
                    if ( isCyc(adj.get(curr).get(i), vis ,  restack ,  adj)  )

                    return true;
                }
                
                else if(restack [ adj.get(curr).get(i) ] )   // dfs next travesal is already present in restack(where we are storing all the travesal of DFS)
                return true;
                

             }
         
        }
        restack[curr] = false ;   // removing the vertex from recursion stack
         return false;
    }
}