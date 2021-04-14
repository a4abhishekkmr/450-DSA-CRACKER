Given an array A[] of size N, construct a Product Array P (of same size N) such that P[i] is equal to the product of all the elements of A except A[i].

 

Example 1:

Input:
N = 5
A[] = {10, 3, 5, 6, 2}
Output:
180 600 360 300 900
Explanation: 
For i=0, P[i] = 3*5*6*2 = 180.
For i=1, P[i] = 10*5*6*2 = 600.
For i=2, P[i] = 10*3*6*2 = 360.
For i=3, P[i] = 10*3*5*2 = 300.
For i=4, P[i] = 10*3*5*6 = 900.
Example 2:

Input:
N = 2
A[] = {12,0}
Output:
0 12


class Solution 
{ 
	public static long[] productExceptSelf(int a[], int n) 
	{ 
        // code here
        long ans[]=new long[(int)n];
        long total_product=1;
        long product0=1;
        
        //calculating all product without zero in it. it should be psoitive if any non zero element present
        for(int i=0;i<n;i++)
            if(a[(int)i]!=0)
            total_product*=a[(int)i];
            
            //calculating all product having zero in it.
        for(int i=0;i<n;i++)
            product0*=a[(int)i];
           
           //counting number of zero in array it is 1 then answer will be non zero in place of 0 else
           //all element is 0
           //and if number of 0 is greater than 1 then all the answer is 0;
           
           int count=0;//for zero in array 
         for(int i=0;i<n;i++)
         if(a[i]==0)
         count++;
         
        for(int i=0;i<n;i++)
        {if(a[(int)i]==0&& count==1)//handling the zeroes in array==1
            ans[(int)i]=total_product;
            
        else if(a[(int)i]==0&& count>1)//handling the zeroes in array greater then 1
            ans[(int)i]=0;
        
        else
            ans[(int)i]=product0/a[(int)i];//this is normal answer finding technique of non zero elements
        }
        return ans;
	} 
} 
//Time O(n) and O(n) aux space