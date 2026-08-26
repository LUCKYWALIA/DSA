class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> ans=new ArrayList<>();
    HashSet<Integer> s=new HashSet<>();

        int max=nums[0];
        int min=nums[0];

        for(int i=0;i<nums.length;i++){
if(max<nums[i]) max=nums[i];
    }
for(int i=0;i<nums.length;i++){
    if(min>nums[i]) min=nums[i];
        }

for(int n:nums){
s.add(n);
}

for(int i=min;i<=max;i++){
if(!s.contains(i)) ans.add(i);
}

    return ans;
}
}
