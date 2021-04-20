9. Hashing for pair - 1 

You are given an array of distinct integers and a sum. Check if there's a pair with the given sum in the array.

Example 1:

Input:
N = 10
arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10} 
sum = 14
Output: 
1

Explanation: 
arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10} 
and sum = 14.  There is a pair {4, 10} 
with sum 14.



class Geeks
{
    //Complete this function
    //Function to check if there is a pair with the given sum in the array.
    public static int sumExists(int arr[], int N, int sum)
    {
       //Your code here, Geeks
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