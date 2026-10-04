class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
    return atmost(nums,k) - atmost(nums,k-1);
    }
    public int atmost(int[] nums, int k) {
        int count=0;
        int sum=0;
        int left=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i]%2;
            while(sum>k && left<=i){
                sum-=nums[left]%2;
left++;
            }
            count+=i-left+1;
        }
        return count;
    }
}