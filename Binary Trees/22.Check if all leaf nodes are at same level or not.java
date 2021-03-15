Input:
            10
          /    \
        20      30
       /  \        
     10    15

Output: 0

Explanation:
Leaves 10, 15 and 30 are not at same level.



class GfG
{
    int levelofleaf;
    boolean check(Node root)
    {
	// Your code here
	 if(root == null) {
          return true;}
          
          else
          return fn(root,1);
}

boolean fn(Node node, int level)
{
    if(node==null) return true;

    if(node.left==null && node.right==null)
    {
        if (levelofleaf==0)
        {
            levelofleaf=level;
            return true;
        }
        
        if(levelofleaf==level)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
        return fn(node.left, level+1) && fn(node.right, level+1);
    }
    
}
