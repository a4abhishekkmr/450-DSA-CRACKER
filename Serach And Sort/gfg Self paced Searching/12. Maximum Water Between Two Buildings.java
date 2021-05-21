Given an integer array representing the heights of N buildings, the task is to delete N-2 buildings such that the water that can be trapped between the remaining two building is maximum.
Note: The total water trapped between two buildings is gap between them (number of buildings removed) multiplied by height of the smaller building.

Example 1:

Input:
N = 6
height[] = {2,1,3,4,6,5}
Output: 8
Explanation: The heights are 2 1 3 4 6 5.
So we choose the following buildings
2 1 3 4 6 5  and remove others. So total
removed buildings is equal to 4, now the
height of smaller one is 2. So answer is
2 * removed buildings = 2*4 = 8. There is
no answer greater than this.


//User function Template for Java

class Solution
{
    //Function to return the maximum water that can be stored.
    static int maxWater(int height[], int n) 
    { 
        //Your code here
        int low=0,high=n-1;
        int res=0;
        while(low<high)
        {
            if(height[low]<height[high])
            {
                res=Math.max(res,(high-low-1)*height[low]);
                low++;
            }
            else if(height[high]<height[low])
            {
                res=Math.max(res,(high-low-1)*height[high]);
                high--;
            }
            else//=
            {
                res=Math.max(res,(high-low-1)*height[low]);
                //any one in equal case
                low++;high--;
            }
                
        }
        return res;
    } 

}
//Expected Time Complexity: O(N).
//Expected Auxiliary Space: O(1).
