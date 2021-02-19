class Level_order_traversal
{
    //You are required to complete this method
    static ArrayList <Integer> levelOrder(Node node) 
    {
       ArrayList <Integer> al = new ArrayList<>();
        Queue<Node> q = new LinkedList<Node>();
        Node root = node;
        q.add(root);
        
        while(!q.isEmpty())
        {
            Node temp =q.poll();
            System.out.print(temp.data+ " ");
            
            if(temp.left!=null)
            q.add(temp.left);
            
            if(temp.right!=null)
            q.add(temp.right);
            
            
           
           
        }
       
        return al;    ///// pura farji..........just like malya...
    }
}

Input:
    1
  /   \ 
 3     2
Output:1 3 2

Input:
        10
     /      \
    20       30
  /   \
 40   60