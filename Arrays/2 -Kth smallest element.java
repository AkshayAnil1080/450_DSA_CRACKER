

public static int kthSmallest(int[] arr, int l, int r, int k) 
{ 
    //Your code here
    if(k>r+1 || k<=0)
    return -1;
    
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    int ans=0;
    for(int i = r  ; i>=l ; i--)
    {
        pq.add(arr[i]);
    }
    for(int i = 0 ; i<k ; i++)
    ans = pq.remove();
    
    // System.out.println(ans);
    return ans;
} 