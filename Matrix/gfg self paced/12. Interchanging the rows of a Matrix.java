Example 1:

Input:
n1 = 4, m1 = 4
matrix[][] = {{1, 2, 3, 4},
             {5, 6, 7, 8},
             {9, 10, 11, 12},
             {13, 14, 15,16}}
Output: 
13 14 15 16 9 10 11 12 5 6 7 8 1 2 3 4
Explanation:
Matrix after exchanging rows:
13 14 15 16
 9 10 11 12
 5  6  7  8
 1  2  3  4
Note: Output is printed row-wise linearly. 




class Solution
{
    //Function to interchange the rows of a matrix.
    static void interchangeRows(int matrix[][])
    {
        // code here 
        int R=matrix.length;
        int C=matrix[0].length;
        int low=0,high=R-1;
        while(low<high)
        {
            for(int j=0;j<C;j++)
            {
                int temp=matrix[low][j];
                matrix[low][j]=matrix[high][j];
                matrix[high][j]=temp;
            }low++;high--;
        }
    }
}
