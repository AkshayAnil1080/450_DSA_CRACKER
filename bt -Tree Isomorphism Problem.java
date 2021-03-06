class BinaryTree  
{ 
    // Return True if the given trees are isomotphic. Else return False.
    boolean isIsomorphic(Node root1, Node root2)  
    { 
         // code here.
         
         //BC1.
         if(root1 == null && root2 == null)
         return true;
         
         //BC2.
          if(root1 == null || root2 == null)
         return false;   // if asked for how many swaps req:c++ at BC where returning fals.
         
          if(root1.data != root2.data)
         return false;
         
         else
         return ( isIsomorphic(root1.right , root2.right) && isIsomorphic(root1.left , root2.left) 
         || isIsomorphic(root1.right , root2.left) && isIsomorphic(root1.left , root2.right) ) ;
         
    }
    
}    

// TC : O(n + m)  => O(n) : comparing each node of one tree to another.
// SC : O(1)


