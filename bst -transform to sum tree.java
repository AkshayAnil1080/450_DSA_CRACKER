class Tree{
    public int toSumTree(Node root){
         //add code here.
     if(root ==null)
     {
         return 0 ;
     }
     else
     {
         int temp = root.data;
        root.data =  toSumTree(root.left) + toSumTree(root.right);
        return root.data+temp;
     }
         
    }
}


Input:
             10
          /      \
        -2        6
       /   \     /  \
     8     -4   7    5

Output:
            20
          /    \
        4        12
       /  \     /  \
     0     0   0    0

Explanation:

           (4-2+12+6)
          /           \
      (8-4)          (7+5)
       /   \         /  \
      0     0       0    0