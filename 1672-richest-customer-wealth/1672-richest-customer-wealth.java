class Solution {
    public int maximumWealth(int[][] accounts) {
        //create output integere and assign it a value of 0
        int maxWealth = 0;
        int[] sumOfWealthArray = new int[accounts.length];
        //loop over the input matrix and find the sum for all index arrays
         //if any sum is greater than current sum, replace max, else move on
        for(int i = 0; i < accounts.length; i++){
            int sumOfWealth = 0;
            for(int j = 0 ; j< accounts[i].length;j++){
                sumOfWealth = sumOfWealth + accounts[i][j];
            }
            sumOfWealthArray[i] = sumOfWealth;
        }
        //find the max in teh new array and return that value
        for(int i = 0; i < sumOfWealthArray.length; i++){
            if(maxWealth < sumOfWealthArray[i])
                maxWealth = sumOfWealthArray[i];
        }
        return maxWealth;
 
    }
}