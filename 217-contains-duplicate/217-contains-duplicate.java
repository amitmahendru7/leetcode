import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean flag = false;
        //Define a hashtable
        Hashtable<Integer,Integer> uniqueMap = new Hashtable<>();
        for(Integer num : nums){
            if(!uniqueMap.containsKey(num))
                uniqueMap.put(num, num);
        }
        if(uniqueMap.size() != nums.length)
            flag = true;
        return flag;
        //loop over the original array and keep inserting in Hashmap if not exists
        //In end check size of Hashmap and array , if equals return true or else return false
        
    }
}