You are given an array of integers and an integer sum. You need to find if two numbers in the array exists that have sum equal to the given sum.

Example 1:

Input:
N = 10
arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
sum = 14

Output: 
1

Explanation: 
there exists a pair which 
gives sum as 14 example 
(4,10),(5,9) etc.


class Geeks
{
    //Complete this function
    //Function to check if two numbers in array have sum equal to the given sum.
    public static int sumExists(int arr[], int N, int sum)
    {
        
        //Your code here
        //i need to search for sum-arr[i], if already exists then return true;
        Set<Integer> h=new HashSet<>();
        
        for(int x:arr)
        {
            if(h.contains(sum-x)) return 1;
            else h.add(x);
        }
        return 0;
        //by default
     }
      
    
}
//tc=O(n)
//aux space=O(n)
