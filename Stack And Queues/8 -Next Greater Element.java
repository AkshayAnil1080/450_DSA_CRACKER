// Profile: https://auth.geeksforgeeks.org/user/akshayanil/practice/
// https://practice.geeksforgeeks.org/problems/next-larger-element-1587115620/1

// TC :O(n)
// ASC : O(n)
class Solution{
    public static long[] nextLargerElement(long[] arr, int n) {
        // Your code here
        long ans[] =  new long[n];
        int index=n-1;
        ArrayDeque<Long> st =  new ArrayDeque<>();

        st.push(arr[n-1]);
        ans[index] = -1; index--;
        for( int i =n-2 ; i >=0; i--)
        {
            while(!st.isEmpty()  &&  st.peek() <= arr[i] )
            st.pop();

          long res = st.isEmpty() ? -1 : st.peek();
            ans[index] = res; index--;

        st.push(arr[i]);
        }
        return ans;

    }
}

Input:
N = 4, arr[] = [1 3 2 4]
Output:
3 4 4 -1
Explanation:
In the array, the next larger element
to 1 is 3 , 3 is 4 , 2 is 4 and for 4 ?
since it doesn't exist, it is -1.
