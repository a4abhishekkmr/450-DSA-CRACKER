Example 1:

Input:
n1 = 4, m1 = 3
matrix[][] = {{ 1,  2,  3},
              { 5,  6,  7},
              {11, 10,  9},
              {13, 14, 15}}
Output: 3 2 1 7 6 5 9 10 11 15 14 13
Explanation:
Array after exchanging columns:
3 2 1
7 6 5
9 10 11
15 14 13
  
  
  
  
  class Solution
{
    //Function to reverse the columns of a matrix.
    static void reverseCol(int matrix[][])
    {
        // code here 
         int R=matrix.length;
        int C=matrix[0].length;
        int low=0,high=C-1;
        while(low<high)
        {
            for(int j=0;j<R;j++)
            {
                int temp=matrix[j][low];
                matrix[j][low]=matrix[j][high];
                matrix[j][high]=temp;
            }low++;high--;
        }
    }
}
