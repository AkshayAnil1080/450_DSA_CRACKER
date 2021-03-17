class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int arr[], int n){
        
        // Your code here
        int ans = 0, sum  = 0 ;
        int i;
        for( i = 0 ; i < n   ;i ++)
        {
            if(sum + arr[i] > 0)
            sum = sum + arr[i];
            
            else
            sum = 0;
        
            ans =  Math.max(ans, sum );
        }
        
        return ans;
    }
    
}
