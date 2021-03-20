// TC = O(n) - >  performing the sum opeartion throughout the array
// SC =O(n) - > adding sum of adjacent elements of array in set.

class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int a[], int n)
    {
        //Your code here
         Set<Integer>  set  = new HashSet<>();
        int sum = 0 ;
        boolean p = false;
        for( int i= 0 ; i<n  ; i++)
        {
            set.add(sum);
            sum = sum + a[i];
            
            if(set.contains(sum))
            {
            p  = true;
            break;
            }
     
        }
        
        if(p)
        return true;
        else
        return false;
    }
}


https://practice.geeksforgeeks.org/problems/subarray-with-0-sum-1587115621/1#

Input:
5
4 2 -3 1 6

Output: 
Yes

Explanation: 
2, -3, 1 is the subarray 
with sum 0.