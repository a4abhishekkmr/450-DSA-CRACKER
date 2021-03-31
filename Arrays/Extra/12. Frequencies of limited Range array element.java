12. Frequencies of Limited Range Array Elements 

Given an array A[] of n positive integers which can contain integers from 1 to P where elements can be repeated or can be absent from the array. Your task is to count the frequency of all elements from 1 to n.


Example 1:

Input:
n = 5
A[ ] = {2,3,2,3,5}
Output:
0 2 2 0 1
Explanation: 
Counting frequencies of each array element
We have:
1 occurring 0 times.
2 occurring 2 times.
3 occurring 2 times.
4 occurring 0 times.
5 occurring 1 time.

TC-O(n)
Auxiliary space-O(1)

class Solution{
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencycount(int arr[], int n)
    {
        // code here
        for (int i=0; i < n; i++) arr[i]=arr[i]-1;
        
         for (int i=0; i < n; i++)
           arr[arr[i]%n] = arr[arr[i]%n] + n;
           
        for (int i=0; i < n; i++) arr[i]=arr[i]/n;
    }
}

// 1)  Subtract 1 from every element so that the elements
//     become in range from 0 to n-1.

// 2)  Use every element arr[i] as index and add 'n' to
//     element present at arr[i]%n to keep track of count of
//     occurrences of arr[i]
//     for (int i=0; i < n; i++)
//         arr[arr[i]%n] = arr[arr[i]%n] + n;

// 3)  To print counts, simply print the number of times n
//     was added at index corresponding to every element.