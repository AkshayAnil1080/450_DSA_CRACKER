//User function Template for Java
// NAIVE - O(n*m)  -ans =-1 ; i loop from 0 -n ; j nested from n-1 to >=0 , if arr[i][j]==1 c++;if c> prev c -> ans =i; else break. return ans;

class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here


        int max = 0;
        int ans = -1;
        for( int i =0;  i<n; i++)
        {
            int c = 0;
            for( int j =m-1; j>=0 ;j--)
              { if (arr[i][j]==1)
                c++;

                else
                break;

              }
            if(c>max)
                 {
                     max =c ;
                     ans = i;
                 }
        }
        return ans;
    }
}

// efficient - O(n+m)  -  start from top right -  if a[i][j]==1 move left - and store the ith row - else move down.
class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
    int i = 0 , j = m-1;
    int ans  = -1;
    while(i<n && j>=0)
    {
        if(arr[i][j] ==1)
        {
             j--;
             ans = i;
        }


        else
        i++;

    }
    return ans;



    Input:
N = 4 , M = 4
Arr[][] = {{0, 1, 1, 1},
           {0, 0, 1, 1},
           {1, 1, 1, 1},
           {0, 0, 0, 0}}
Output: 2
Explanation: Row 2 contains 4 1's (0-based
indexing).
