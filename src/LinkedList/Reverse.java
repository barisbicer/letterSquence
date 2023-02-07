package LinkedList;



public class Reverse {
	
	 static ListNode dammy=new ListNode(0);
	 static ListNode traverse=dammy;
	 
	static public void reverse(ListNode a) {
		 
		
		 reverList(traverse,a);
		 System.out.println(dammy);
		
	}
	
	
	private static void reverList(ListNode traverse, ListNode a) {
		  
		if(a==null)      
		    return;
				
		reverList(traverse,a.next);
		traverse.next=a;
		traverse= traverse.next;
	    traverse.next=null;
		
	}
	
	 public static ListNode reverseList(ListNode head) {
	        ListNode prev = null;  
	        ListNode current = head;
	    
	        
	        while(current != null) { 
	            ListNode next = current.next; 
	            current.next = prev;
	            prev = current;
	            current = next;
	        }
	       return prev; 
	    }

	 
	  public static ListNode reverseBetween(ListNode head, int left, int right) {
		  
		  if(left ==right)
			  return head;
					  
		  ListNode current=head;
		  ListNode prv=null;
		  
		  for (int i = 0; current != null && i < left-1; i++) {
			  prv=current;
			  current=current.next;
	  	  }
		  /// prv--1,  current--2
		
		  ListNode last=prv; 
		  ListNode newEnd=current;
		  
		
	
		  for (int i = 0;current != null && i < right-left+1; i++) {
			  ListNode next=current.next;   
			  current.next=prv;
			  prv=current;
			  current=next;
			
		}
		  
	   System.out.println("----"+current.val);
	   System.out.println("----"+last.val);
				  
		  if(last != null)
			  last.next=prv;
		  else
			  head=prv;
		  
		  newEnd.next=current;
	        
	
		
        while(head!=null) {
			   
			   System.out.println(head.val);
			   head=head.next;
			   
		   }
		 
		  return head;
	    }
	  
	  

	public static void main(String[] args) {
	
		ListNode a=new ListNode(1);
		ListNode b=new ListNode(2);
		ListNode c=new ListNode(3);
		ListNode d=new ListNode(4);
		ListNode e=new ListNode(5);
		ListNode f=new ListNode(6);
		
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		e.next=f;
		
		
		//reverseBetween(a,2,4);
		
		//reverse(a);
		reverseList(a);
	}
	
	

}
