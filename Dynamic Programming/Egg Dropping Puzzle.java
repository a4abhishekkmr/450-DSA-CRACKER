Egg Dropping Puzzle

Suppose you have N eggs and you want to determine from which floor in a K-floor building you can drop an egg such that it doesn't break. You have to determine the minimum number of attempts you need in order find the critical floor in the worst case while using the best strategy.There are few rules given below. 

An egg that survives a fall can be used again.
A broken egg must be discarded.
The effect of a fall is the same for all eggs.
If the egg doesn't break at a certain floor, it will not break at any floor below.
If the eggs breaks at a certain floor, it will break at any floor above.


Example 1:

Input:
N = 2, K = 10
Output: 4
Example 2:

Input:
N = 3, K = 5
Output: 3


Complexity Analysis:

Time Complexity: O(n*k^2).
Where ‘n’ is the number of eggs and ‘k’ is the number of floors, as we use a nested for loop ‘k^2’ times for each egg
Auxiliary Space: O(n*k).
As a 2-D array of size ‘n*k’ is used for storing elements.



Solution>>

class EggDrop 
{
    static int eggDrop(int n, int k) 
	{
	    // Your code here
	    
	    //n eggs hai and k floors;
	    
	    int dp[][]=new int[n+1][k+1];
	    int res=0;
	    
	    //now its time for base conditions for fllor 0 and 1 return no of floor. for atlest 1 egg
	    //if 0 egg you will always have 0 possiblity
	    int i,j,x;
	    for(i=1;i<=n;i++){
	        dp[i][1]=1;
	        dp[i][0]=0;}
	        //firsy one is egg and second one is floor 
	        //so here irrespective off egg returns floor
	        
	        // We always need j trials for one egg 
        // and j floors. 
        for (j = 1; j <= k; j++) {
            dp[1][j] = j; 
	    }
	    
	    //filling rest of the body using dynamic problem
	    
	    for( i=2;i<=n;i++){
	        for( j=2;j<=k;j++){
	            dp[i][j]=Integer.MAX_VALUE;
	            for( x=1;x<=j;x++){
	                res=1+ Math.max(dp[i-1][x-1],dp[i][j-x]);
	                
	                if(res<dp[i][j])
	                    dp[i][j]=res;
	            }
	        }
	    }
	    return dp[n][k];
	}
}