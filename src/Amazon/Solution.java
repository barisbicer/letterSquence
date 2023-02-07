package Amazon;


import java.util.ArrayList;
import java.util.List;

public class Solution {
  
	
	public static String solution(int AA, int AB, int BB) {

    	
        List<String> list=new ArrayList<>();
        int aa=AA;
        int ab=AB; 
        int bb=BB;
        
        int sum1=AA+AB+BB;
        if(AA==0 && BB==0)
            sum1=AB;
         if(AA==0 && AB==0)
            sum1=1;
         if(BB==0 && AB==0)
            sum1=1;  
      
        for(int i=0;i<sum1;i++)
        {    if(aa!=0)
            {
                list.add("AA");
                aa--;
            }
             if(ab!=0)
            {
                list.add("AB");
                ab--;
            }
            if(bb!=0)
            {
                list.add("BB");
                bb--;
            }
        }
        
      
        
    /*    List<String> copylist = new ArrayList<String>(list);
              
        for (int i = copylist.size()-1; i >= 0; i--) {
        	   if(copylist.get(i).equals(copylist.get(i-1)))
			       copylist.remove(i);
			   else
				   break;
		}
  
        
        System.out.println(String.join("",copylist));
        */
        
         List<String> result=new ArrayList<>();
         result.add(list.get(0));
       
         for(int j=1;j<sum1;j++){
        	    
                  if(result.get(j-1)!="AA" && AA!=0)
                 {
                      result.add(list.get(j));
                      AA--;
                      continue;
                 }
                  else if(result.get(j-1)!="BB" && BB!= 0)
                 {
                      result.add(list.get(j));
                      BB--;
                      continue;
                 }
                 else if(list.get(j)=="AB")
                 {
                	  result.add(list.get(j));
                	  AB--;
                 }else
                	  break;
                  
                 

          }
	
         
         return String.join("",result);
         
       
  

    }

	
	public static void main(String[] args) {
		
		System.out.println(solution(0,2,0));
		
	}
}
