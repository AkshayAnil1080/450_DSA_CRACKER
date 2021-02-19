class Tree
{
    // Return a list containing the inorder traversal of the given tree
    ArrayList<Integer> inOrder(Node root)
    {   
        ArrayList<Integer> al = new ArrayList<>();
      order(al,root);
        
        return al;
        
    }
void order(ArrayList a , Node r )
{
    if(r==null)
    return;
    
    else
    {
        
        order(a,r.left);
        a.add(r.data);
        order(a,r.right);
    }
}
    
    
}

Example 1:

Input:
       1
     /  \
    3    2
Output: 3 1 2

Example 2:

Input:
        10
     /      \ 
    20       30 
  /    \    /
 40    60  50
Output: 40 20 60 10 50 30
