// Link: https://practice.geeksforgeeks.org/problems/array-subset-of-another-array2317/1#
// Expected Time Complexity: O(n)
// Expected Auxiliary Space: O(n)
// Input:
// a1[] = {10, 5, 2, 23, 19}
// a2[] = {19, 5, 3}
// Output:
// No
// Explanation:
// a2[] is not a subset of a1[]

class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {

        HashMap<Long, Integer> mp =  new HashMap<>();

        for( int i =0 ;i <n ;i++)
        {
            mp.put(a1[i],1);
        }

        for( int i =0 ;i <m ;i++)

        {
            if(mp.get(a2[i]) == null)
            return "No";
        }

        return "Yes";

    }
}
