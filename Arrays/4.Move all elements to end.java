Move all negative elements to end 

Given an unsorted array having both negative and positive integers. The task is place all negative element at the end of array without changing the order of positive element and negative element.


Example 1:

Input : 
A[] = {1, -1, 3, 2, -7, -5, 11, 6 }
Output : 
1  3  2  11  6  -1  -7  -5

Solution>>

class Compute {
    
    public void segregateElements(int arr[], int n)
    {
        // Your code goes here
        int[] temp = new int[n]; 
        int j=0;
    for(int i=0;i<n;i++)
    {
        if(arr[i]>=0)
        {
            temp[j]=arr[i];
            j++;
        }
    }
    for(int i=0;i<n;i++)
    {
        if(arr[i]<0)
        {
            temp[j]=arr[i];
            j++;
        }
    }
     for(int i=0;i<n;i++)
    {
        arr[i]=temp[i];
    }
}
}

//Tc-O(n)
Sc-O(n)