class Solution {

public int first(int []nums,int target){
int idx=-1;
int left=0;
int right=nums.length-1;

while(left<=right){
int mid=left+(right-left)/2;
if(nums[mid]==target)idx=mid;
if(nums[mid]>=target)right=mid-1;
else left=mid+1;
}
return idx;
}

public int last(int []nums,int target){
int idx=-1;
int left=0;
int right=nums.length-1;

while(left<=right){
int mid=left+(right-left)/2;
if(nums[mid]==target)idx=mid;
if(nums[mid]<=target)left=mid+1;
else right=mid-1;
}
return idx;
    }


    public int[] searchRange(int[] nums, int target) {
int []res=new int[2];
 res[0]=first(nums,target);
 res[1]=last(nums,target);
return res;
    }
}