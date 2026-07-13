class MyCircularQueue {

    int []a;
    int front;
    int rear;
    int size;

    public MyCircularQueue(int k) {
        size=k;
        a=new int[size];
front=-1;
rear=-1;
    }
    
    public boolean enQueue(int value) {
        if(isFull()) return false;

        if(isEmpty()){
            front=0;
        }
        rear=(rear+1)%size;
        a[rear]=value;
        return true;
    }
    
    public boolean deQueue() {
     if(isEmpty()) return false;

if(front==rear){
    front=-1;
    rear=-1;
}
else{
front=(front+1)%size;
}
return true;
    }
    
    public int Front() {
        return isEmpty()?-1:a[front];
    }
    
    public int Rear() {
        return isEmpty()?-1:a[rear];

    }
    
    public boolean isEmpty() {
        return front==-1;
    }
    
    public boolean isFull() {
        return (rear+1)%size==front;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */