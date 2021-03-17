// TC:  O(n*k^2)  - ‘n’ is the number of eggs and ‘k’ is the number of floors, as we use a nested for loop ‘k^2’ times for each egg
// SC:  O(nk)  - used an 2d array if n+1, k+1 dimension.

class EggDrop 
{
    static int eggDrop(int n, int k) 
	{
	    // Your code here
	
	int egg[][] = new int[n+1][k+1];
	int res;
	int i,j,x;
	
	for( i = 0 ; i<=n ; i++)
    	{
    	    egg[i][1] = 1;
    	    egg[i][0] = 0;
    	    
    	}
    	
    for( j  = 1 ; j<=k ; j++)
    egg[1][j]  = j ; 
    
    for(i  =2 ; i<=n ; i++)
    {
       
    	for(j = 2; j<=k ; j++)
    	{
    	egg[i][j] = Integer.MAX_VALUE;
        	
        	for(x=1 ;  x<=j ;x++ )
            	{
            	    res  = 1 + Math.max( egg[i-1][x-1] , egg[i][j-x] );
            	    
            	    if(res  < egg[i][j])
            	    egg[i][j]  = res ; 
            	}
    	}
    }
        return egg[n][k];
	
    }



Input:
N = 2, K = 10
Output: 4
Example 2:

Input:
N = 3, K = 5
Output: 3
}