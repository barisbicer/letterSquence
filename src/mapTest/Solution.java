package mapTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Solution {

	
	
	public static void main(String[] args) {
		
		
		// Creating an empty HashMap
        Map<Integer, String> hash_map = new HashMap<Integer, String>();
  
        // Mapping string values to int keys
        hash_map.put(10, "Geeks");
        hash_map.put(15, "4");
        hash_map.put(20, "Geeks");
        hash_map.put(25, "Welcomes");
        hash_map.put(30, "You");
        
        for(Entry<Integer, String> m: hash_map.entrySet())
        	System.out.println(m);
		
		
	}
}
