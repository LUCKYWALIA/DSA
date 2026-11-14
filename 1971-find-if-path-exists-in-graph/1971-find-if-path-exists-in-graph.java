class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
if(source==destination) return true;

List<List<Integer>> g=new ArrayList<>();

for(int i=0;i<n;i++){
g.add(new ArrayList<>());
}

for(int[] e:edges){
g.get(e[0]).add(e[1]);
g.get(e[1]).add(e[0]);
}


boolean [] vis=new boolean[n];
Queue<Integer> q=new LinkedList<>();

q.offer(source);
vis[source]=true;

while(!q.isEmpty()){
int curr=q.poll();
if(curr==destination) return true;

for(int x:g.get(curr)){
if(!vis[x]){
    vis[x]=true;
    q.offer(x);
}
}
}


return false;
    }
}