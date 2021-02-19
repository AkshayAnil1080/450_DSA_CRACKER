class Tree
{
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        ArrayList<Integer> al = new ArrayList<>();
        Queue<Node> q = new LinkedList<Node>();
        Stack<Integer> st = new Stack<>();
        
        Node root = node;
        q.add(root);
        
        while(!q.isEmpty())
        {
            Node temp = q.poll();
            st.add(temp.data);
            
            
            if(temp.right!=null)
            q.add(temp.right);
            
            if(temp.left!=null)
            q.add(temp.left);
   
        }
        while(!st.isEmpty())  // because on complete empty of stack it shows exception error.
        {
           
            int t = st.pop();
              System.out.print(t+" ");
        }
       
        
        return al;
          }
}      


Input :
        1
      /   \
     3     2

Output: 3 2 1

Input :
       10
      /  \
     20   30
    / \ 
   40  60

Output: 40 60 20 30 10
