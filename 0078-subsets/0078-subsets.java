class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        int subsets=1<<n;
List<List<Integer>> l=new ArrayList<>();

for(int i=0;i<subsets;i++){
List <Integer> inerl=new ArrayList<>();
for(int j=0;j<n;j++){
if((i&(1<<j))!=0) inerl.add(nums[j]); // iu here is number 

}
l.add(inerl);

}
return l;
    }
}