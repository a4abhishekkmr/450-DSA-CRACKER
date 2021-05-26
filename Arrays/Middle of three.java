Link-https://practice.geeksforgeeks.org/problems/middle-of-three2926/1#

// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String[] S = read.readLine().split(" ");
            int A=Integer.parseInt(S[0]);
            int B=Integer.parseInt(S[1]);
            int C=Integer.parseInt(S[2]);
            Solution ob = new Solution();
            System.out.println(ob.middle(A,B,C));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    int middle(int A, int B, int C){
        //code here
        int x,n;
        //the concept is
        //Sum of three -max -min =middle
        
        x=Math.max((Math.max(A,B)),C);
        n=Math.min((Math.min(A,B)),C);
        return (A+B+C)-x-n;
    }
}