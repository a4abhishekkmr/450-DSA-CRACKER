class Tree
{
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        // code here
        Stack<Integer> s= new Stack<>();
        ArrayList<Integer> b=new ArrayList<Integer>();
        Queue<Node> q= new LinkedList<Node>();
        q.add(node);
        
        while(q.isEmpty()== false) 
        {
            Node temp=q.remove();
            s.add(temp.data);
            
            if(temp.right!= null)
                q.add(temp.right);
                
                if(temp.left!= null)
                q.add(temp.left);
            }
            while(s.isEmpty()==false)   // if we directly pop Stack then it will be failed when null is there
            {
                int o=s.pop();
                System.out.print(o+" ");
            }
            
        return b;
    }
}      