class MedianFinder {
 private PriorityQueue<Integer> minHeap;
 private PriorityQueue<Integer> maxHeap;
    public MedianFinder() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<Integer>(1, new Comparator<Integer>(){
            public int compare(Integer ob1, Integer ob2){
                return ob2.compareTo(ob1);
            }
        });
    }
    
    public void addNum(int num) {
        maxHeap.add(num);
        minHeap.add(maxHeap.poll());
        if(minHeap.size() > maxHeap.size()){
            maxHeap.add(minHeap.poll());
        }
    }
    
    public double findMedian() {
        if(maxHeap.size() == minHeap.size())
            return (double) (maxHeap.peek() + minHeap.peek()) *0.5;
        else
            return (double) maxHeap.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */