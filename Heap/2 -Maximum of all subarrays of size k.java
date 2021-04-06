
//NAIVE -  slidging window
// TC: O(nxk)
// Aux space: O(n-k+1)
class Solution{
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        // Your code here
        ArrayList<Integer> al =  new ArrayList<>();
        for(int i = 0 ; i<n-k+1;i++)
        {
            int max =arr[i];

            for( int j=i+1; j<i+k ;j++)
            {
                if(arr[j]>max)
                max = arr[j];
            }
            al.add(max);
        }
        return al;
    }
}

// 2nd menthod = using max heap.  - TC : O(n) - addding all elements in priority queue.  - ASC -O(n)
// Approach  - from max heap for every window  of k elements, add the root of it ArrayList and return al.
class Solution{
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        // Your code here
      ArrayList<Integer> al = new ArrayList<>();
      PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());  // will use to create max heap


      for( int i=0; i<k ;i++)
      pq.add(arr[i]);

      al.add(pq.peek());
      // remove the first element of arr form pq=> as want to compare for next k elements
      pq.remove(arr[0]);

      for( int i=k ; i<n;i++)
      {
          pq.add(arr[i]);   // add the current element
          al.add(pq.peek());  ///store the max
          pq.remove(arr[i-k+1]);   // remove the 2nd element in 1st iteratiion i.e the first elemet of every window.
      }

      return al;

    }
}
