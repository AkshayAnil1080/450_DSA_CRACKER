class Solution{
    static long nPr(long n, long r){
        // code here
        long Fn = 1 , Fk = 1;
        for(long i = 1 ; i<=n ; i++)
        {
            Fn =  Fn*i;
            if( i  == n-r)
            Fk = Fn;   // dp
            
        }
        
        return Fn/Fk;
    }
}


// approach  : while calculating n! store the r! into one variable and print as desired.
// TC : (n) Sc: O(1)