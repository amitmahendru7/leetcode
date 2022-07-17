class Solution {
    public int majorityElement(int[] nums) {
       int count =0;
       Integer majorElement = null;
    for(int i: nums){
        if(count ==0){
            majorElement = i;
        }
        if(i == majorElement){
            count+=1;
        }else
            count+=-1;
    }
    return majorElement;   
}
}