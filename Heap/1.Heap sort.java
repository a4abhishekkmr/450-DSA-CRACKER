Heap Sort 

Given an array of size N. The task is to sort the array elements by completing functions heapify() and buildHeap() which are used to implement Heap Sort.


Example 1:

Input:
N = 5
arr[] = {4,1,3,9,7}
Output:
1 3 4 7 9
Explanation: After sorting elements using heap sort, elements will be in order as 1,3,4,7,9.

Solution>> 
class Solution
{
    void buildHeap(int arr[], int n)
    {
        // Your code here
        int parent;//start point
        parent=(n/2)-1;
        
        for(int i=parent;i>=0;i--)
         heapify(arr, n, i);
    }
 
    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    void heapify(int arr[], int n, int i)
    {
        // Your code here
        int largestIndex=i;//the biggest is in the root
        int leftIndex=2*i+1;
        int rightIndex=2*i+2;
        
        //if left>root
        if(leftIndex<n && arr[leftIndex]>arr[largestIndex])
        largestIndex=leftIndex;
        
        //if right>root
        if(rightIndex<n && arr[rightIndex]>arr[largestIndex])
        largestIndex=rightIndex;
        
        //now all swapping and checking if largest one is not root and parent then
        
        if(largestIndex!=i){
            int temp=arr[i];
            arr[i]=arr[largestIndex];
            arr[largestIndex]=temp;
        
            heapify(arr,n,largestIndex);
        }
    }
    
    public void heapSort(int arr[], int n)
    {
        //code here
        buildHeap(arr,n);
        
        for(int i=n-1;i>=1;i--)
        {
            //swap
            int temp=arr[0];
            arr[0]=arr[n-1];
            arr[n-1]=temp;
            n--;
            heapify( arr, i, 0);
        }
    }
 }
 Expected Time Complexity: O(N * Log(N)).
Complexity: As we know max_heapify has complexity O(log n), build_maxheap has complexity O(n) and we run max_heapify n-1 times in heap_sort function, therefore complexity of heap_sort function is O(nlogn).
Expected Auxiliary Space: O(1).
 