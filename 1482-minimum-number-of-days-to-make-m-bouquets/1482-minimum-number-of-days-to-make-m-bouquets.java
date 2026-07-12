class Solution {

public boolean ifPossible(int []bloomDays,int mid,int m,int k){
int c=0;
int banq=0;

for(int bloom:bloomDays){
    if(bloom<=mid){
        c++;
        if(c==k){
            banq++;
            c=0;
        }
    }
        else c=0;
}
return banq>=m;
}


public int max(int []bloomDay){
    int a=bloomDay[0];
    for(int i=1;i<bloomDay.length;i++){
        if(a<bloomDay[i]){
a=bloomDay[i];
        }
    }
    return a;
}

public int min (int []bloomDay){
    int a=bloomDay[0];
    for(int i=1;i<bloomDay.length;i++){
if(a>bloomDay[i]){
    a=bloomDay[i];
}
    }
    return a;
}


    public int minDays(int[] bloomDay, int m, int k) {
        

int left=min(bloomDay);
int right=max(bloomDay);
int ans=right;

while(left<=right){
int mid=left+(right-left)/2;

if(bloomDay.length<(long)m*k)return -1;

if(ifPossible(bloomDay,mid,m,k)){
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