class Tree
{
    
    
     /* This function should return tree if passed  tree 
     is balanced, else false. */
    boolean isBalanced(Node root)
    {
	// Your code here
	 if(root==null)
         return true;
         
     int l=height(root.left);
     int r=height(root.right);
     
     int diff=(Math.abs(l-r));
     
     if(diff<=1 && isBalanced(root.left) && isBalanced(root.right))
     {
         return true;
     }
     else
     {
         return false;
     }
    }
    
    int height(Node root)
    {
         if(root==null)
             return 0;
         
         else
         {
            return 1+Math.max(height(root.left),height(root.right)) ;  
         }
    }
}

