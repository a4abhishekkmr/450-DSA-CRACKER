Matrix Chain Multiplication
Given a sequence of matrices, find the most efficient way to multiply these matrices together. The efficient way is the one that involves the least number of multiplications. The dimensions of the matrices are given in an array arr[] of size N (such that N = number of matrices + 1) where the ith matrix has the dimensions (arr[i-1] x arr[i]).

Example 1:
https://www.geeksforgeeks.org/matrix-chain-multiplication-dp-8/
Input: N = 5
arr = {40, 20, 30, 10, 30}
Output: 26000
Explaination: There are 4 matrices of dimension 
40x20, 20x30, 30x10, 10x30. Say the matrices are 
named as A, B, C, D. The efficient way is 
(A*(B*C))*D. The number of operations are 20*30*10 
+ 40*20*10 + 40*10*30 = 26000.



Solution >>
// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.matrixMultiplication(N, arr));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int matrixMultiplication(int n, int arr[])
    {
        // code here
         int m[][] = new int[n][n];
         int i,j,k,L,q;
        for(i=1;i<n;i++)
        {
            m[i][i]=0;
        }
        
        for(L=2;L<n;L++)
        {
            for(i=1;i<n-L+1;i++)
            {
                j=i+L-1;
                if(j==n)
                continue;
                m[i][j]=Integer.MAX_VALUE;
                for(k=i;k<=j-1;k++)
                {
                    q=m[i][k]+m[k+1][j]+arr[i-1]*arr[k]*arr[j];
                    if (q < m[i][j])
                        m[i][j] = q;
                }
                
            }
        }
        return m[1][n - 1];
    }
}