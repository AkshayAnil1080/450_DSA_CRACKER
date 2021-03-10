class Tree
{
    // Return the root of the modified BST after deleting the node with value X
	public static Node deleteNode(Node root, int x)
	{
	   // Node root =  node;
		// code here.
		if(root == null)
		return null;
		
		else if(x < root.data)
		root.left = deleteNode(root.left , x);
		
		else if(x  > root.data)
		root.right =  deleteNode(root.right , x);
		
		else
		{
		    // when the node has both child  - assign it the largest key in its left subtree.
		    
		    // one  child
		    if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
                
              else{ // two child
               root.data = findmax(root.left);
               
               root.left = deleteNode(root.left , root.data);
              }
		  
		    
		}
		return root;
		
	}
	static int findmax(Node root){
	   // if(root == null)
	   // return -1 ;
	    int max =  root.data;
	    while(root.right!=null)
	    {
	        max  =  root.right.data;
	        root =  root.right;
	    }
	    return max;
	}
}