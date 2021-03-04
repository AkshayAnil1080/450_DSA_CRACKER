class Solution
{
    public int minSwaps(int[] arr)
    {
        // Code here
        int ans = 0;
        int N = arr.length;
        //1
        int temp[]  = Arrays.copyOfRange(arr , 0  , N);
        
        //2
        HashMap<Integer, Integer> h = new HashMap<>();
        Arrays.sort(temp);
        //3
        for(int i = 0 ; i < N ; i ++)
        {
            h.put(arr[i], i);
        }
        //4
        for(int i = 0; i <N ; i++)
        {
            if(arr[i] != temp[i])
            {
                ans++;
                int init = arr[i];  // making a ptr to traverse.
                
            
            swap(arr , i ,h.get(temp[i]));
            
            h.put(init , h.get(temp[i]));
            h.put(temp[i] , i);
            }
        }
        return ans;
    }
    
    public void swap (int[] arr , int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}


TC: O(nlogn) - n-> n times push in hash + logn for sorting.
SC : (n) - used hash map for n pairs.
Example 1:

Input:
nums = {2, 8, 5, 4}
Output:
1
Explaination:
swap 8 with 4.
Example 2:

Input:
nums = {10, 19, 6, 3, 5}
Output:
2
Explaination:
swap 10 with 3 and swap 19 with 5.

