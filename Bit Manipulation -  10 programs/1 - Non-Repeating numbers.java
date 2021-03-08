class Solution
{
    public int[] singleNumber(int[] a)
    {
        // Code here
        //1   xor f all elements in array ; x^x =0 and 0^y =y 
        int all = 0 ;
        for ( int i = 0; i< a.length ; i++)
        {
            all = all^a[i];   // gives the xor of two non repeating elements .
        }
        
        
        //2
        int m = all & -all ;  // 
        
        int all1 = 0;
        int all2 = 0;
        
        //3
        for ( int i = 0; i< a.length ; i++)
        {
            if((m & a[i]) == 0 )
            {
                all1 = all1 ^ a[i];   // xor of first group of elements maybe x or maybe y
            }
            
            else
            all2 = all2 ^ a[i];   // xor of second group of elements  : if above one x , here y else x
        }
        
        //4  need to sort the all1 and all2 as we dont know all1 is x or y.
       int result[] = new int[2];
       result[0] = all1;
        result[1] = all2;
        Arrays.sort(result);
        
        return result;
       
        
    }
}


Example 1:

Input: 
N = 2
arr[] = {1, 2, 3, 2, 1, 4}
Output:
3 4 
Explanation:
3 and 4 occur exactly once.
Example 2:

Input:
N = 1
arr[] = {2, 1, 3, 2}
Output:
1 3
Explanation:
1 3 occur exactly once.

Expected Time Complexity: O(N)
Expected Space Complexity: O(1)