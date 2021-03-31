Leaders in an array 

Given an array A of positive integers. Your task is to find the leaders in the array. An element of array is leader if it is greater than or equal to all the elements to its right side. The rightmost element is always a leader. 

 

Example 1:

Input:
n = 6
A[] = {16,17,4,3,5,2}
Output: 17 5 2
Explanation: The first leader is 17 as it is greater than all the elements to its right.  Similarly, the next leader is 5. The right most element is always a leader so it is also included.



class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> al=new ArrayList<Integer>(n);
        
        //by reverse
        int current=arr[n-1];
        al.add(current);
        //starting from second last to 1
        for(int i=n-2;i>=0;i--)
        {
            if(current<=arr[i])
            {
                current=arr[i];
                al.add(current);
            }
        }
        Collections.reverse(al);
        return al;
    }
}

Expected Time Complexity for operation: O(n)
Expected Auxiliary Space: O(n)

