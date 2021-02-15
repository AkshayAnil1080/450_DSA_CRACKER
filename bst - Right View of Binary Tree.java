class Tree{

     
   public static int max_level ;
   
   public static ArrayList<Integer> rightView(Node root)
    {
      // Your code here
       ArrayList<Integer> al = new ArrayList<>();
        max_level =0 ;
        
      if (root == null)
      return al;
      
        
      rightV(al, root,1);
      
      
      return al;
      
      
    }
    static void rightV( ArrayList a, Node root, int level)
    {
        if (root ==null)
         return;
        
        
        if(max_level<level)
        {
            // System.out.print(root.data + " ");
            a.add(root.data);
            max_level = level;
        }
        
        rightV(a, root.right, level+1);
        rightV(a, root.left, level+1);
        
    }    
        
    
}