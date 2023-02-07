package Amazon;

import java.util.*;

class GFG
{
	  public static int minMeetingRooms(int[][] intervals) {
	        Map<Integer, Integer> treeMap = new TreeMap<>();
	        for(int i = 0; i < intervals.length; i++) {
	            treeMap.put(intervals[i][0], treeMap.getOrDefault(intervals[i][0], 0) + 1);
	            treeMap.put(intervals[i][1], treeMap.getOrDefault(intervals[i][1], 0) - 1);
	        }

	        int count = 0;
	        int max = 0;
	        // look through entries in ascending key order
	        for(Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
	            count+=entry.getValue();
	            max = Math.max(max, count);
	        }

	        return max;
}
	  
	  public static int minMeetingRooms1(int[][] intervals) {
	        if (intervals == null || intervals.length == 0) return 0;
	        int n = intervals.length, index = 0;
	        int[] begins = new int[n];
	        int[] ends = new int[n];
	        for(int i = 0; i < intervals.length; i++) 
	        {
	        	begins[index] = intervals[i][0];
	            ends[index] = intervals[i][1];
	            index++;
	        }
	        Arrays.sort(begins);
	        Arrays.sort(ends);
	        int rooms = 0, pre = 0;
	        for (int i = 0; i < n; i++) {
	            rooms++;
	            if (begins[i] >= ends[pre]) {
	                rooms--;
	                pre++;
	            }
	        }
	        return rooms;
	    }
 
// Driver code
public static void main(String[] args)
{
    int lectures[][] = {{ 2, 5 },
                        { 3, 6 },
                        { 5, 7 }};
    int n = lectures.length;
 
   // System.out.println(minMeetingRooms(lectures));
    System.out.println(minMeetingRooms1(lectures));
}
}