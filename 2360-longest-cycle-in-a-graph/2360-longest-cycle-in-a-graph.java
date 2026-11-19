class Solution {
    public int longestCycle(int[] edges) {
        int n=edges.length;
        boolean [] vis=new boolean[n];
        int [] ind=new int[n];

for(int e:edges){
if(e!=-1) ind[e]++;
}

    Queue<Integer> q = new LinkedList<>();

for(int i=0;i<n;i++){
if(ind[i]==0) q.offer(i);
}

while(!q.isEmpty()){
int curr=q.poll();
vis[curr]=true;
int next=edges[curr];
if(next!=-1){
    ind[next]--;
    if(ind[next]==0) q.offer(next);
}
}

int ans=-1;

for(int i=0;i<n;i++){
if(!vis[i]){
    int neigh=edges[i];
    int c=1;
    vis[i]=true;
    while(neigh!=i){
vis[neigh]=true;
c++;
neigh=edges[neigh];
    }
    ans=Math.max(ans,c);
}
}

return ans;
    }
}