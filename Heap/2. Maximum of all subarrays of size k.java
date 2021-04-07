Maximum of all subarrays of size k 

Given an array arr[] of size N and an integer K. Find the maximum for each and every contiguous subarray of size K.

Example 1:

Input:
N = 9, K = 3
arr[] = 1 2 3 1 4 5 2 3 6
Output: 
3 3 4 5 5 5 6 
Explanation: 
1st contiguous subarray = {1 2 3} Max = 3
2nd contiguous subarray = {2 3 1} Max = 3
3rd contiguous subarray = {3 1 4} Max = 4
4th contiguous subarray = {1 4 5} Max = 5
5th contiguous subarray = {4 5 2} Max = 5
6th contiguous subarray = {5 2 3} Max = 5
7th contiguous subarray = {2 3 6} Max = 6




class Solution{
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        // Your code here
//         ArrayList<Integer> al=new ArrayList<Integer>();
//         int max=0;
//         for(int i=0;i+k<=n;i++)
//         {
//             max=arr[i];
//             for(int j=1;j<k;j++){
//             if(arr[i+j]>max)
//             max=arr[i+j];
//         }
//         al.add(max);
// }
//         return al;
//     }
// }
// TC=O(n*k)
// ASC=O(n-k);

ArrayList<Integer> al=new ArrayList<Integer>();
PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
//created a priority queue that contains elements of size k of descending order
for(int i=0;i<k;i++)
q.add(arr[i]);

//added elements of size k in q in descending
//we created a max heap
//if we remove the first element it will be max
al.add(q.peek());
//remove the element which is out of window if we move window further.
q.remove(arr[0]);

//now needed to move the window so we will start adding element from k as upto k added and remove one
for(int i=k;i<n;i++)
{
    q.add(arr[i]);
    al.add(q.peek());
    q.remove(arr[i-k+1]);
}
return al;
}
}
// time complexity=O(n)
// space complexity=O(k)