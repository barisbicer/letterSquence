package K542;

import java.util.LinkedList;
import java.util.Queue;

class Node{
	
	int first;
	int second;
	int third;
	
	
	public Node(int first, int second, int third) {
		super();
		this.first = first;
		this.second = second;
		this.third = third;
	}
	
	
}

public class Solution1 {
	
	
	
	  public int[][] updateMatrix(int[][] mat) {
		  
           int m=mat.length;
           int n=mat[0].length;
		   
           int[][] visit=new int[m][n];
           int[][] dist=new int[m][n];
           Queue<Node> que=new LinkedList<>();
           for (int i = 0; i <m; i++) {
			 for (int j = 0; j <n; j++) {
				 if(mat[i][j]==0) {
					 visit[i][j]=1;
					 que.offer(new Node(i, j, 0));
				 }else
				 {
					 visit[i][j]=0;
				 }
			}
	   	 }
           
          int delrow[] = {-1,0,1,0};
          int delcol[] = {0,1,0,-1};
          while(!que.isEmpty()) {
        	  
        	  int row=que.peek().first;
        	  int col=que.peek().second;
        	  int dis=que.peek().third;
        	
        	  que.remove();
        	  dist[row][col]=dis;
     
        	  for(int i=0;i<4;i++) {
        		  int nrow=row+delrow[i];
        		  int ncol=col+delcol[i];
        		  if(nrow >=0&&nrow<m&&ncol>=0&&ncol<n&&visit[nrow][ncol]==0) {
        			  System.out.println(row+"-"+col+"-"+dis);
        			  visit[nrow][ncol]=1;
        			  que.add(new Node(nrow, ncol, dis+1));
        			  System.out.println(nrow+"-"+ncol+"-"+dis+1+"----"+delrow[i]+"--"+delcol[i]);
        		  }
        		  
        		  
        	  }
        	  
        	  
          }
		  
		  return dist;
	  }
	
	public static void main(String[] args) {
		
		int[][] mat = {{0,0,0},{0,1,0},{0,0,0}};
       	Solution1 a=new Solution1();
    	a.updateMatrix(mat);
    	
		
	}

}
