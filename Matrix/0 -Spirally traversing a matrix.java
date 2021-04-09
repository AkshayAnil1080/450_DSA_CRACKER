
Expected Time Complexity: O(R*C)
Expected Auxiliary Space: O(R*C)

class Solution{
    static ArrayList<Integer> spirallyTraverse(int mat[][], int R, int C)
    {
        // code here
        // top , bottom  - row
        // left , right - col
        ArrayList<Integer> al = new ArrayList<>();

        int top = 0 , left= 0 , bottom = R-1 , right =C-1;
        while(top<=bottom && left<=right)
        {
            //top view
            for( int i = left ;i <=right ; i++)
            al.add(mat[top][i]);

            top++;

            //left view
            for( int i = top ; i<=bottom ;i++)
            al.add(mat[i][right]);

            right--;

            if(top<=bottom)
            {// bottom view
                for( int i =right ;i>=left ;i--)
                {
                    al.add(mat[bottom][i]);
                }
                bottom--;
            }
            if(left<=right)
            {// left view
                for( int  i = bottom ; i>=top ; i--)
                {
                    al.add(mat[i][left]);
                }
                left++;
            }
        }
        return al;

    }
}
