class Solution {
    private static int k;
    private PriorityQueue<Integer> heap;
    public int findKthLargest(int[] nums, int k) {
        this.k=k;
        heap = new PriorityQueue<>();
        
        for(int i:nums){
            heap.offer(i);
            if(heap.size() > k){
            heap.poll();
            }
        }
        return heap.peek();
    }
}