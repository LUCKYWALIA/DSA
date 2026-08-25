class Solution {
    public int missingMultiple(int[] nums, int k) {
        
Arrays.sort(nums);
int n=nums[nums.length-1];

int [] f=new int[n+k+1];

for(int i=0;i<nums.length;i++){
f[nums[i]]++;
}


for(int i=k;i<f.length;i+=k){
if(f[i]==0) return i;
}
return -1;
    }
}