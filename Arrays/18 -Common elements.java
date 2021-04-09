Expected Time Complexity: O(n1 + n2 + n3)
Expected Auxiliary Space: O(n1 + n2 + n3)

class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        // code here 
        ArrayList<Integer> al = new ArrayList<>();
        HashMap<Integer, Integer> mp = new HashMap<>();
        
        for( int i = 0 ;i<n1;  i++)
        mp.put(A[i] ,1);
        
        for(int i = 0 ;i <n2 ;i++)
        {
            if(mp.get(B[i])!= null && mp.get(B[i]) ==1 )
            mp.put(B[i] ,2);
        }
         for(int i = 0 ;i <n3 ;i++)
        {
            if(mp.get(C[i])!= null && mp.get(C[i]) ==2 )
           { mp.put(C[i] ,3);
            
            al.add(C[i]);
               
           }
        }
        if(al.isEmpty())
        al.add(-1);

        return al;
    
    }
}