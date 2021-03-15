
class BST
{   
    // Returns the LCA of the nodes with values n1 and n2
    // in the BST rooted at 'root' 
	Node LCA(Node root, int n1, int n2)
	{
        // code here.    
        
        if(root == null)
        return null;
        
        if(root.data == n1 || root.data  == n2)
        return root;
        
        Node left = LCA(root.left, n1, n2);
        Node right =  LCA(root.right , n1 , n2);
        
        // if both left and right exists =  return root.
        // if only left exists = return left
        // if only right exists = return right;
        
        if(left!= null && right!=null)
        return root;
        
        if(left != null && right==null)
        return left;
        
        else
        return right;
            
	    
	}
}


Input:
              5
           /    \
         4       6
        /         \
       3           7
                    \
                     8
n1 = 7, n2 = 8
Output: 7
Example 2:

Input:
     2
   /   \
  1     3
n1 = 1, n2 = 3
Output: 2
    