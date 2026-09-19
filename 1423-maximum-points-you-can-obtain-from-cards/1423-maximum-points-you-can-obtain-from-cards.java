class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lsum=0;
        int rsum=0;

        int n=cardPoints.length-1;

for(int i=0;i<k;i++){
lsum+=cardPoints[i];
}

    int maxsum=lsum;

for(int j=k-1;j>=0;j--){
lsum-=cardPoints[j];
rsum+=cardPoints[n];
n-=1;
maxsum=Math.max(maxsum,lsum+rsum);
}

        return maxsum;
    }
}