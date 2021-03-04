class Solution
{
	ArrayList <Integer> printBoundary(Node node)
	{
	   // The solution will be like this
// 	it will be divided into 4 parts
// 	The root and second will be left without leaf
// 	Thirrd will be the bottom view
//  And the last one whch is right view with bottom to top leaving the node and rhe leaf.
// Input:
//           20
//         /   \
//       8     22
//      /   \    \
//     4    12    25
//         /  \ 
//       10   14 

// Output: 20 8 4 10 14 25 22
//??here, we go
	    ArrayList<Integer> b=new ArrayList<Integer>();
	    System.out.print(node.data+" ");
	    
	    //add kr
	    printleft(node.left);
	    
	    printLeaves(node.left);
	    printLeaves(node.right);
	    
	    printRight(node.right);
	    
	 return b;   
	}
	    public void printleft(Node node){
	        if(node==null) return;
	    
	        if(node.left!=null)
	        {
	            System.out.print(node.data+" ");
	            printleft(node.left);
	        }
	        else if(node.right!=null)
	        {
	            System.out.print(node.data+" ");
	            printleft(node.right);
	        }
	        
	    }
	    public void printLeaves(Node node)
	    {
	        if(node==null) return;
	        
	        printLeaves(node.left);
	        
	        if(node.left==null && node.right==null)
	        {
	            System.out.print(node.data+" ");
	        }
	        printLeaves(node.right);
	    }
	    
	    public void printRight(Node node){
	        if(node==null) return;
	    
	        if(node.right!=null)
	        {
	            printRight(node.right);
	            System.out.print(node.data+" ");
	            
	        }
	        else if(node.left!=null)
	        {
	            printRight(node.left);
	            System.out.print(node.data+" ");
	        }
	    }
}