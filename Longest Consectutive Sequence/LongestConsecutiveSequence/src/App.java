import java.util.HashMap;
import java.util.Map;

class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Boolean> map = new HashMap<>();
        int longestConsecutive = 0;

        //put all elements from your array into a map, set to false or "not visited"
        for(int num: nums){
            map.put(num, Boolean.FALSE);
        }

        //check to see if the number has been visited, have to look forward and back
        for(int num: nums){
            int currentLargestLength = 1;

            //looking forward
            int nextNumber = num + 1;

            while(map.containsKey(nextNumber) && map.get(nextNumber) == false){
                currentLargestLength++;
                map.put(nextNumber, Boolean.TRUE);

                //keep checking for the next potential number
                nextNumber++;
            }

            //looking back
            int prevNumber = num - 1;
            while(map.containsKey(prevNumber) && !map.get(prevNumber)){
                currentLargestLength++;
                map.put(prevNumber, Boolean.TRUE);

                //keeps checking for the previous potential number
                prevNumber--;
            }

            longestConsecutive = Math.max(longestConsecutive, currentLargestLength);

        }
        return longestConsecutive;
    }
}