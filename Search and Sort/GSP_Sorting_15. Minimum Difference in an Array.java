Profile: https://auth.geeksforgeeks.org/user/akshayanil/practice/
Link: https://practice.geeksforgeeks.org/problems/minimum-difference-in-an-array/1/?track=DSASP-Sorting&batchId=154


class Solution{
    //Function to find minimum difference between any pair of elements in an array.
    public static int MinimumDifference(int arr[], int n)
    {
        // code here
        Arrays.sort(arr);
        int res =Integer.MAX_VALUE ;
        for( int i= 0; i<n-1;i++)
        {
            res =  Math.min((arr[i+1]-arr[i]), res);
        }
        return res;
    }

};


Input: 
Arr = [2, 4, 5, 9, 7]
Output: 
1
Explanation: Difference between 5 and 4 is 1.

Expected Time Compelxity: O(n* log(n))
Expected Space Complexity: O(1)