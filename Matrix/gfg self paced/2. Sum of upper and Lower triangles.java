2. Sum of upper and lower triangles 

Given a square matrix of size N*N, print the sum of upper and lower triangular elements. Upper Triangle consists of elements on the diagonal and above it. The lower triangle consists of elements on the diagonal and below it. 

Example 1:

Input:
N = 3 
mat[][] = {{6, 5, 4},
           {1, 2, 5}
           {7, 9, 7}}
Output: 29 32
Explanation:
The given matrix is
6 5 4
1 2 5
7 9 7
The elements of upper triangle are
6 5 4
  2 5
    7
Sum of these elements is 6+5+4+2+5+7=29
The elements of lower triangle are
6
1 2
7 9 7
Sum of these elements is 6+1+2+7+9+7= 32.


class Solution{
    static ArrayList<Integer> sumTriangles(int matrix[][], int n)
    {
        // code here
        ArrayList<Integer> al=new ArrayList<Integer>();
        int sum1=0,sum2=0;
        for(int i=0;i<n;i++)
        for(int j=i;j<n;j++)
        sum1+=matrix[i][j];
        
        for(int i=0;i<n;i++)
        for(int j=0;j<=i;j++)
        sum2+=matrix[i][j];
        
        al.add(sum1);
        al.add(sum2);
        
        return al;
    }
}
Expected Time Complexity: O(N * N)
Expected Auxiliary Space: O(1)