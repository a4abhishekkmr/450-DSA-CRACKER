Input:
       10
      /   \
     20   30
   /   \
  40   60
Output:
40 20 60 10 30 
30 10 60 20 40
Explanation:  DLL would be 
40<=>20<=>60<=>10<=>30.


class Solution
{
    Node head;
    Node back=null;
    Node bToDLL(Node root)
    {
        Node a=null;
	//  Your code here
	if(root == null) {
          return a;}
	bToDLL(root.left);
	
	if(back==null){
	    head=root;
	    back=root;
	}
	else{
	    root.left=back;
	    back.right=root;
	  back=root;  
	}
	
	bToDLL(root.right);
    
     return head;   
    }
}