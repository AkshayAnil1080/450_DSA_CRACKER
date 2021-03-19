//TC:  O(V+E) :  travesing each node at vertex and it neighbour(number of vertices from the curr node
// SC : O(V+V+V) - O(V)

class Solution
{
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj)
    {
        // Code here// use a queue and add the neighbours, maek visited , dequeue - and repeat.
        ArrayList<Integer>  al =  new ArrayList<>();
        Queue<Integer>  q =  new LinkedList<>();
        boolean vis[] = new boolean[V];
        
        
        // for( int i = 0 ; i<V ; i ++)
        // {
        //     adj[i] =  new ArrayList<Integer>();
        // }
        q.add(0);  // adding the first node
        
        vis[0] =  true;  // mark it visited.
        
        while(!q.isEmpty())
        {
            int curr = q.poll();  // dequeueing and adding into al
            al.add(curr);
            
            for( int neighbour : adj.get(curr) )   // passing the neighbour of curr node(0) one by one and marking them visited and adding in the queue
            if(!vis[neighbour])
            {
                vis[neighbour]  =  true;
                q.add(neighbour);
            }
        }
        return al;
        
    }
    
}