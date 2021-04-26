7. Implement two stacks in an array 
Easy Accuracy: 49.76% Submissions: 43230 Points: 2
Your task is to implement  2 stacks in one array efficiently.

 

Example 1:

Input:
push1(2)
push1(3)
push2(4)
pop1()
pop2()
pop2()

Output:
3 4 -1

Explanation:
push1(2) the stack1 will be {2}
push1(3) the stack1 will be {2,3}
push2(4) the stack2 will be {4}
pop1()   the poped element will be 3 
from stack1 and stack1 will be {2}
pop2()   the poped element will be 4 
from stack2 and now stack2 is empty
pop2()   the stack2 is now empty hence -1 .




/* Structure of the class is
class TwoStack
{

	int size;
	int top1,top2;
	int arr[] = new int[100];

	TwoStack()
	{
		size = 100;
		top1 = -1;
		top2 = size;
	}
}*/

class Stacks
{
    //Function to push an integer into the stack1.
    void push1(int x, TwoStack sq)
    {
        if(sq.top1<sq.top2-1)
        {
            sq.top1++;
            sq.arr[sq.top1]=x;
        }
    }

    //Function to push an integer into the stack2.
    void push2(int x, TwoStack sq)
    {
        if(sq.top1<sq.top2-1)
        {
            sq.top2--;
            sq.arr[sq.top2]=x;
        }
    }

    //Function to remove an element from top of the stack1.
    int pop1(TwoStack sq)
    {
        if(sq.top1>=0)
        {
            int x=sq.arr[sq.top1];
            sq.top1--;
            return x;
        }
        else
        return -1;
    }

    //Function to remove an element from top of the stack2.
    int pop2(TwoStack sq)
    {
        if(sq.top2<sq.size)
        {
            int x=sq.arr[sq.top2];
            sq.top2++;
            return x;
        }
        else
        return -1;
    }
}
// Expected Time Complexity: O(1) for all the four methods.
// Expected Auxiliary Space: O(1) for all the four methods.
