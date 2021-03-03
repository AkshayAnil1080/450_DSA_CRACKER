class Tree
{
    
    int Sum(Node root)
    {
        if(root == null)
        return 0;
        
        else
        {
                 int temp = root.data;
                 root.data= Sum(root.left) + Sum(root.right);
                 
                return root.data+temp;
                
        }
        
    }
	boolean isSumTree(Node root)
	{
	    
	    
             // Your code here
            if(root == null)
             return true;
             
             
             else{
                 
             
            if( root.data == Sum(root.left) + Sum(root.right))
            return true;
             
            else
            return false;
             }
             
             
	}
}


/* 
Input:
    3
  /   \    
 1     2

Output: 1
Explanation: The given tree is a sum 
tree so return a boolean true.

Example 2:

Input:

          10
        /    \
      20      30
    /   \ 
   10    10

Output: 0
Explanation: The given tree is not a sum
tree. For the root node, sum of elements
in left subtree is 40 and sum of elements
in right subtree is 30. Root element = 10
which is not equal to 30+40.

*/

TC: O(N)
SC : O(N)