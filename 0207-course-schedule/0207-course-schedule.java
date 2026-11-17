class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
    List<List<Integer>> adj = new ArrayList<>();
    Queue<Integer> q = new LinkedList<>();

for(int i=0;i<numCourses;i++) adj.add(new ArrayList<>());

int ind[]=new int[numCourses];

for(int pre[]:prerequisites){
adj.get(pre[1]).add(pre[0]);
ind[pre[0]]++;
}

for(int i=0;i<numCourses;i++){
if(ind[i]==0) q.add(i);
}

int c=0;
while(!q.isEmpty()){
int curr=q.poll();
c++;
for(int nb: adj.get(curr)){
ind[nb]--;
if(ind[nb]==0){
q.add(nb);
}
}
                                                                                                                                    
}
    return c == numCourses;
}
    }
