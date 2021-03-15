class Tree{
    public int toSumTree(Node root){
         //add code here.
          if(root==null)
              {return 0;}
        int l=0,r=0;
        
             
             if(root.left!=null)
             {
                 l=root.left.data;
                 toSumTree(root.left);
                 l=l+root.left.data;
             }
             if(root.right!=null)
             {
                 r=root.right.data;
                 toSumTree(root.right);
                 r=r+root.right.data;
             }
             root.data=l+r;
         
   return root.data; }}