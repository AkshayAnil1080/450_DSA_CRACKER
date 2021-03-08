class Solution {
  static int findPosition(int n) {
        // code here
       if(n==1)
       return 1;
        
        // if(Integer.bitCount(n) ==1 )  - if used this no need to creat the fiunction of setbit.
        if(setbit(n) ==1)
        {
            int ans = (int)( Math.log(n) / Math.log(2) );
            return  ans + 1;
        }
        else
        return -1;
    }
    
  static  int setbit(int n){
          int count = 0;
        while(n>0)
        {
          count = count + (n&1) ;
          n=n/2;
            
        }
     
        return count;
    }
}


TC: O(logn)
SC: O(1)

Example 1:

Input:
N = 2
Output:
2
Explanation:
2 is represented as "10" in Binary.
As we see there's only one set bit
and it's in Position 2 and thus the
Output 2.
Example 2:

Input:
N = 5
Output:
-1
Explanation:
5 is represented as "101" in Binary.
As we see there's two set bits
and thus the Output -1.