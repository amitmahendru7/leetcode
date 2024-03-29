class Solution {
    private HashMap<Integer, Integer> map;
    public int[] twoSum(int[] nums, int target) {
        map = new HashMap<Integer,Integer>();
        int[] result = new int[2];
        for(int i=0; i< nums.length;i++){
            if(map.containsKey(target-nums[i])){
                result[0]=map.get(target-nums[i]);
                result[1]=i;
            }
            else
                map.put(nums[i],i);
        }
        return result;
    }
}