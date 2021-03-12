Predecessor and Successor

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case contains n denoting the number of edges of the BST. The next line contains the edges of the BST. The last line contains the key.

Output:
Print the predecessor followed by successor for the given key. If the predecessor or successor is not found print -1.

Constraints:
1<=T<=100
1<=n<=100
1<=data of node<=100
1<=key<=100

Example:
Input:
2
6
50 30 L 30 20 L 30 40 R 50 70 R 70 60 L 70 80 R
65
6
50 30 L 30 20 L 30 40 R 50 70 R 70 60 L 70 80 R
100

Output:
60 70
80 -1

Solution-

/* BST Node
class Node
{
	int key;
	Node left, right;
	
	Node(int item)
	{
	    data = item;
	    left = right = null;
	}
}
*/

// This function finds predecessor and successor of key in BST.
// It sets pre and suc as predecessor and successor respectively
class GfG
{
    public static void findPreSuc(Node root, Res p, Res s, int key)
    {
       // add your code here
       if(root==null)
            return;
            //1 ober
            //now 2
        if(root.data==key)
        {
            if(root.left!=null)
            {
                Node temp=root.left;
                while(temp.right!=null)
                temp=temp.right;
                
                p.pre=temp;
            }
             if(root.right!=null)
            {
                Node temp=root.right;
                while(temp.left!=null)
                temp=temp.left;
                
                s.succ=temp;
            }
            return;
        }
        
        //3rd case
        if(key<root.data)
        {
            s.succ=root;
            findPreSuc(root.left, p, s, key);
        }
        else
        {
            p.pre=root;
            findPreSuc(root.right, p, s, key);
        }
    }
    
}