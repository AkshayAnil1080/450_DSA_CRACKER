class Solution {
    int height(Node node) {
        // code here 
        
         if(node == null)
         return 0;
         
         else
         {
             int lht = height(node.left);
             int rht = height(node.right);
             
            int c = lht>rht ? lht+1 : rht+1 ;
            return c;
         }
  
    }
}


Input:
      1
    /  \
   2    3
Output: 2
Example 2:

Input:
  2
   \
    1
   /
 3
Output: 3 