Input:
N = 3 
matrix[][] = {{45, 48, 54},
             {21, 89, 87}
             {70, 78, 15}}
Output: 45 48 54 87 89 21 70 78 15 
Explanation:
Matrix is as below:
45 48 54
21 89 87
70 78 15
Printing it in snake pattern will lead to 
the output as 45 48 54 87 89 21 70 78 15.
  
  
  
  lass Solution
{
    //Function to return list of integers visited in snake pattern in matrix.
    static ArrayList<Integer> snakePattern(int matrix[][])
    {
        // code here
        int n=matrix.length;
        ArrayList<Integer> al= new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            for(int j=0;j<n;j++)
            {
                al.add(matrix[i][j]);
            }
            else
            {
                for(int j=n-1;j>=0;j--)
                {
                al.add(matrix[i][j]);
                }
            }
        }
        return al;
    }
}
