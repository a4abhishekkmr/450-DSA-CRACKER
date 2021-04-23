Given an integer K and a queue of integers, we need to reverse the order of the first K elements of the queue, leaving the other elements in the same relative order.

Only following standard operations are allowed on queue.

enqueue(x) : Add an item x to rear of queue
dequeue() : Remove an item from front of queue
size() : Returns number of elements in queue.
front() : Finds front item.
Example 1:

Input:
5 3
1 2 3 4 5

Output: 
3 2 1 4 5

Explanation: 
After reversing the given
input from the 3rd position the resultant
output will be 3 2 1 4 5.





class GfG
{
    //Function to reverse first k elements of a queue.
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k)
    {
      //add code here.
      int size=q.size();
      Stack<Integer> s=new Stack<Integer>();
      Queue<Integer> q1=new LinkedList<Integer>();
      for(int i=0;i<k;i++)
      {
          s.push(q.remove());
      }
      for(int i=k;i<size;i++)
      {
          q1.add(q.remove());
      }
      while(!s.isEmpty())
      {
          q.add(s.pop());
      }
      while(!q1.isEmpty())
      {
          q.add(q1.remove());
      }
      
      return q;
    }
}
//TIme comp=O(n)
//Aux space=O(k+k+(size-k))


