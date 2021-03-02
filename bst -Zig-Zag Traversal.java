class GFG
{
    // return an array containing the zig zag level order traversal of the given tree
	ArrayList<Integer> zigZagTraversal(Node root)
	{
	    ArrayList<Integer> al = new ArrayList<>();
	    //Add your code here.
	    Stack<Node> s1 = new Stack<>();
	    Stack<Node> s2 = new Stack<>();
	    
	    s1.push(root);
	    while(!s1.isEmpty() || !s1.isEmpty())
	    {
	        
	        while(!s1.isEmpty())
	       {
	           Node temp  = s1.pop();
	           System.out.print(temp.data +  " ");
	           
	           if (temp.left!=null)
	           {
	                s2.push(temp.left);
	           }
	           
	           if(temp.right!=null)
	           {
	                s2.push(temp.right);
	           }
	       }
	    
	        
	        while(!s2.isEmpty())
	        {   
	            Node temp = s2.pop();
	            System.out.print(temp.data +  " ");
	            
	            if(temp.right!=null)
	           {
	                s1.push(temp.right);
	           }
	           
	           if (temp.left!=null)
	           {
	                s1.push(temp.left);
	           }
	            
	        }
	    }
	    
	    return al;
	    
	   
	    
	}
}


Example 1:

Input:
        3
      /   \
     2     1
Output:
3 1 2
Example 2:

Input:
           7
        /     \
       9       7
     /  \     /   
    8    8   6     
   /  \
  10   9 
Output:
7 7 9 8 8 6 9 10 

TC : O(n)
SC : two stack used, but nodes n entered, => O(n)