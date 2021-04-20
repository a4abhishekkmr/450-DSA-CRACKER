4. Count Non-Repeated Elements 

Hashing is very useful to keep track of the frequency of the elements in a list.

You are given an array of integers. You need to print the count of non-repeated elements in the array.

Example 1:

Input:
10
1 1 2 2 3 3 4 5 6 7

Output: 
4




class Solution
{
    // arr[]: input array
    // n: size of array
    
    //Function to return the count of non-repeated elements in the array.
    static long countNonRepeated(int arr[], int n)
    {
        // add your code
        // add your code here
        
        HashMap<Integer,Integer> h= new HashMap<>();
        for(int x:arr)
        h.put(x,h.getOrDefault(x,0)+1);
        long count=0;
        for(int i=0;i<n;i++)
        {
            if(h.get(arr[i])==1)
            count++;
        }
        
        return count;
    }
}
//tc=O(n)
//aux space=O(n)