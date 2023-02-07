package LinkedList;

class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) {
	          val = x;
	          next = null;
	      }
	  }
	   

public class LinkedListCycleII {
	
	  public ListNode detectCycle(ListNode head) {
	        
	        ListNode slow=head;
	        ListNode fast=head;
	        
	        while(fast != null && fast.next!=null)
	        {
	            slow=slow.next;
	            fast=fast.next.next;
	            if(slow == fast){
	              ListNode start=head;
	                while(start != slow)
	                {
	                    start=start.next;
	                    slow=slow.next;
	                }
	             return slow; 
	           }
	               
	        }  
	        
	        
	        return null;
	}
	
	
	public static void main(String[] args) {
		
	}

}
