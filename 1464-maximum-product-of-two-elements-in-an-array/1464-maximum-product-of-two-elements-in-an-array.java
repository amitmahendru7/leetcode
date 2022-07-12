class Solution {
    public int maxProduct(int[] nums) {
        //Brute force
        int maxValue = (nums[0]-1)*(nums[1]-1);
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                maxValue = Math.max(((nums[i]-1)*(nums[j]-1)),maxValue);
            }
        }
        return maxValue;
    }
}