// TC : O(n*m) - > since traversing in all 4 directions.
// SC : O(n*m) - > system stack

class Solution
{
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor)
    {
        // Code here 
      
        
        int prevfill = image[sr][sc];  // the point from where we need to expand...
        if(image[sr][sc] == newColor) return image;  // bas iski kami this. why the quesiton will give with newCOlor, if its alredy coloured => the task is alredy done.
        ff(image , sr, sc, newColor , prevfill);
        return image;
    }
    
    public void ff(int image[][] , int sr , int sc, int newColor , int prevfill)
    
    {
        int rows = image.length; 
        int col = image[0].length;
        
        //1
        if( sr < 0 || sr >= rows || sc<0 || sc >=col )   // not possiblle return the image  - case of out of index
        return ;
        
        
        //2
        //  if curr cell same as the prev ,fill the colour else return
        if(image[sr][sc] != prevfill ) return ;   // not possiblle return the image  - this came implies the changes have been done.
        
        image[sr][sc]  = newColor;   // else initialize the change.
         
         
        //3
        // // call from a point in all dir be like
        
        //               sr-1 ,sc
        //                 ^                
        //                 |                    
        //    sr,sc-1 < -  .(sr,sc) - > sr,sc+1
        //                 |
        //                 v
        //                sr+1,sc
        
        ff(image , sr-1 , sc , newColor , prevfill);    
        ff(image , sr , sc+1 , newColor , prevfill);
        ff(image , sr+1 , sc , newColor , prevfill);
        ff(image , sr , sc-1 , newColor , prevfill);
        
        
        
       
    }
}


//Input: image = {{1,1,1},{1,1,0},{1,0,1}},
//sr = 1, sc = 1, newColor = 2.
//Output: {{2,2,2},{2,2,0},{2,0,1}}
//Explanation: From the center of the image 
//(with position (sr, sc) = (1, 1)), all 
//pixels connected by a path of the same color
//as the starting pixel are colored with the new 
//color.Note the bottom corner is not colored 2, 
//because it is not 4-directionally connected to 
//the starting pixel.