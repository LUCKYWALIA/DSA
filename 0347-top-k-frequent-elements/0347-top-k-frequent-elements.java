class Pair{
    int freq;
    int c;
    Pair(int freq,int c){
this.freq=freq;
this.c=c;
    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
HashMap <Integer,Integer> m =new HashMap<>();

for(int num:nums){
m.put(num,m.getOrDefault(num,0)+1);
}

PriorityQueue <Pair> minheap=new PriorityQueue<>((a,b)-> a.freq-b.freq );

for(Map.Entry<Integer,Integer> it:m.entrySet()){
minheap.offer(new Pair (it.getValue(),it.getKey()));
if(minheap.size()>k) minheap.poll();
}

int [] res=new int[k];

for(int i=0;i<k;i++){
res[i]=minheap.poll().c;
}
return res;
    }
}