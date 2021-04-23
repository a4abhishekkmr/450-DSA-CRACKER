2. Operations on Queue 

Given a queue of integers and Q queries. The task is to perform operations on queue according to the query. 

Queries are as:

i x : (adds element x in the queue from rear).

r : (Removes the front element of queue).

h : (Returns the front element).

f y : (check if the element y is present or not in the queue). Return "Yes" if present, else "No".

Example 1:

Input:
Q = 6
Queries = i 2 i 4 i 3 i 5 h f 8
Output:
2
No
Explanation: Inserting 2, 4, 3, and 5
onto the queue: 2 4 3 5. h means front
So front is 2. f is find. 8 is not in
queue so No.



class Solution {
    
    //Function to push an element in queue.
    void enqueue(Queue<Integer> q, int x){
        // Code here
        //if(q.isFull())
        //return;
        //else
        q.add(x);
        
    }
    
    //Function to remove front element from queue.
    void dequeue(Queue<Integer> q){
        // code here
        //if(q.isEmpty()) return;
       // else
        q.remove();
    }
    
    //Function to find the front element of queue.
    int front(Queue<Integer> q){
        // Code here
        //if(q.isEmpty()) return -1;
        //else
        return q.peek();
    }
    
    //Function to find an element in the queue.
    String find(Queue<Integer> q, int x){
        // Code here
        if(q.contains(x))
        return "Yes";
        
        return "No";
    }
}
//Expected Time Complexity: O(1) for enqueue(), dequeue() and front(); O(N) for find().
//Expected Auxiliary Space: O(1) for all the 4 functions. 
