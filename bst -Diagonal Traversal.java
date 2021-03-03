class Tree
{
     public ArrayList<Integer> diagonal(Node root)
      {
           //add your code here.
           ArrayList<Integer> al = new ArrayList<>();
           Queue<Node> q = new LinkedList<>();
           
           if(root == null)
           {return al; }
           
           q.add(root);
           while(!q.isEmpty())
           {
               
               Node temp = q.remove();
               
               while(temp!=null)
               {
                   System.out.print(temp.data + " ");
                   
                   if(temp.left!=null)
                   {q.add(temp.left);}
                   
                   temp=temp.right;
               }
           }
           return al;
      }
}


/* https://practice.geeksforgeeks.org/problems/diagonal-traversal-of-binary-tree/1#

Example 1:

Input :
            8
         /     \
        3      10
      /   \      \
     1     6     14
         /   \   /
        4     7 13
Output : 8 10 14 3 6 7 13 1 4
Explanation:
unnamed
Diagonal Traversal of binary tree : 
 8 10 14 3 6 7 13 1 4
*/