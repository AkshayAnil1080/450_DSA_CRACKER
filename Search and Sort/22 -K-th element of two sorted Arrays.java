// gfg :  https://practice.geeksforgeeks.org/problems/k-th-element-of-two-sorted-array1317/1
// TC : O(n1+n2)
// ASC: O(n1+n2)
// Input:
// arr1[] = {2, 3, 6, 7, 9}
// arr2[] = {1, 4, 8, 10}
// k = 5
// Output:
// 6
// Explanation:
// The final sorted array would be -
// 1, 2, 3, 4, 6, 7, 8, 9, 10
// The 5th element of this array is 6.

class Solution {
    public long kthElement( int left[], int right[], int n1, int n2, int x) {
        int a[] = new int [n1+n2];
        int i = 0 ;
        int j =0;
        int k = 0;

        while(i<n1 && j<n2)
        {
            if(left[i]<right[j])
            {
                a[k] = left[i]; i++;k++;
            }

            else
            {
                a[k] = right[j];
                j++;k++;
            }
        }

        while(i<n1)
        {
            a[k] =left[i]; i++;k++;
        }
        while(j<n2)
        {
            a[k] = right[j]; j++;k++;
        }
        return (long) a[x-1];

    }
}
