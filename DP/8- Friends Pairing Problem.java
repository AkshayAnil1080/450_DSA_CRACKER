//TC: O(N)
// Aux Space:  O(N) 

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.countFriendsPairings(n));
                }
        }
}   

class Solution
{
    public long countFriendsPairings(int n) 
    { 
       //code here
       long dp[] = new long[n+1];
       long mod =  1000000007;
       for( int i = 0 ; i<=n ; i++)
       {
           if(i <=2)
           dp[i] = i ;
           
           else
           {
           dp[i] =  (dp[i-1] + ( (i-1) * dp[i-2] ) %mod ) %mod  ;
            
           }
       }
       
       return dp[n];
    }
}    


Input:N = 3
Output: 4
Explanation:
{1}, {2}, {3} : All single
{1}, {2,3} : 2 and 3 paired but 1 is single.
{1,2}, {3} : 1 and 2 are paired but 3 is single.
{1,3}, {2} : 1 and 3 are paired but 2 is single.
Note that {1,2} and {2,1} are considered same.