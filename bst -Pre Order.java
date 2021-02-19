class BinaryTree
{
    /* Computes the number of nodes in a tree. */
    static ArrayList<Integer> preorder(Node root)
    {
       ArrayList<Integer> al = new ArrayList<>();
      order(al,root);
        
        return al;
    }
    
   static void order(ArrayList a , Node r )
            {
                if(r==null)
                return;
                
                else
                {
                    
                   
                    a.add(r.data);
                    order(a,r.left);
                    order(a,r.right);
                }
            }

}


Example 1:

Input:
        1      
      /          
    4    
  /    \   
4       2
Output: 1 4 4 2 
Example 2:

Input:
       6
     /   \
    3     2
     \   / 
      1 2
Output: 6 3 1 2 2 