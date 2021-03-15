public class Solution
{
    // return true if the given tree is a BST, else return false
    boolean isBST(Node root)
        {
            // code here.
      
            int min = Integer.MIN_VALUE ;
            int max = Integer.MAX_VALUE;
            
            return ans(root ,  min , max);
            
        }

     boolean ans(Node root  , int min , int max)
    {
        if(root== null)
        return true;
        
        
     if (root.data > min && root.data < max && ans(root.left , min , root.data)    // checking for every node and if any node does not satisfy the condition, return false
    && ans(root.right , root.data, max) )
    return true;
    
    else 
    return false;
        
        
    }

    
}

//TC :O(n)  //comparing every node
// SC : O(n)  -> due to recusrive call of every node.

Link: https://practice.geeksforgeeks.org/problems/check-for-bst/1#

Input:
  2
   \
    7
     \
      6
       \
        5
         \
          9
           \
            2
             \
              6
Output: 0 
Explanation: 
Since the node with value 7 has right subtree 
nodes with keys less than 7, this is not a BST.