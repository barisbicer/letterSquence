package K973;

import java.util.PriorityQueue;

public class Solution {

	public int[][] kClosest(int[][] points, int k) 
    {
        // O(n log n) time
        // O(n) space
        
        // nearest point would be on top of Q
        PriorityQueue<int[]> Q = new PriorityQueue<>( (a, b) -> (a[0]*a[0] + a[1]*a[1]) - (b[0]*b[0] + b[1] * b[1]));
        
        //PriorityQueue<int[]> Q = new PriorityQueue<>( (a, b) -> (b[0]*b[0] + b[1]*b[1]) - (a[0]*a[0] + a[1] * a[1]));
        
        for(int[] point : points)
        {
        	Q.add(point);
        
        }
        int[][] res = new int[k][2];
        
        for(int i = 0; i < k; i++)
        {
            res[i] = Q.poll();
        }
        return res;
    }
	
    
    public static void main(String[] args) {
    	Solution a=new Solution();
    	int[][] arr={{1,3},{-2,2}};
    	  int N = arr.length;
    	  int M=arr[0].length;
    	  System.out.println(N+"--"+M);
    	  //System.out.println(arr[0]);
    	  int[][] res = a.kClosest(arr, 1);
    	  for(int[] f:res)
    		  System.out.println(f[0]+"-"+f[1]);
    	  
    	  
	}
}