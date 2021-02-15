

 // Your code here
        Queue<Node> q= new LinkedList<Node>();
// in the ^ line this Queue Node tells that we are dealing with the nodes completely >> with LInked LIst that directly pointing that it has both pointer and nod attached and passed to the queue.

        ArrayList<Integer> b=new ArrayList<Integer>();
//this is the fraud line you can see here this b is empty array list with no use.

        if(root == null) {
          return null;
        }
        q.add(root);
       // adding values in the queue. 
        while(q.isEmpty()== false) //while loop says that till queue is not empty, run and run
        {
            
            
            //FIFO and first is coming out.
            int l=q.size();
            
            for(int i=0;i<l;i++)
            {Node node=q.poll(); 
            if(i==0)
            {System.out.print(node.data+" ");}
            
            if (node.left != null){
                q.add(node.left);//left node with whole family of node
            }
             if (node.right != null){
                q.add(node.right);//right node with whole family of node
            }
        }}
        return b;
    }
}
