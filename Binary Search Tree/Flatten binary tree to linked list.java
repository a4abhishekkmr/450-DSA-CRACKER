Flatten binary tree to linked list

Input :
        1
       / \
      3   4
         /
        2
         \
          5 
Output : 
1 3 4 2 5  
Explanation : 
After flattening, the tree looks 
like this 
     1
      \
       3
        \
         4
          \
           2
            \ 
             5 
Here, left of each node points 
to NULL and right contains the 
next node in preorder.The inorder 
traversal of this flattened tree 
is 1 3 4 2 5.


//code here
        if(node == null){
          return;}
        if( (node.left==null && node.right==null))
          return;
        //to to the left most till grand child become null
        //now set this point as ptr
        //Node ptr=null;  //empty
        while(node.left!=null)
        {
            flatten(node.left);
            //root=root.left;
            //Node ptr=root;
            Node temp=node.right;//all right nodes in the temp node
            node.right=node.left;//now shofting the left element to the right
            node.left=null;//making left over which makes null to it
            
            Node curr= node.right;
            //now we have to add the actual right to the left values at the right.
            while(curr.right!=null)
            {
                curr=curr.right;}
                
                curr.right=temp;
        }

        flatten(node.right);
    }
}



// Aproach 2



      if(root==null)
        {
            return;
        }
        while(root!=null){
            Node temp=root.right;
            if(root.left!=null)
            {
                root.right=root.left;
                root.left=null;
                Node t=root.right;
                
                while(t.right!=null)
                {
                    t=t.right;
                }
                t.right=temp;
            }
            root=root.right;
        }
            
        }
}

Finally Runned in Cpp
due to some bugs in the problem with the compiler of java
so same approach 1 in cpp
SOlution is here
>>
class Solution
{
    public:
    void flatten(Node *root)
    {
        //code here
         if (root == NULL || root->left == NULL &&
                        root->right == NULL) {
        return;
    }
    //if root  ka left exists ten make it root ka right and add
    if (root->left != NULL) {
 
        // move left recursively
        flatten(root->left);
    
        // store the node root->right
        struct Node* tmpRight = root->right;
        root->right = root->left;
        root->left = NULL;
 
        // find the position to insert
        // the stored value   
        struct Node* t = root->right;
        while (t->right != NULL) {
            t = t->right;
        }
           // insert the stored value
        t->right = tmpRight;
    }
 
    // now call the same function
    // for root->right
    flatten(root->right);
}

};