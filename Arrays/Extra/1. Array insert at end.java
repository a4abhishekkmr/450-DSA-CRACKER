1. Array insert at end 

Insertion is a basic but frequently used operation. Arrays in most languages can not be dynamically shrinked or expanded. Here, we will work with such arrays and try to insert an element at the end of the array.

You are given an array arr. The size of the array is given by sizeOfArray. You need to insert an element at the end.

Example 1:

Input:
sizeOfArray = 6
arr[] = {1, 2, 3, 4, 5}
element = 90
Output: 1 2 3 4 5 90
Explanation: After inserting 90 at the
end, we have array elements as 
1 2 3 4 5 90.

class Insert
{
    // You only need to insert the given element at 
    // the end, i.e., at index sizeOfArray - 1. You may 
    // assume that the array already has sizeOfArray - 1
    // elements. 
    public void insertAtEnd(int arr[],int sizeOfArray,int element)
    {
        //Your code here
        arr[sizeOfArray-1]=element;
    }
}

TC=O(1)