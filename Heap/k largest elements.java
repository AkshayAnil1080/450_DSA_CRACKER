// TC : O(n+k)
// ASC : O(n)

class Solution {
    int[] kLargest(int[] arr, int n, int k) {
        // code here
        int a[] =  new int[k];
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for( int i = 0;i<n;i++)
        pq.add(arr[i]);

        for( int i=0;i<k;i++)
        a[i] = pq.remove();

        return a;
    }
}
