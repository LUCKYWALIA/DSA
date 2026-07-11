class Solution {

public boolean pilesperhour(int []arr,int h,int mid){
long timetaken=0;
for(int x:arr){
timetaken+=((long)x+mid-1)/mid;
}
return timetaken<=h;

}

public int max(int []arr){
int max=arr[0];

for(int i=1;i<arr.length;i++){
if(max<arr[i]) max=arr[i];
}

return max;
}

    public int minEatingSpeed(int[] piles, int h) {
        
int left=1;
int right=max(piles);
int ans=right;
while(left<=right){
int mid=left+(right-left)/2;

if(pilesperhour(piles,h,mid)){
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