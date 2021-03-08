class Solution{
    
    // Function to check if given number n is a power of two.
    public static boolean isPowerofTwo(long n){
        
        // Your code here
      long count  = 0;
    while(n > 0)
    {
        count +=  (n & 1);
        n = n /2;   // n>>1;
    }
    
   if(count == 1)
   return true;
   else
   return false;
    }
    
}


Tc:  O(log N).
SC:  O(1).

Example 1:

Input: N = 1
Output: true
Explanation: 1 is equal to 2 raised to 0 (20 == 1).
Example 2:

Input: N = 98
Output: false
Explanation: 
98 cannot be obtained by any power of 2.