class Solution {
    public int[] buildArray(int[] nums) {
        //Create a new array for temporary assignment
        int[] outputArray = new int[nums.length];
        //Loop over original arry and assign values to new array
        for(int i=0; i< nums.length ; i++){
            outputArray[i] = nums[nums[i]];
        }
        return outputArray;
    }
}