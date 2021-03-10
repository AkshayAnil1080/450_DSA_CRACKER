class GfG
{
    public static void findPreSuc(Node root, Res p, Res s, int key)
    {
       // add your code here
       
    //   Case 1
       if(root == null)
       return;
        // Case 2
       if(root.data == key)
       {
           if(root.left!=null)
           {
               Node temp = root.left;
               //finding max
               while(temp.right!=null)
               temp =  temp.right;
               
               p.pre = temp ;
           }
           
           if(root.right!=null)
           {
               Node temp = root.right;
               // finding min
               while(temp.left!=null)
               temp = temp.left;
               
               s.succ = temp;
           }
           return;
       }
       //Case 3
       // when key is not found && key<root,data - 1. find where it should be present(#AATMA) - make its root as succ - recursicve call
       if(key < root.data)
       {
           s.succ =  root;
           findPreSuc(s.succ.left ,  p,  s , key);
           
       }
       //// when key is not found && key>root,data - 1. find where it should be present(#AATMA) - make its root as pre - recursicve call
       else
       {
           p.pre = root;
           findPreSuc(p.pre.right,  p,  s , key);
       }
    }
    
}