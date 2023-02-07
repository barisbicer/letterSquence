package K7;

public class Solution {

	
	 public static int reverse(int x) {
	      
	      long reverse=0;
	      while(0!=x){
	        int pop=x%10;
	        x=x/10;
	        reverse=reverse*10+pop;
	      }

	       if(reverse >= Integer.MIN_VALUE && reverse <= Integer.MAX_VALUE)
	            return (int)reverse; 
	         else
	             return 0;
	       

	        
	    }
	 
	 public static void main(String[] args) {
		reverse(-123);
	}
}
