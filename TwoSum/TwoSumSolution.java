import java.util.HashMap;
import java.util.Map;

class TwoSumSolution {
    public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> indecesToComps = new HashMap<>();
    
    for(int i = 0; i < nums.length; i++){
        Interger complementsIndex = indecesToComps.get(nums[i]);
        if(complementsIndex != null){
            return new int[]{i, complementsIndex};
        }
        indecesToComps.put(target - nums[i]. i);
    }
    return nums;


   
   
   
   
   
   
   
   
   
   
   
   
   
    //n^2 time complexity
    //     for(int i = 0; i < nums.length; i++){
    //         for(int j = i + 1; j < nums.length; j++){
    //             if(nums[i] + nums[j] == target){
    //                 return new int[]{i, j};
    //             }
    //         }
    //     }
    // return nums;
    // }
    }
}