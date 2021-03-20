// TC : O(n) -  traversing through elements to shift each ele towards right
// SC  : O(1) -  no additonal space req.

class Compute {
    
    public void rotate(long a[], long n)
    {
        int index = (int) n-1;
       long temp = a[index] ; //1 . store last element in temp;
       
        for (int i = index ; i>0 ;  i --)  //2. shift all elements towards right
        {
         a[i] =  a[i-1] ;
        }
        
        a[0] = temp;  //3 update first element with last one ie. temp.
    }
}



Link : https://practice.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1#
Example 1:

Input:
N = 5
A[] = {1, 2, 3, 4, 5}
Output:
5 1 2 3 4
 

Example 2:

Input:
N = 8
A[] = {9, 8, 7, 6, 4, 2, 1, 3}
Output:
3 9 8 7 6 4 2 1