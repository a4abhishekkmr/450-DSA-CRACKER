/* A Binary Tree node

class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */
class Tree
{
    // Return a list containing the inorder traversal of the given tree
    ArrayList<Integer> inOrder(Node root)
    {
        // Code
        ArrayList<Integer> b=new ArrayList<Integer>();
        if(root!=null){
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);}
        return b;
    }
