Suppose there is a circle. There are N petrol pumps on that circle. You will be given two sets of data.
1. The amount of petrol that every petrol pump has.
2. Distance from that petrol pump to the next petrol pump.
Find a starting point where the truck can start to get through the complete circle without exhausting its petrol in between.
Note :  Assume for 1 litre petrol, the truck can go 1 unit of distance.

Example 1:

Input:
N = 4
Petrol = 4 6 7 4
Distance = 6 5 3 5
Output: 1
Explanation: There are 4 petrol pumps with
amount of petrol and distance to next
petrol pump value pairs as {4, 6}, {6, 5},
{7, 3} and {4, 5}. The first point from
where truck can make a circular tour is
2nd petrol pump. Output in this case is 1
(index of 2nd petrol pump).


class Solution
{
    //Function to find starting point where the truck can start to get through
    //the complete circle without exhausting its petrol in between.
    int tour(int petrol[], int distance[])
    {
	// Your code here	
	int n=petrol.length;
	//i am going through the better and efficient algo that takes O(N) time and O(1) aux space
	int start=0,current_petrol=0,prev_petrol=0;
	for(int i=0;i<n;i++)
	{
	    current_petrol+=(petrol[i]-distance[i]);
	    if(current_petrol<0)
	    {
	        start=i+1;
	        prev_petrol+=current_petrol;
	        current_petrol=0;
	    }
	}
	return ((current_petrol+prev_petrol)>0)?(start):-1;
    }//here i had given start instead of start+1 according to question demand.
}// Output in this case is 1 (index of 2nd petrol pump).
//time comp is O(n) only one traversal and Aux space is O(1)