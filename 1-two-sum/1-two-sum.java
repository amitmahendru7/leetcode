import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> uniqueMap = new HashMap<>();
        int[] indexArray = new int[2];
        for(int i = 0 ; i< nums.length;i++){
            if(uniqueMap.containsKey(target-nums[i])){
                indexArray[0] = uniqueMap.get(target-nums[i]);
                indexArray[1] = i;
            }
            else
                uniqueMap.put(nums[i],i);
        }
        return indexArray;
    }
}