class Solution{
    
    // The function returns the root of the BST (currently rooted at 'root') 
    // after inserting a new Node with value 'Key' into it. 
    Node insert(Node root, int key)
    {
        // your code here
        
        if(root ==null)
        root = new Node(key);
        
        
        if(key < root.data)
        {
            
           root.left =  insert(root.left , key);
        }
        else if(key  > root.data)
        {
            root.right = insert(root.right , key);
        }
        return root;
    }
}

// TC : O(heightofBST)
// SC : O(1)