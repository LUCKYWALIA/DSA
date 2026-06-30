class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
int ele1=0;
int cnt1=0;
int ele2=0;
int cnt2=0;
ArrayList<Integer> l=new ArrayList<>();

for(int i=0;i<nums.length;i++){
if(cnt1==0 && nums[i]!=ele2){
ele1=nums[i];
cnt1=1;
}
else if(cnt2==0 && nums[i]!=ele1){
    ele2=nums[i];
    cnt2=1;
}
else if(nums[i]==ele1){
cnt1++;
}
else if(nums[i]==ele2){
cnt2++;
}
else {
    cnt1--;
 cnt2--;
 }

}


int c1=0;
int c2=0;

for(int i=0;i<nums.length;i++){
if(nums[i]==ele1)c1++;
if(nums[i]==ele2)c2++;
}

int check=nums.length/3;

if(c1>check)l.add(ele1);
if(c2>check && ele1!=ele2)l.add(ele2);



return l;
    }
}