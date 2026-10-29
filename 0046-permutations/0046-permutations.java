class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        backtrack(ans,0,nums);
        return ans;
    }
    void backtrack(List<List<Integer>> ans,int st,int []nums){
if(st==nums.length-1){

List<Integer>  l=new ArrayList<>();
for(int num:nums){
l.add(num);
}
ans.add(l);
    return;
}
for(int i=st;i<nums.length;i++){
swap(nums,st,i);
backtrack(ans,st+1,nums);
swap(nums,st,i);
}
    }
    void swap(int[] nums,int i,int j){
int temp=nums[i];
nums[i]=nums[j];
nums[j]=temp;
    }
}