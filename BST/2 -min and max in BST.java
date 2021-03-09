class Tree
{
    int minValue(Node node)
    
    {
        
        if(node == null)
        return -1;
        
        while(node.left != null)
        {
            node = node.left;
        }
        return node.data;
        
    }
}

//TC : O(height of tree) = since traversing in left only.
//SC : O(1)