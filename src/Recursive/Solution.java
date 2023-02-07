package Recursive;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	
	
	

	public static void permutation(String str) {
		
		  int len=str.length();
	      List<String> list=new ArrayList<>();
		  permutationLast(str,0,len,list);	
			
		}
		private static void permutationLast(String str, int i, int len, List<String> list) {
			// TODO Auto-generated method stub
			if(i==len)
			{
				list.add(str);
				System.out.println(str);
			}
			
			for(int j=i;j<len;j++) {
				
			  	String r=swap(str,i,j);
				permutationLast(r,i+1,len,list);
				r=swap(str,i,j);
				
				
			}
			
		}
  
			
	private static String swap(String s, int i, int j) {
		// TODO Auto-generated method stub
		char[] c=s.toCharArray();
		char temp=c[i];
		c[i]=c[j];
		c[j]=temp;
	    return String.valueOf(c);
		
	}





	
	

	public static void main(String[] args) {
		
		
		permutation("abc");
	}

}
