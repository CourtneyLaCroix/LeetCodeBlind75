class Solution {
    public int missingNumber(int[] nums) {
        
         int missingNum = nums.length;

        for(int i = 0; i < nums.length; i++){
            missingNum ^= i;
            missingNum ^= nums[i];
        }
        return missingNum;



    //     Map<Integer, Boolean> myHashMap = new HashMap<>();

    //     for(int numbers: nums){
    //         myHashMap.put(numbers, Boolean.TRUE);
    //     }

    //     int checker = 0;
    //     while(checker < nums.length){
    //         Boolean missingNum = myHashMap.containsKey(checker);

    //         if(missingNum == false){
    //             break;
    //         }
    //         checker++;
    //     }

    //     return checker;
    // }
    }
}