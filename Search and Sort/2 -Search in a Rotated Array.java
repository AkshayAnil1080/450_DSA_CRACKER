// gfg: https://practice.geeksforgeeks.org/problems/search-in-a-rotated-array4618/1
// leetcode:https://leetcode.com/problems/search-in-rotated-sorted-array/

// TC : O(logn) - using BINARY search
// ASC - O(1)
// Input:
// N = 9
// A[] = {5 ,6 ,7 ,8 ,9 ,10 ,1 ,2 ,3}
// key = 10
// Output:
// 5
// Explanation: 10 is found at index 5.
class Solution
{
    int search(int A[], int low, int high, int x)
    {
        // Complete this function

        while(low<=high)
        {
            int mid = (low+high)/2;
            if(A[mid] ==x) return mid;

            if(A[low] <A[mid])   // if left half sorted
            {
                if(x>=A[low] && x<A[mid] ) // checking if present in left sorted part
                high = mid-1;
                else
                low=mid+1;
            }

            else // if right half sorted A[low] >A[mid]
            {
                if(x>A[mid] && x<=A[high])  //checking if present in right half;
                low=mid+1;

                else
                high = mid-1;
            }

        }
        return -1;
    }
}
