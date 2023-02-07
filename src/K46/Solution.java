package K46;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Solution {
	
    public static List<List<Integer>> permute(int[] nums) {
         
    	List<List<Integer>> result=new ArrayList<>();
    	List<Integer> out=new ArrayList<>();
    	for(int n:nums)
    		out.add(n);
    	int n=nums.length;
    	dfs(n,result,out,0);
    
        return result;
      
    }
    
    
    
    private static void dfs(int n, List<List<Integer>> result, List<Integer> out, int first) {
		// TODO Auto-generated method stub
    	 if(first==n)
    		 result.add(new ArrayList<>(out));
    	 
    	 for (int i = first; i < n; i++) {
			
    		 Collections.swap(out, first, i);
    		 dfs(n,result,out,first+1);
    		 Collections.swap(out, first, i);
    	 }
		}
    		
    	
		




	public static void main(String[] args) {
		
    	int[] a= {1,2,3};
    	permute(a); 
    	
	}

}
