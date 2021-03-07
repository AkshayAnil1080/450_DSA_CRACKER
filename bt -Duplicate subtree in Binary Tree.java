class Solution {
    
    char mark = '$';
    int dupSub(Node root) {
        // code here 
        HashSet<String> h = new HashSet<>();
        String str = dup(root , h);
        
        if(str.equals(""))
        return 1;
        else
        return 0;
        
    }
    
    public String dup(Node  root , HashSet<String> subtree)
    {
        String s =  "";
        if(root == null)
        return s + mark;  // if root is null returning $.
        
        String lstr =  dup(root.left , subtree);
        if (lstr.equals(s))  
        return s;
        
        String rstr = dup(root.right , subtree);
        if (rstr.equals(s))
        return s;
        
        s=s+root.data+lstr+rstr;
        
        if(s.length() >3 && subtree.contains(s))
        return "";
        
        subtree.add(s);
        return s;
    }
}

// TC: O(n) 
// SC : O(n) : using hashset 
Example 1 :

Input : 
               1
             /   \ 
           2       3
         /   \       \    
        4     5       2     
                     /  \    
                    4    5

Output : 1
Explanation : 
    2     
  /   \    
 4     5
is the duplicate sub-tree.
 

Example 2 :

Input : 
               1
             /   \ 
           2       3

Output: 0
Explanation: There is no duplicate sub-tree 
in the given binary tree.