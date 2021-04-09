//TC : O(R+C)
//ASC : O(1)
class Solution {
    public boolean searchMatrix(int[][] mat, int X) {

        int N = mat.length;
        int M = mat[0].length;

        int i = 0 , j =M-1;
        while(i<N && j>=0)
        {
            if(mat[i][j] == X)
            return true;

            else if (mat[i][j] > X)
            j--;

            else
            i++;
        }
        return false;
    }
}
