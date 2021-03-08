class Solution {
    static int setBits(int n) {
        // code here
        
    //  return Integer.bitCount(N) ;
    
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

Input:
N = 6
Output:
2
Explanation:
Binary representation is '110' 
So the count of the set bit is 2.
Example 2:

Input:
8
Output:
1
Explanation:
Binary representation is '1000' 
So the count of the set bit is 1.