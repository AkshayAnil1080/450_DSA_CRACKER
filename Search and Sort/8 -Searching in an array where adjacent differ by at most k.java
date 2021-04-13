// // gfg: https://practice.geeksforgeeks.org/problems/searching-in-an-array-where-adjacent-differ-by-at-most-k0456/1#
// Expected Time Complexity: O(N).
// Expected Auxiliary Space: O(1).
// â€‹Input : arr[ ] = {4, 5, 6, 7, 6}, K = 1
//         and X = 6
// Output : 2
// Explanation:
// In an array arr 6 is present at index 2.
// So, return 2.

class Complete{


    // Function for finding maximum and value pair
    public static int search (int arr[], int n, int x, int k) {
        //Complete the function
        for( int i = 0 ; i<n ;i++){    // simple sa linear search.
            if(arr[i] ==x)
            return i;
        }
        return -1;
    }


}
