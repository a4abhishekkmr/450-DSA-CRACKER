Given a matrix of size R*C. Traverse the matrix in spiral form.

Example 1:

Input:
R = 4, C = 4
matrix[][] = {{1, 2, 3, 4},
           {5, 6, 7, 8},
           {9, 10, 11, 12},
           {13, 14, 15,16}}
Output: 
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10



class Solution{
    static ArrayList<Integer> spirallyTraverse(int mat[][], int r, int c)
    {
        // code here 
        ArrayList<Integer> al=new ArrayList<>();
        int top=0,right=c-1,bottom=r-1,left=0;
        
        while(top<=bottom && left<=right)
        {
            //right view
            for(int i=left;i<=right;i++)
            al.add(mat[top][i]);
            top++;//out of loop
            
            //top view
            for(int i=top;i<=bottom;i++)
            al.add(mat[i][right]);
            right--;//out of loop
            
            //bottom view (recursive)
            if(top<=bottom)
            {
                for(int i=right;i>=left;i--)
                al.add(mat[bottom][i]);
                bottom--;
            }
            //left view (recursive)
            if(left<=right)
            {
                for(int i=bottom;i>=top;i--)
                al.add(mat[i][left]);
                left++;
            }
        }
        return al;
    }
}
//Time complexity=> O(r*c) printing every cell with ones