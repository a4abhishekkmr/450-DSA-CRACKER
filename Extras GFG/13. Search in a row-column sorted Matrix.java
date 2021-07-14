Given a matrix of size n x m, where every row and column is sorted in increasing order, and a number x. Find whether element x is present in the matrix or not.

Example 1:

Input:
n = 3, m = 3, x = 62
matrix[][] = {{ 3, 30, 38},
              {36, 43, 60},
              {40, 51, 69}}
Output: 0
Explanation:
62 is not present in the matrix, 
so output is 0.



class Solution 
{ 
    //Function to search a given number in row-column sorted matrix.
	static boolean search(int mat[][], int n, int m, int x) 
	{  
	    // code here
	    int i=0,j=m-1;
	    while(i<n && j>=0)
	    {
	    if(mat[i][j]==x)
	    return true;
	    
	    else if(mat[i][j]>x)//bada whi hai peeche jao
	    j--;
	    else
	    i++;//down
	    }
	    return false;
	} 
} 
