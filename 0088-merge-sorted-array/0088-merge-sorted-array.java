class Solution {
public void swap(int a[],int b[],int idx1,int idx2){
    if(a[idx1]>b[idx2]){
        int x=a[idx1];
        a[idx1]=b[idx2];
        b[idx2]=x;
    }
}

    public void merge(int[] arr1, int m, int[] arr2, int n) {

int len=n+m;
int gap=(len/2)+(len%2);

while(gap>0){
int left=0;
int right=left+gap;
while(right<len){
    // arr1,arr2
if(left<m && right>=m){
swap(arr1,arr2,left,right-m);
}
// both on arr2
else if(left>=m){
swap(arr2,arr2,left-m,right-m);
}
// both on arr1
else{
swap(arr1,arr1,left,right);
}
left++;
right++;
}
if(gap==1)break;
gap=(gap/2) +(gap%2);
}


// merging 2nd arr 
for(int i = 0; i < n; i++){
        arr1[m + i] = arr2[i];
        }

    }
}