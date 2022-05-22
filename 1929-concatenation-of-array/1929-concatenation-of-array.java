class Solution {
    public int[] getConcatenation(int[] nums) {
        //Create the output array with double lenght of the inut array
        int[] outputArrray = new int[nums.length * 2];
        //Loop over original array and insert value in new array
        for(int i= 0; i< nums.length ; i++){
            outputArrray [i] =  nums[i];
            outputArrray[i+nums.length] = nums[i];
        }
        return outputArrray;
    }
}