class Tree
{
    ArrayList<Integer> postOrder(Node root)
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
                    order(a,r.right);
                    a.add(r.data);
                }
            }
}


Example 1:

Input:
        19
     /     \
    10      8
  /    \
 11    13
Output: 11 13 10 8 19
Example 2:

Input:
          11
         /
       15
      /
     7
Output: 7 15 11

