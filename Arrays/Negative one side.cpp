Move all negative numbers to beginning and positive to end with constant extra space
=====================================================================================
Linkof question-https://www.geeksforgeeks.org/move-negative-numbers-beginning-positive-end-constant-extra-space/
you have to practice in -https://ide.geeksforgeeks.org/


Method 1 to rearrange positive and negative numbers in an array


In this approach, the order of appearance of the elements of the array is not maintained. Start traversing the array and if a negative element is encountered, swap the negative element and first positive element and continue until all the elements have been traversed.



Algorithm



Declare an array and input the array elements.
Start traversing the array and if the current element is negative,swap the current element with the first positive element and continue traversing until all the elements have been encountered.
Print the rearranged array.


Test case:



Input: 1 -1 2 2 3 -3
Output: -1 -2 -3 1 3 2


Method 2 to rearrange positive and negative numbers in an array


In this approach, the order of appearance of the elements of the array is maintained. Start traversing the array and if a positive element is encountered, continue traversing. If a negative element is encountered, shift all the positive numbers to the right by one position and insert the negative number in the sequence array[0 to n-1].



Algorithm



Declare an array and input the array elements.
Start traversing the array and if the current element is positive, traverse to the next element in the array.
If the current element is negative, right shift the positive elements by one position and insert the negative number in the sequence array[0 to n-1].
Print the rearranged array.


Test case:



Input: 1 -1 2 -2 3 -3
Output: -1 -2 -3 1 2 3

This is method 2:-
we are needed here method 2
#include <iostream>
using namespace std;

	int main() {
	//code
	int n;
	cin>>n;
	int arr[n];
	for(int i=0;i<n;i++)
	{
	    cin>>arr[i];
	}
	int temp,j;
	for(int i=1;i<n;i++)
    {
        temp=arr[i];
        if(temp>0)
        continue;
        j=i-1;
        while(arr[j]>0 && j>=0)
        {
            arr[j+1]=arr[j];
            j--;
            arr[j+1]=temp;
        }
    }
	for(int i=0;i<n;i++)
	{cout<<arr[i]<<" ";
	}

	return 0;
}


Test case-
4
-2 4 5 -6

output-
-2 -6 4 5
