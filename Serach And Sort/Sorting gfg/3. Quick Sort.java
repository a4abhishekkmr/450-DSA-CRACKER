Quick Sort is a Divide and Conquer algorithm. It picks an element as pivot and partitions the given array around the picked pivot.
Given an array arr[], its starting position low and its ending position high.

Implement the partition() and quickSort() functions to sort the array.


Example 1:

Input: 
N = 5 
arr[] = { 4, 1, 3, 9, 7}
Output:
1 3 4 7 9

Example 2:

Input: 
N = 9
arr[] = { 2, 1, 6, 10, 4, 1, 3, 9, 7}
Output:
1 1 2 3 4 6 7 9 10
  
  
  //partition done using hoare partition
  
class Solution
{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
        // code here
        if(low<high)
        {
            int p=partition(arr,low,high);
            quickSort(arr,low,p);
            quickSort(arr,p+1,high);
        }
    }
    static int partition(int arr[], int low, int high)
    {
        // your code here
        int pivot=arr[low];
        int j=high+1,i=low-1;
        
        while(true){
        do{i++;}
            while(arr[i]<pivot);
        
        do{j--;}
            while(arr[j]>pivot);
        
        if(i>=j) return j;
        // swap(arr[i],arr[j]);
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        }//end of while true
    } 
}
