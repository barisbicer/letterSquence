package Permu;

import java.util.LinkedList;
import java.util.List;

public class Solution1 {
	
	static List<List<Integer>> res=new LinkedList<>();
	
	public static List<List<Integer>> permu(int[] nums){
		
		List<Integer> dt=new LinkedList<>();
		for (int num:nums) {
			dt.add(num);
		}
		dfs(new LinkedList<>(),dt);
		System.out.println(res);
		return res;
		
		
	}
	
	
	private static void dfs(List<Integer> permutasyon, List<Integer> dt) {
		// TODO Auto-generated method stub
		System.out.println(permutasyon);
		if(dt.size()==0) {
			res.add(permutasyon);
			return; 
		}
		
		for(Integer num: dt) {
			List<Integer> tempP=new LinkedList<>(permutasyon);
			List<Integer> tempDt=new LinkedList<>(dt);
			tempP.add(num);
			tempDt.remove(num);
			dfs(tempP,tempDt);
			System.out.println(num);
			
		}
		
	}


	public static void main(String[] args) {
		int[] a= {1,2,3};
		permu(a);
	}

}
