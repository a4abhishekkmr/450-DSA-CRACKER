Duplicate subtree in Binary Tree

Input : 
               1
             /   \ 
           2       3
         /   \       \    
        4     5       2     
                     /  \    
                    4    5

Output : 1
Explanation : 
    2     
  /   \    
 4     5
is the duplicate sub-tree.

class Solution {
    int dupSub(Node root) {
        // code here 
        
         if(root == null) 
        {
            return 0 ;
        }
        ArrayList<Node> a = new ArrayList<>();
        fn(root.left,a);
        
        for(Node n:a)
        {
            Node duplicate=find(root.right, n.data);
            if(duplicate!=null)
            {
                if(n.left!=null && duplicate.left!=null && n.left.data==duplicate.left.data)
                {
                    return 1;
                }
                else if(n.right!=null && duplicate.right!=null && n.right.data==duplicate.right.data)
                {
                    return 1;
                }
            }
        }return 0;
    }
        Node find(Node root, int val){
            if(root==null) return null;
            if(root.data==val) return root;
            Node l=find(root.left,val);
            if(l!=null)
            {
                return l;
            }
            return find(root.right,val);
        }
        
        void fn(Node root,ArrayList<Node> a)
        {
            if(root==null) return;
            a.add(root);
            fn(root.left,a);
            fn(root.right,a);
        }
}  

Time-0(n)
spaace-O(n)