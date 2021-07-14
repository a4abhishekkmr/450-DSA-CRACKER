Example 1:

Input:
n1 = 3, m1 = 2
A[][] = {{4, 8},
         {0, 2}
         {1, 6}}
n2 = 2, m2 = 2
B[][] = {{5, 2},
         {9, 4}}
Output: 92 40 18 8 59 26
Explanation:
Matrices are of size 3 x 2 and 2 x 2 which 
results in 3 x 2 matrix with elements as:
res[][] = {{92, 40},
           {18, 8}
           {59, 26}}




class Solution{
    static int[][] multiplyMatrix(int A[][], int B[][])
    {
        // code here 
        int n1=A.length;
       int m1=A[0].length;
       int n2=B.length;
       int m2=B[0].length;
       
       int res[][]=new int[n1][m2];
       int empty[][]=new int[0][0];//empty array used if dimensions are not same
       
       if(m1!=n2)
       {
           return empty;
       }
       
    //   int sumline=0;
    for(int i=0;i<n1;i++)
        {for(int j=0;j<m2;j++)
        {for(int k=0;k<n2;k++)
        {
            res[i][j]+=A[i][k]*B[k][j];   
        }
        // res[i][j]=sumline;
        // sumline=0;
        }
    }  
    return res;
}
}
