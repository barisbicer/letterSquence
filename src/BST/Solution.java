package BST;



class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }

public class Solution {
   
	static int k=2;
	static int result=0;
	public static int kthSmallest(TreeNode root, int k) {
        
		 kthSmallestRec(root);
         return 0;   
            
        }
        
    private static void kthSmallestRec(TreeNode root) {
		  
    	  if(root==null)
    		  return;
    	  
    	   kthSmallestRec(root.left);
    	   if(--k==0)
    		   result=root.val;
    	   kthSmallestRec(root.right);
    	 
    	
    	
       	
	}
    
    private static void test(int root) {
		  
  	 System.out.println(root);
  	 
  	 //while(root-->2) {
  		 while(--root>2) {
  		 System.out.println(root);
  		 
  	 }
  		 
     System.out.println(Math.hypot(1, 2));
  	 
  	
  	
     	
 	} 


    
    public static void main(String[] args) {
    	
    	test(3);
    	TreeNode a=new TreeNode(3);
    	TreeNode b=new TreeNode(1);
    	TreeNode c=new TreeNode(4);
    	TreeNode d=new TreeNode(2);
    	
    	a.left=b;
    	a.right=c;
    	b.right=d;
    	
    	
    	kthSmallest(a,2);
	}

}
