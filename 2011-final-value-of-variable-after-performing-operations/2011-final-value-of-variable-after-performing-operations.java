class Solution {
    public int finalValueAfterOperations(String[] operations) {
        //define return sum variable
        int sum = 0;
        //loop over the input String array
            //If conatins - then decrement
            //if conatisn + then incrememt
        for(String str : operations){
            if(str.contains("+"))
                sum+=1;
            if(str.contains("-"))
                sum-=1;
        }
        return sum;
        
    }
}