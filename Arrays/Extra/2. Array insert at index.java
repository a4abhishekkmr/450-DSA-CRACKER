2. Array insert at index 

Insertion is a basic but frequently used operation. Arrays in most languages cannnot be dynamically shrinked or expanded. Here, we will work with such arrays and try to insert an element at some index.

You are given an array arr(0-based index). The size of the array is given by sizeOfArray. You need to insert an element at given index and print the modified array.

Example 1:
Input:
sizeOfArray = 6
arr[] = {1, 2, 3, 4, 5}
index = 2, element = 90
Output: 1 2 90 3 4 5
Explanation: 90 is inserted at index 
2(0-based indexing). After inserting,
array elements are like 
1, 2, 90, 3, 4, 5.

Solution>>
class Solution
{
    // You need to insert the given element at the given index. 
    // After inserting the elements at index, elements
    // from index onward should be shifted one position ahead
    // You may assume that the array already has sizeOfArray - 1
    // elements.
    public void insertAtIndex(int arr[],int n,int index,int element)
    {
        //Your code here, Geeks
        //shift after index
        for(int i=n-2;i>=index;i--)
        {
            arr[i+1]=arr[i];
        }
        arr[index]=element;
    }//put


}

time complexity=O(n)