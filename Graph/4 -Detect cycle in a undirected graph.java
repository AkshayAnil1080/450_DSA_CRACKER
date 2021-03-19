// TC : O(V+E)  - since using DFS
// SC : O(V)  - using boolean array of V size.

class Solution
{
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj)
    {
        // Code here
        boolean vis[] = new boolean[V] ;
        for( int i  = 0 ; i <V  ; i++)    // no need to do this java, it auto assigns false in java,
        vis[i] =  false;
        
         for (int i = 0; i < V; i++)   // need to run the same code for every vertex.
         {
             if(!vis[i])
             if ( isCyc(i, vis, -1, adj) )
                return true;
                
         }
          return false;
    }
    
    boolean isCyc(int curr, boolean vis[] , int parent , ArrayList<ArrayList<Integer>> adj ) 
    {
        vis[curr] = true;
        
        // 1st way - 
        for( int i = 0 ; i<adj.get(curr).size() ; i++)
        {
            if( !vis[adj.get(curr).get(i)] )
            {
                if( isCyc(adj.get(curr).get(i) , vis , curr ,  adj) )
                return true;
            }
            
            else if(adj.get(curr).get(i) != parent)
            return true;
        }
        
        // so if not true from above conditions -  return false;
        return false;
        
        // 2nd way -  using itertaor....   
        // Integer i ;
        
        // Iterator<Integer> it = adj.get(curr).iterator();
        // while(it.hasNext())
        // {
        //     i = it.next();
        //     if(!vis[i])
        //     {
        //         if( isCyc(i,vis,curr,adj) )
        //         return true;
        //     }
        //     else if(i!=parent)
        //     return true;
        // }
        // return false;
        
        
    }
    
}