class Tree{
    ArrayList<Integer> rightView(Node node) {
        // Your code here
        Queue<Node> q= new LinkedList<Node>();
// in the ^ line this Queue Node tells that we are dealing with the nodes completely >> with LInked LIst that directly pointing that it has both pointer and nod attached and passed to the queue.

        ArrayList<Integer> b=new ArrayList<Integer>();
//this is the fraud line you can see here this b is empty array list with no use.

        if(node == null) {
          return b;
        }
        q.add(node);
       // adding values in the queue. 
        while(q.isEmpty()== false) //while loop says that till queue is not empty, run and run
        {
            
            
            //FIFO and first is coming out.
            int l=q.size();
            
            for(int i=0;i<l;i++)
            {Node temp=q.poll(); 
            if(i==l-1)
            {System.out.print(temp.data+" ");}
            
            if (temp.left != null){
                q.add(temp.left);//left node with whole family of node
            }
             if (temp.right != null){
                q.add(temp.right);//right node with whole family of node
            }
        }}
        return b;
    }
}