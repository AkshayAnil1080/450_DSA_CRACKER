class Solution{
    
    //Function to return sum of count of set bits in the integers from 1 to n.
    public int countSetBits(int n){
    
        // Your code her
            
        if(n==0)
        return 0;
        
      int x = largestpowerof2(n);  
      int y = x * (1 << (x-1));  // set bit count before 2^x
      int z = n - (1 << x) +1 ; //  set bit count of msb from 2^x - > n
      int rest  = n - (1 << x );
      return  y + z + countSetBits(rest);
      
        }
    
    
    public int largestpowerof2(int n)
    {
        int x = 0 ;
        while( (1 << x)  <= n)
        x++;
        
        return x -1 ;
    }
    
}
// TC:  O(logn)
// SC: O(1)