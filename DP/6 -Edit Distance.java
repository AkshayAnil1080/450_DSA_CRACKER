// Link : https://practice.geeksforgeeks.org/problems/edit-distance3702/1#
// TC :  O(s*t) -  s,t : length of first and second string given.
// SC :  O(s*t) - 2d array of lenght ( first string * second string)

class Solution {
    public int editDistance(String s, String t) {
        // Code here
        int m  = s.length();
        int n  = t.length();
        
        int dp[][] = new int[m+1][n+1];    // 2d array
        
        for( int i = 0 ; i <= m ;i++)
        {
            
            for( int j =0 ; j <=n ;j ++)
            {
                // if firs string is empty return second string length
                if(i == 0 )
                    dp[i][j] = j;
                    
                // if second string is empty return first string length
                else if( j == 0)
                    dp[i][j] = i;
            
            // if last characater are same ; reuturn the diagonal element
            else if( s.charAt(i-1) == t.charAt(j-1) )
            dp[i][j] = dp[i-1][j-1];
            
            // if last two character are diff ; return the min ( top, left, diagonal )
            else
            dp[i][j] = 1 +  Math.min(dp[i][j-1] , Math.min( dp[i-1][j] , dp[i-1][j-1] ) );
    
            }
            
        }
         return dp[m][n];
    }
    
           
    }