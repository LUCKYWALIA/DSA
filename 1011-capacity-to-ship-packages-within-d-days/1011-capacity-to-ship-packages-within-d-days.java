class Solution {

    public int isPos(int []weights,int days,int mid){

int s=0;
int day=1;

for(int weight:weights){
if(s+weight>mid){
day++;
s=weight;
}
else{
s+=weight;
}
}
return day;
    }


    public int shipWithinDays(int[] weights, int days) {
        int left=Arrays.stream(weights).max().getAsInt();
        int right=Arrays.stream(weights).sum();
        int ans=right;

while(left<=right){
int mid=left+(right-left)/2;
int check=isPos(weights,days,mid);
if(check<=days){
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