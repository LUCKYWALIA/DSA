class Solution {
    public int singleNumber(int[] nums) {
      int ans=0;

for(int bitidx=0;bitidx<32;bitidx++){
    int cnt=0;
for(int num:nums){
    if((num&(1<<bitidx))!=0) cnt++;
}
if(cnt%3!=0) ans=ans|(1<<bitidx);
}


      return ans;  
    }
}