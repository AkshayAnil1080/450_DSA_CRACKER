// gfg: https://practice.geeksforgeeks.org/problems/merge-two-sorted-arrays5135/1#

// Input:
// N = 2, M = 3
// arr1[] = {10, 12}
// arr2[] = {5, 18, 20}
// Output: 5 10 12 18 20
// Explanation: Since you can't use any
// extra space, modify the given arrays
// to form
// arr1[] = {5, 10}
// arr2[] = {12, 18, 20}


// TC :  O(Max(m,n)logMax(m,n))
// ASC: O(1)


class Solution {

    public void merge(int arr1[], int arr2[], int n, int m) {
        // code here
        int i=n-1,j=0;

      while(i>=0  && j<m)  // Min(n,m)
      {
          if(arr1[i] >arr2[j] )
          {
              int temp = arr1[i];
              arr1[i] = arr2[j] ;
              arr2[j] = temp;

          }
           i--;j++;

      }

      Arrays.sort(arr1);   // nlogn
      Arrays.sort(arr2);    // mlogm


    }
}
