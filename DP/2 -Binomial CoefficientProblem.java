class Solution{
    static int nCr(int n, int r)
    {
        // code here//
        // nCr =  n! / r! * (n-r)! ; 
     int dp[] = new int [r+1];
     dp[0]  =1;
     
     if(r>n)
     return 0;
    if( r== 0 || r==n)
     return 1;
     
    if( r > n-r)
    r = n-r;
    int mod = 1000000007;
    
    for( int i = 0 ; i <= n; i++)
    for(int  j = Math.min(i ,r) ; j>0 ; j--)
    dp[j] =  (dp[j]  + dp[j-1] ) %mod;
    
    return dp[r];
    
    
    }
}