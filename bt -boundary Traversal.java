class Solution
{
	ArrayList <Integer> printBoundary(Node node)
	{
	    ArrayList <Integer> al = new ArrayList <Integer>();
	    if(node!=null)
	    System.out.print(node.data + " ");
	    
	    printLeft(node.left);
	    
	    printLeaves(node.left);
	    printLeaves(node.right);
	    
	    printRight(node.right);
	    
	    return al;
	}
	
	
	public void printLeft(Node node)
	{
	    if(node ==null) return;
	    
	    if(node.left!=null)
	    {
	        System.out.print(node.data + " ");
	        printLeft(node.left);
	    }
	    else if(node.right!=null)
	    {
	        System.out.print(node.data + " ");
	        printLeft(node.right);
	        
	    }
	}
	
	void printLeaves(Node node)
	{
	    if(node ==null) return;
	    
	    printLeaves(node.left);
	    
	    if(node.left==null && node.right==null)
	    System.out.print(node.data + " ");
	    
	    printLeaves(node.right);
	}
	
		public void printRight(Node node)
	{
	    if(node ==null) return;
	    
	    if(node.right!=null)
	    {
	        printRight(node.right);
	        System.out.print(node.data + " ");
	    }
	    else if(node.left!=null)
	    {
	        printRight(node.left);
	        System.out.print(node.data + " ");
	    }
	}
}





/*
1. print left most nodes of left subtree excpet at leaf level
2. print lead nodes
3. print right most node from botton of right subtree.
 

Example 1:

Input:
        1
      /   \
     2     3    
   
Output: 1 2 3
Explanation:


Example 2:

Input:
          20
        /   \
       8     22
     /   \    \
    4    12    25
        /  \ 
       10   14 

Output: 20 8 4 10 14 25 22
Explanation: 

*/
