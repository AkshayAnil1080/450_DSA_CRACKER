// TC : O(n)
// Aux Space: O(1)
class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static int trappingWater(int a[], int n) { 
        
        // Your code here
        int lmax[] = new int[n];
        int rmax[] = new int[n];
        
        lmax[0] = a[0];
        for( int i =1; i<n; i++)
        lmax[i] =  Math.max(lmax[i-1], a[i]);
        
        rmax[n-1] = a[n-1];
        for( int i = n-2; i >=0 ; i--)
        rmax[i] = Math.max(rmax[i+1] , a[i]);
        
        // for each i . calualting watre stored = Min(lmax[i],rman[i] -a[i]) and summing for all ith index;
        int sum = 0;
        for( int i= 0 ; i<n ; i++)
        {
            sum += Math.min(lmax[i],rmax[i]) -a[i];
        }
        return sum;
    
    } 
}


