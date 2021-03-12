0 - 1 Knapsack Problem

Example 1:

Input:
N = 3
W = 4
values[] = {1,2,3}
weight[] = {4,5,1}
Output: 3


Solution>>
// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])throws IOException
    {
        //reading input using BufferedReader class
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        //reading total testcases
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            //reading number of elements and weight
            int n = Integer.parseInt(read.readLine());
            int w = Integer.parseInt(read.readLine());
            
            int val[] = new int[n];
            int wt[] = new int[n];
            
            String st[] = read.readLine().trim().split("\\s+");
            
            //inserting the values
            for(int i = 0; i < n; i++)
              val[i] = Integer.parseInt(st[i]);
             
            String s[] = read.readLine().trim().split("\\s+"); 
            
            //inserting the weigths
            for(int i = 0; i < n; i++)
              wt[i] = Integer.parseInt(s[i]);
              
            //calling method knapSack() of class Knapsack
            System.out.println(new Knapsack().knapSack(w, wt, val, n));
        }
    }
}



// } Driver Code Ends


class Knapsack 
{ 
    // Returns the maximum value that can be put in a knapsack of capacity W 
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
         // your code here 
          // Returns the maximum value that can be put in a knapsack of capacity W 
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
         // your code here 
         int dp [][] =  new int [n+1][W+1];
         for( int i =0 ; i<n+1 ; i++)
          for( int j=0 ; j<W+1 ; j++)
          dp[i][j] = -1;
          
          return knapSac(W, wt, val, n, dp);
         
    } 
    
    static int knapSac(int W, int wt[], int val[], int n, int dp[][])
    {
        //BC -  i dont have any wt or capacity
         if(n == 0 || W==0 )
        return 0; 
        
    // rec BC
    if(dp[n][W] != -1)
    return dp[n][W];
    
    // since want the max value and since value in sorted order=  > start from last wt
    // and if the last wt is greaater than the W(knapsack) given, then rec call with sencond last n ie tot decrement value of n by 1. 
     if(wt[n-1]  > W)
     {
         return dp[n][W] = knapSac( W,  wt,  val,  n-1 , dp);
     }
     else // ki hmlog jo W paas kiye wo GIVEN W se kam h, to combiniationas banao , aur max return karao in case kam aa gya pehle se to.
     return dp[n][W] = Math.max( (val[n-1]) + knapSac(W - wt[n-1], wt , val , n-1 , dp) , 
                            knapSac( W,  wt,  val,  n-1 , dp) ) ;
    }
}
}


Expected Time Complexity: O(N*W).
Expected Auxiliary Space: O(N*W)
