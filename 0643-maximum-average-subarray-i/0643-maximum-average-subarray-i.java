class Solution {
    public double findMaxAverage(int[] nums, int w) {
        int n=nums.length;
int i=0;
int j=0;

int max=Integer.MIN_VALUE;


while(j<n){
    int s=0;
if(j-i+1<w) j++;
else if(j-i+1==w){
   for(int k=i;k<=j;k++){
s+=nums[k];
   }
   max=Math.max(max,s);
    i++;
    j++;
}
}
return (double)max/w;
    }
}