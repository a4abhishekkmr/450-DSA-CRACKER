A step array is an array of integer where each element has a difference of at most k with its neighbor. Given a key x, we need to find the index value of k if multiple elements exist, return the first occurrence of the key.


Example 1:

Input : arr[ ] = {4, 5, 6, 7, 6}, K = 1 
        and X = 6
Output : 2
Explanation:
In an array arr 6 is present at index 2.
So, return 2.


class Complete{
    
   
    // Function for finding maximum and value pair
    public static int search (int arr[], int n, int x, int k) {
        //Complete the function
         for(int i=0;i<n;i++)
            if(arr[i]==x)
                return i;
        return -1;
    }
    
    
}
// Expected Time Complexity: O(N).
// Expected Auxiliary Space: O(1).