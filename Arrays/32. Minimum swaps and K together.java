Given an array of n positive integers and a number k. Find the minimum number of swaps required to bring all the numbers less than or equal to k together.

Example 1:

â€‹Input : arr[ ] = {2, 1, 5, 6, 3} and K = 3
Output : 1
Explanation:
To bring elements 2, 1, 3 together, swap element '5' with '3'
such that final array will be- arr[] = {2, 1, 3, 6, 5}



class Complete{
    
   
    // Function for finding maximum and value pair
    public static int minSwap (int arr[], int n, int k) {
        //Complete the function
        //now to solve this first i will count the number of elements less than k.
        //so 
        int counter=0;
        for(int i=0;i<n;i++)
        if(arr[i]<=k)
        counter++;
        
        //now make a window of size counter
        
        int count=0;
        int min=0;
        int size=counter;
        for(int i=0;i<size;i++)
        if(arr[i]>k)
        count++;
        min=count;
        //two pointer approach which moves like sliding window go with the example and 
        //iterate it with.
        for(int i=0,j=size;j<n;i++,j++)
        {
            if(arr[i]>k) count--;
            if(arr[j]>k) count++;
            min=Math.min(min,count);
        }
        return min;
    }
    //Time comp:-O(n)
    //space is O(1)
}