class KthLargest {
  private PriorityQueue<Integer> heap;
  private static int k; 
    public KthLargest(int k, int[] nums) {
        this.k=k;
        heap = new PriorityQueue<>();
        for(int i : nums){
            heap.add(i);
        }
        while(heap.size() > k){
            heap.poll();
        }
    }
    
    public int add(int val) {
        heap.add(val);
        while(heap.size()>k){
            heap.poll();
        }
        return heap.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */