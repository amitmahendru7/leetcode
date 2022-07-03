class Solution {
    public int[] sortedArray;
    public int[] sortArray(int[] nums) {
      this.sortedArray = new int[nums.length];
      mergeSort(nums, 0,sortedArray.length-1);
      return nums;
    }
    
    private void mergeSort(int[] nums , int left, int right){
        if(left == right)
            return;
        int middle = (left+right)/2;
        mergeSort(nums,left, middle);
        mergeSort(nums,middle+1,right);
        merge(nums,left, middle, right);
    }
    
    private void merge(int[] nums , int left, int middle, int right){
        for(int i= left; i<= right; i++){
            sortedArray[i] = nums[i];
        }
        int leftIndex = left;
        int rightIndex = middle + 1;
        for(int i= left ; i<= right ; i++){
           if(leftIndex == middle+1){
               nums[i] = sortedArray[rightIndex++];
           }
            else if(rightIndex == right+1) {
                // right all merged
                nums[i] = sortedArray[leftIndex++];
            } else if(sortedArray[leftIndex] < sortedArray[rightIndex]) {
                // left smaller
                nums[i] = sortedArray[leftIndex++];
            } else {
                // right smaller
                nums[i] = sortedArray[rightIndex++];
            }  
        }
    }
}