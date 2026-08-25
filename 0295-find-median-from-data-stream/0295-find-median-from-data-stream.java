class MedianFinder {
PriorityQueue<Integer> minheap;
PriorityQueue<Integer> maxheap;
boolean even =true;

    public MedianFinder() {
        minheap=new PriorityQueue<>();
        maxheap=new PriorityQueue<>(Collections.reverseOrder());
        }
    
    public void addNum(int num) {
        if(even){
maxheap.offer(num);
minheap.offer(maxheap.poll());
        }else{
minheap.offer(num);
maxheap.offer(minheap.poll());
        }
        even=!even;
    }
    
    public double findMedian() {
        return even?(minheap.peek()+maxheap.peek())/2.0:minheap.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */