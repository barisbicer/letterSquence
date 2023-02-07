package K22;

import java.util.ArrayList;
import java.util.List;

public class Solution {


   public static  List<String> generateParenthesis(int n) {
        List<String> list =new ArrayList<>();
   if(n<=0)return list;    
   dfs(n,0,"",list);
         
  return list;
       
   }



private static void dfs(int left, int right, String st, List<String> list) {
// TODO Auto-generated method stub
  if(left ==0&&right==0)
  {
  list.add(st);
      return;
  }
  //System.out.println("dfs(int "+left+", int "+right+", String "+st+", List<String> list)");
   if(left>0) dfs(left-1,right+1,st+"(",list);
   if(right>0) dfs(left,right-1,st+")",list);
}



public static void main(String[] args) {

System.out.println(generateParenthesis(3));

}

}