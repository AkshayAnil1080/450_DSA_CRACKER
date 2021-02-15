class Tree
{
     //public static Map<Integer,Integer> myMap;
   public static int max_level ;
   
   public static ArrayList<Integer> leftView(Node root)
    {
      // Your code here
       ArrayList<Integer> al = new ArrayList<>();
        max_level =0 ;
        
      if (root == null)
      return al;
      
        
      leftV(al, root,1);
      
      
      return al;
      
      
    }
    static void leftV( ArrayList a, Node root, int level)
    {
        if (root ==null)
         return;
        
        
        if(max_level<level)
        {
            // System.out.print(root.data + " ");
            a.add(root.data);
            max_level = level;
        }
        
        leftV(a, root.left, level+1);
        leftV(a, root.right, level+1);
    }
    
}