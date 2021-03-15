// same code running in leetcode. its the misake of compiler.
// https://leetcode.com/problems/flatten-binary-tree-to-linked-list/submissions/
// TC: O(n)  
// SC : O(1)

class Solution
{
    public static void flatten(Node node)
    {
        //code here
        
        if(node== null ) 
        return;
        
        if (node.left==null && node.right==null )
        return;
        
        // Node ptr =  null;
        if(node.left != null)
        {
            flatten(node.left);
            
            
            Node temp =  node.right;  // storing right St in temp
            node.right = node.left;   // shifting left St to right
            node.left= null;            // making left points to null
            
            Node curr =  node.right;   // now the shifted lst to rst is my curr rst.
            
            while(curr.right!=null)  // we need to traverse till the end of curr rst and point to temp(rst present previously)
            {
                curr = curr.right;   // traversing till end
            }
             
        
            curr.right = temp;  // pointing to temp.
        }
        flatten(node.right);  // repeating the same for right node.
        
    }
}



Input : 
          1
        /   \
       2     5
      / \     \
     3   4     6
Output :
1 2 3 4 5 6 
Explanation: 
After flattening, the tree looks 
like this
    1
     \
      2
       \
        3
         \
          4
           \
            5
             \
              6 
Here, left of each node points 
to NULL and right contains the 
next node in preorder.The inorder 
traversal of this flattened tree 
is 1 2 3 4 5 6.
