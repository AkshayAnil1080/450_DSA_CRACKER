// GFG : https://practice.geeksforgeeks.org/problems/arithmetic-number2815/1
// Input: A = 1, B = 3, C = 2
// Output: 1
// Explaination: 3 is the second term of the
// sequence starting with 1 and having a common
// difference 2.
//

// TC :  O(1)
// ASC : O(1)
class Solution{
    static int inSequence(int A, int B, int C){
        // code here
        if(A==B)
        return 1;

     int muld = B-A;

     if(C!=0)
    {
       if(muld/C>0)
        {
              if(muld%C==0)
            return 1;
        }

    }
    else
        {
            if(A==B)
            return 1;
        }

    return 0;

     }
}
