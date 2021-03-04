class GfG
{
    int levelOfLeaf;
    public boolean sameLevel(Node node, int level)
    
    {//1
        if ( node == null)
        return true;
        
        //3
        if(node.left == null && node.right ==null)
        {
            if (levelOfLeaf == 0)
            {
                levelOfLeaf = level ; 
                return true;
            }
            else
            return levelOfLeaf == level;
        }
        //2
        else
        {
        return sameLevel(node.left , level+1) && sameLevel(node.right , level+1);
        }
    }
    
    boolean check(Node root)
    {
	// Your code here	
	return sameLevel(root, 1 );
    }
    
}


TC : O(n)
SC : O(1)
Input: 
            1
          /   \
         2     3

Output: 1

Explanation: 
Leaves 2 and 3 are at same level.

Example 2:

Input:
            10
          /    \
        20      30
       /  \        
     10    15

Output: 0

Explanation:
Leaves 10, 15 and 30 are not at same level.