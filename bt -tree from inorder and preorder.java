class Solution
{
    public Node buildTree(int inorder[], int preorder[], int n)
    {
        // code here 
        
        return helper(0,0, inorder.length-1 , preorder, inorder);
        
    }
    public Node helper(int preStart , int inStart, int inEnd , int[] preorder, int[] inorder)
    {
        //1
        if(preStart > preorder.length-1 || inStart > inEnd) return null; //array empty
        
        //2
        Node root = new Node(preorder[preStart]);
        
        //4
        int inIndex = 0;  // searching root obtainde from preorder into inorder
        for(int i =inStart ; i<=inEnd ; i++ )
        {
            if(root.data == inorder[i])
            inIndex = i;
        }
        
        //5. 
        root.left = helper(preStart+1 , inStart , inIndex -1 , preorder, inorder);
        
        root.right =helper(preStart + 1 +  inIndex - inStart   , inIndex+1 , inEnd , preorder, inorder);
        
        //3
        return root;
    
    }
        
    
}


TC : O(n^2)  - we are searching n times in an array of length n.
SC : O(n) because we are creating n new nodes.
Example 1:

Input:
N = 4
inorder[] = {1 6 8 7}
preorder[] = {1 6 7 8}
Output: 8 7 6 1
Example 2:

Input:
N = 6
inorder[] = {3 1 4 0 5 2}
preorder[] = {0 1 3 4 2 5}
Output: 3 4 1 5 2 0
Explanation: The tree will look like
       0
    /     \
   1       2
 /   \    /
3    4   5



