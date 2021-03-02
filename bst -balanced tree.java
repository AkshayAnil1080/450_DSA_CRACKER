class Tree
{
   
     
     
    int height(Node root) {
        // code here 
        
         if(root == null)
        return 0; 
         
         else
         {
        
            return 1 + Math.max(height(root.left), height(root.right));
         }
         
    }
    
     /* This function should return tree if passed  tree 
     is balanced, else false. */
    boolean isBalanced(Node root)
    {
	// Your code here
	int lht, rht;
	if(root ==null)
	return true;
	
	
	lht = height(root.left);
    rht = height(root.right);
    
	 int ans = Math.abs(lht-rht);
        	if(ans<=1 &&   isBalanced(root.left) && isBalanced(root.right))
        	return true;
        	else
        	return false;
    }
    
    
    
    }

https://practice.geeksforgeeks.org/problems/check-for-balanced-tree/1#


Given a binary tree, find if it is height balanced or not. 
A tree is height balanced if difference between heights of left and right subtrees is not more than one for all nodes of tree. 

Example 1:

Input:
      1
    /
   2
    \
     3 
Output: 0
Explanation: The max difference in height
of left subtree and right subtree is 2,
which is greater than 1. Hence unbalanced
Example 2:

Input:
       10
     /   \
    20   30 
  /   \
 40   60
Output: 1
Explanation: The max difference in height
of left subtree and right subtree is 1.
Hence balanced. 
