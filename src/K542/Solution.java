package K542;

import java.util.LinkedList;
import java.util.Queue;

class Pair{
    int first,second,third;
    Pair(int first, int second, int third)
    {
        this.first=first;
        this.second=second;
        this.third=third;
    }
}

public class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n=mat.length, m=mat[0].length;
        int vis[][]=new int[n][m];
		//dis matrix stores the distance of the nearest 0 from every cell
        int dis[][]=new int[n][m];
        Queue<Pair> q = new LinkedList<Pair>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(mat[i][j]==0)
                {
                    q.offer(new Pair(i, j, 0));
                    vis[i][j]=1;
                }
                else
                    vis[i][j]=0;
            }
        }
        
        int delrow[]={-1, 0, 1, 0};
        int delcol[]={0, -1, 0,   1};
        while(!q.isEmpty())
        {
            int r=q.peek().first;
            int c=q.peek().second;
            int step=q.peek().third;
            q.remove();
			//in the dist matrix store the steps taken to reach the nearest cell
            dis[r][c]=step;
            for(int i=0;i<4;i++)
            {
                int nrow=r+delrow[i];
                int ncol=c+delcol[i];
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==0)
                {
                    vis[nrow][ncol]=1;
                    q.offer(new Pair(nrow, ncol, step+1));
                }
            }
        }
        return dis;
    }
    
    public static void main(String[] args) {
		
    	int[][] mat = {{0,0,0},{0,1,0},{0,0,0}};
    	
    	Solution a=new Solution();
    	a.updateMatrix(mat);
    	
	}
}