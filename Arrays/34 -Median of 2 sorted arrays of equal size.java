// Link : https://practice.geeksforgeeks.org/problems/sum-of-middle-elements-of-two-sorted-arrays2305/0/?category[]=Divide%20and%20Conquer&page=1&query=category[]Divide%20and%20Conquerpage1#
// Expected Time Complexity: O(log N)
// Expected Auxiliary Space: O(1)
// Input:
// N = 5
// Ar1[] = {1, 2, 4, 6, 10}
// Ar2[] = {4, 5, 6, 9, 12}
// Output: 11
// Explanation: The merged array looks like
// {1,2,4,4,5,6,6,9,10,12}. Sum of middle
// elements is 11 (5 + 6).

class Solution {
    int findMidSum(int[] ar1, int[] ar2, int n) {
        // code here
        return (int)getMedian(n,n,ar1,ar2);

    }

    static double getMedian(int n1, int n2, int a[], int b[])
    {
        int begin = 0 ;
        int end = n1;

        while(begin <= end)
        {
            int i1 = (begin+end)/2;
            int i2 = (n1+n2+1)/2 -i1;   // to make the right half side has equal number of elements.

            int min1 = (i1==n1)?Integer.MAX_VALUE:a[i1];  // reached the last , since min1 is the right half , and it is to be greater, => max_value
            int max1 = (i1==0)?Integer.MIN_VALUE:a[i1-1];
            // max1 is the max of left half at i-1 index yes! -> so if max1>min2 endd =i1-1, if i1 get traversed till 0th index and still max1>min2, make the i1-1 as the mini value, then it will surely satisfy
            int min2 = (i2==n2)?Integer.MAX_VALUE:b[i2]; // same exp as min1
            int max2 = (i2==0)?Integer.MIN_VALUE:b[i2-1];   //



            if(max1<=min2 && max2<=min1)
            {
                // return median
                if((n1+n2)%2==0)
                    return ((double) Math.max(max1, max2)  + Math.min(min1,min2) );
                else
                return ((double) Math.max(max1,max2));
            }
            else if(max1>min2) end = i1-1;
            else  begin =i1+1;      // (max2>min1)

        }
        return 0;
    }
}
