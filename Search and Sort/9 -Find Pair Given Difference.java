// gfg - https://practice.geeksforgeeks.org/problems/find-pair-given-difference1559/1#
// TC -  O(LlogL) -  L is the size of array
// ASC - O(1)
// Input:
// L = 6, N = 78
// arr[] = {5, 20, 3, 2, 5, 80}
// Output: 1
// Explanation: (2, 80) have difference of 78.
// Example 2:
//
// Input:
// L = 5, N = 45
// arr[] = {90, 70, 20, 80, 50}
// Output: -1
// Explanation: There is no pair with difference of 45.
class Solution
{
    public boolean findPair(int arr[], int size, int n)
    {
        //code here.

        Arrays.sort(arr); // O(LlogL)

        int i =0 ;
        int j =1;
       while(i<size && j<size)   // O(logL)
        {
            if(arr[j]-arr[i] ==n)
            return true;
            if(arr[j]-arr[i] <n)
            j++;
            else
            i++;

        }
        return false;
    }
}
