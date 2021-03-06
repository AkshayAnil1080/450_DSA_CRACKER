class GfG {
    
    
    int findDist(Node root, int a, int b) {
        // Your code here
            Node temp = lca( root, a, b);
             
             
              int d1 = distance( temp , a  ,0);
              int d2 =  distance(temp, b, 0);
              
              return d1+d2;
              
             
    }
    
    int distance(Node lca , int data , int initial_dist)   //to finf the disatance from the one node to another node with data d.
    {
        if(lca == null)  //
        return -2 ;
        
        // moving lac to desired node to find requires data .
        if(lca.data  == data)
        return initial_dist;
        
        //moving in lhs
        
        int  left = distance(lca.left , data , initial_dist+1);
        int right =  distance(lca.right , data , initial_dist+1);
        
        // nai mil left me required node
        if(left == -2)
        return right;  // in left subtree the node to be searched dne. search in right subtree.
        
        else   /// in left subtree node is found anf return the distance.
        return left;
    }
    	
    	
    	Node lca(Node root, int n1,int n2)
	{
	
    
    	if(root == null)
        	    return null;
        	
        	if(root.data ==n1 || root.data ==n2)
        	{
        	  return root;
        	}
        	
        	 
        	 Node left = lca(root.left, n1,n2);
        	 Node right = lca(root.right, n1,n2);
        	
        	if(left!=null && right!=null)
        	return root;
        	
        	if(left!=null && right==null)
        	return left;
        	
        	
        	else
        	{
        	    return right;
        	}
	}
}


TC  : O(n) as the method does a single tree traversal.
Sc : O(1)

Example 1:

Input:
        1
      /  \
     2    3
a = 2, b = 3
Output: 2
Explanation: The tree formed is:
       1
     /   \ 
    2     3
We need the distance between 2 and 3.
Being at node 2, we need to take two
steps ahead in order to reach node 3.
The path followed will be:
2 -> 1 -> 3. Hence, the result is 2. 



