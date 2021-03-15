Construct Tree from Inorder & Preorder 
Input:
N = 6
inorder[] = {3 1 4 0 5 2}
preorder[] = {0 1 3 4 2 5}
Output: 3 4 1 5 2 0
Explanation: The tree will look like
       0
    /     \
   1       2
 /   \    /
3    4   5


class Solution
{
    int preindex;
    
    public Node buildTree(int inorder[], int preorder[], int n)
    {
        // code here 
        return fn(inorder, preorder, 0, n-1);
        
    }
    
    public Node fn(int inorder[], int preorder[], int start, int end)
    {
        if (start>end)
        {
            return null;
        }
        
        Node node = new Node(preorder[preindex++]);
        
        if(start==end){
            return node;
        }
        
        int inIndex=getInindex(node.data,inorder,start,end);
        
        node.left=fn(inorder, preorder, start, inIndex-1);
        
        node.right=fn(inorder, preorder, inIndex+1, end);//seee this
            
            return node;
        }

        
        
        public int getInindex(int val, int al[], int start,int end){
            for(int i=start;i<=end;i++){
                if(al[i] == val){
                    return i;
                }
            }
            return -1;
        }
        
    }


Expected Time Complexity: O(N*N). 
Expected Auxiliary Space: O(N).
and it is. 