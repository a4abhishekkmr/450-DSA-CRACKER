Input :
            8
         /     \
        3      10
      /   \      \
     1     6     14
         /   \   /
        4     7 13
Output : 8 10 14 3 6 7 13 1 4

class Tree
{
     public ArrayList<Integer> diagonal(Node root)
      {
           //add your code here.
           ArrayList<Integer> b=new ArrayList<Integer>();
           Queue<Node> q=new LinkedList<Node>();
           
            if(root==null)
               return b;
               
            q.add(root);
            
            while(q.isEmpty()==false)
            {
                Node temp=q.remove();
                //8
                
                while(temp!=null){
                System.out.print(temp.data+" ");
                //8 printed
                if(temp.left!=null)
                {
                    q.add(temp.left);
                }
                temp=temp.right;
                
            }}return b;
      }
}
