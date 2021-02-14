class Tree
{
    void mirror(Node node)
    {
	// Your code here
	if( node == null)
	return;
	
	else
	{
	    Node temp;
	    mirror(node.left);
	    mirror(node.right);
	    
	    temp = node.left;
	    node.left=node.right;
	    node.right=temp;
	}
    }
}