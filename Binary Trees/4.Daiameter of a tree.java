// User function Template for Java

class Tree {

    int height(Node root){
        if(root==null) return 0;

        else{
            return Math.max(height(root.left),height(root.right))+1;
        }
    }
    /* Complete the function to get diameter of a binary tree */
    int diameter(Node root) {
        // Your code here
        if(root == null) return 0;
        else{
        int li=height(root.left);
        int ri=height(root.right);
        int h= li+ri+1;

        int lh=diameter(root.left);
        int rh=diameter(root.right);



        // int res=lh+rh+1;

        return Math.max(h,Math.max(lh,rh));
    }
}}
