Given a stack with push(), pop(), empty() operations, delete the middle of the stack without using any additional data structure.
Middle: ceil(size_of_stack/2.0)
 

Example 1:

Input: 
Stack = {1, 2, 3, 4, 5}
Output:
ModifiedStack = {1, 2, 4, 5}
Explanation:
As the number of elements is 5 , 
hence the middle element will be the 3rd
element which is deleted


class Solution
{
    //Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer>s,int sizeOfStack){
        // code here
        
        ArrayDeque<Integer> temp= new ArrayDeque<>();
        int l=s.size();
        int mid=((l-1)/2);
        
        int target=mid+1;
        
       
        for(int i=target;i<l;i++)
        temp.push(s.pop());
        
        s.pop();
        
        
        for(int i=target;i<l;i++)
        s.push(temp.pop());
        
    } 
}

// Expected Time Complexity: O(N)
// Expected Auxiliary Space: O(N)

// Constraints:
// 2 <= size of stack <= 100
 

