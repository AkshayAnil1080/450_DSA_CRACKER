// Link : https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s-1587115621/1/?track=DSASP-Sorting&batchId=154
TC : O(n) ASC:O(1)
Given an array of 0s, 1s, and 2s. Arrange the array elements such that all 0s come first, followed by all the 1s and then, all the 2s.

Note: Do not use the inbuilt sort function.
 

Example 1:

Input: N = 5, arr[] = {0, 2, 1, 2, 0}
Output: 0 0 1 2 2
Example 2:

Input: N = 3, arr[] = {0, 1, 0}
Output: 0 0 1

class Solution
{
    // The function should do the stated modifications in the given array arr[]
    // Do not return anything.
    
    // arr[]: Input Array
    // N: Size of the Array arr[]
    //Function to segregate 0s, 1s and 2s in sorted increasing order.
    public static void segragate012(int a[], int n){
        // Your Code Here
        int low = 0; int high =n-1; int i=0;
       
        
            while (i <=high)
            {
                if(a[i] ==0)
                {
                    int temp = a[i];
                    a[i] = a[low];
                    a[low] = temp;
                    i++ ;low++;
                }
                
                else if( a[i] ==2)
                {
                    int temp = a[i];
                    a[i] = a[high];
                    a[high] = temp;
                    high--;
                    
                }
                else i++;
            }
        
    }
}