class Solution {

public boolean isdiv(int []nums,int mid,int threshold){
int s=0;
for(int num:nums){
s+=(num+mid-1)/mid;
if(s>threshold) return false;
}


return true;
}


public int max(int []arr){
    int a=arr[0];
    for(int i=1;i<arr.length;i++){
if(a<arr[i]){
    a=arr[i];
}
    }
    return a;
}

    public int smallestDivisor(int[] nums, int threshold) {
        
int left=1;
int right=max(nums);
int ans=right;

while(left<=right){
    int mid=left+(right-left)/2;
if(isdiv(nums,mid,threshold)){
ans=mid;
right=mid-1;
}
else{
left=mid+1;
}
}

return ans;
    }
}