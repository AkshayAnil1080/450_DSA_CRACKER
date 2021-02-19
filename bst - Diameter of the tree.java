class Tree {
    /* Complete the function to get diameter of a binary tree */
    
    int height(Node root)
    {
        if(root==null)
        return 0;
        
        else
        return Math.max(height(root.left) , height(root.right) )  + 1;
    }
    int diameter(Node node) {
        // Your code here
         if(node == null)
         return 0;
         
         else
        
         {
            
             int lht = height(node.left);
             int rht = height(node.right);
             
             int c  = rht+lht+1;
             
             int ld = diameter(node.left);
             int rd = diameter(node.right);
             
             return(Math.max(c, Math.max(ld,rd) ) );
             
             
            
             
            
         }
        
    }
}

Example 1:

Input:
       1
     /  \
    2    3
Output: 3
Example 2:

Input:
         10
        /   \
      20    30
    /   \ 
   40   60
Output: 4