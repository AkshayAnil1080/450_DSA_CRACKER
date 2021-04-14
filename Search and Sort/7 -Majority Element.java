// gfg : https://practice.geeksforgeeks.org/problems/majority-element-1587115620/1#
// Input:
// N = 3
// A[] = {1,2,3}
// Output:
// -1
// Explanation:
// Since, each element in
// {1,2,3} appears only once so there
// is no majority element.
// TC:O(n)
// ASC: O(1)
class Solution
{
    static int majorityElement(int arr[], int n)
    {
        // your code here
        int res = 0;
        int c=1;
        for( int i=1;i<n;i++)
        {
            if(arr[res] ==arr[i])
            c++;

            else
            c--;

            if(c==0)
            {
                res= i; c=1;
            }
        }
        // checking if cand is has >n/2 votes
        c=0;
        for( int i=0;i<n;i++)
        {
            if(arr[res] ==arr[i])
            c++;

        }
            if(c<=n/2)
            return -1;

        return arr[res];

    }
}
