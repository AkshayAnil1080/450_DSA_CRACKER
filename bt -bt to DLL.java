class Solution
{
    Node head, prev = null;
  
    
    Node bToDLL(Node node)
    {
	//  Your code here
	
	//1
	if(node == null) return null;
	 
	 //2
	 bToDLL(node.left);
	 
	 //4
	 if(prev==null)
	 head = prev = node;
	  
	 //5
	 else
	 {
	     node.left = prev;
	     prev.right=node;
	     prev=node;
	 }
	
	 //3
	 bToDLL(node.right);
	 return head;
    }
}


/*
TC: O(n)
SC : O(1)
Input:
      1
    /  \
   3    2
Output:
3 1 2 
2 1 3 
Explanation: DLL would be 3<=>1<=>2
Example 2:

Input:
       10
      /   \
     20   30
   /   \
  40   60
Output:
40 20 60 10 30 
30 10 60 20 40
Explanation:  DLL would be 
40<=>20<=>60<=>10<=>30.

*/