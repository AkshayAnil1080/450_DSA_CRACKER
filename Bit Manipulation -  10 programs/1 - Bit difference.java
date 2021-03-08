
class Solution{
    
    // Function to find number of bits needed to be flipped to convert A to B
    public static int countBitsFlip(int a, int b){
        
        // Your code here
        int n = a^b;

// count setbits in n
   int count  = 0;
    while(n > 0)
    {
        count +=  (n & 1);
        n = n /2;   // n>>1;
    }
    
    return count ; 
    // 
    }
    
    
}


TC: O(log N).
SC: O(1).


Example 1:

Input: A = 10, B = 20
Output: 4
Explanation:
A  = 01010
B  = 10100
As we can see, the bits of A that need 
to be flipped are 01010. If we flip 
these bits, we get 10100, which is B.
Example 2:

Input: A = 20, B = 25
Output: 3
Explanation:
A  = 10100
B  = 11001
As we can see, the bits of A that need 
to be flipped are 10100. If we flip 
these bits, we get 11001, which is B.