package Test;

import java.util.Iterator;

public class Test32 {

	public static void solve(int val) {
		
		char[] list=String.valueOf(val).toCharArray();
		int numcount=list.length;
	  
		while(val>0) {
			System.out.println(val%10);
			val=val/10;
			System.out.println(val);
		}   
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println(Integer.MAX_VALUE);
		//solve(960190);
		
		int[][] list= {{1,2,3},{4,5,6},{7,8,9}};
		
		for (int[] f1:list) {
			
			for(int a:f1)
				System.out.println(a);
			
		}
	}
	
}
