import java.util.HashMap;
import java.util.Map;


class Solution {
    
    public int lengthOfLongestSubstring(String s) {

        int rightPointer = 0;
        int leftPointer = 0;
        int max = 0;

        Map<Character, Integer> myMap = new HashMap<>();
        while(rightPointer < s.length()){
            char currentChar = s.charAt(rightPointer);

            if(myMap.containsKey(currentChar) && myMap.get(currentChar) >= leftPointer){
                leftPointer = myMap.get(currentChar) + 1;
            }

            myMap.put(currentChar, rightPointer);
            max = Math.max(max, rightPointer-leftPointer + 1);
            rightPointer++;
        }
        return max;
    }
}