class Solution {
    public int maxProduct(int[] nums) {
        int pre=1;
        int suf=1;

int max=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
pre=pre*nums[i];
suf=suf*nums[nums.length-i-1];

max=Integer.max(max,Integer.max(pre,suf));

            if(pre==0) pre=1;
            if(suf==0) suf=1;
        }
return max;
    }
}