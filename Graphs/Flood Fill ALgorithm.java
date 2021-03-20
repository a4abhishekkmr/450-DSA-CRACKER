Flood fill Algorithm 

Given an image of size n*m, location of a pixel in the screen i,e(sr, cc) and color newColor, your task is to replace color of the given pixel and all adjacent(excluding diagonally adjacent) same colored pixels with the given color newColor.


Example 1:

Input: image = {{1,1,1},{1,1,0},{1,0,1}},
sr = 1, sc = 1, newColor = 2.
Output: {{2,2,2},{2,2,0},{2,0,1}}
Explanation: From the center of the image 
(with position (sr, sc) = (1, 1)), all 
pixels connected by a path of the same color
as the starting pixel are colored with the new 
color.Note the bottom corner is not colored 2, 
because it is not 4-directionally connected to 
the starting pixel.

Solution>>

class Solution
{
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor)
    {
        // Code here
        if(image[sr][sc]==newColor)
        {
            return image;
        }
        int prevFill=image[sr][sc];
     //return
     
     floodFillAlgo(image, sr, sc, newColor,prevFill);   
    
        return image;
    }

        
    public void floodFillAlgo(int[][] image, int sr, int sc, int newColor, int prevFill){
        int rows=image.length;
        int cols=image[0].length;
        //int prevFill=image[sr][sc];
        if(sr<0 || sr>=rows || sc<0 || sc>=cols)
        {
            return;
        }
        if(image[sr][sc]!=prevFill)
        {
            return;
        }
        image[sr][sc]=newColor;
        floodFillAlgo( image,  sr-1,  sc, newColor,prevFill);//up
        floodFillAlgo( image,  sr+1,  sc,  newColor,prevFill);//down
        floodFillAlgo( image,  sr,  sc+1, newColor,prevFill);//left
        floodFillAlgo( image,  sr,  sc-1,  newColor,prevFill);//right
    }
}

Expected Time Compelxity: O(n*m)
Expected Space Complexity: O(n*m)