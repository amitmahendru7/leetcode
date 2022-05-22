class Solution {
    public int[] runningSum(int[] nums) {
        //Create an output array with equal length as input array
        int[] outputArray = new int[nums.length];
        //Maintain a sum of looped indexes items
        int sum = 0;
        //Loop over input array and insert values in outputarray
        for(int i = 0 ; i< nums.length ; i++){
            sum += nums[i];
            outputArray[i]= sum;
        }
      return outputArray;  
    }
}