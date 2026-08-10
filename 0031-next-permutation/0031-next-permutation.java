class Solution {

public void swap(int a[],int i,int j){
int temp=a[i];
a[i]=a[j];
a[j]=temp;
}



public void rev(int a[],int st,int end){
while(st<end){
swap(a,st,end);
st++;
end--;
}
}



    public void nextPermutation(int[] nums) {

int idx=-1;

for(int i=nums.length-2;i>=0;i--){
if(nums[i]<nums[i+1]){
idx=i;
break;
}
}

   if(idx==-1){
rev(nums,0,nums.length-1);
return;
   }  
        
for(int i=nums.length-1;i>idx;i--){
if(nums[i]>nums[idx]){
swap(nums,i,idx);
break;
}
}

rev(nums,idx+1,nums.length-1);
    }
}