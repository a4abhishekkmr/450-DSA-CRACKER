Given a Queue Q containing N elements. The task is to reverse the Queue. Your task is to complete the function rev(), that reverses the N elements of the queue.

Example 1:

Input:
6
4 3 1 10 2 6

Output: 
6 2 10 1 3 4

Explanation: 
After reversing the given
elements of the queue , the resultant
queue will be 6 2 10 1 3 4.


class GfG{
    //Function to reverse the queue.
    public Queue<Integer> rev(Queue<Integer> q){
        //add code here.
        //Queue<Integer> ans= new Queue<Integer>();
        Stack<Integer> s= new Stack<Integer>();
        while(q.isEmpty()==false)
        {
            s.push(q.remove());
        }
        while(s.isEmpty()==false)
        {
            q.add(s.pop());
        }
        return q;
    }
}
// Time comp:-O(n)
// and Aux space:-O(n)