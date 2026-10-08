class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n=intervals.length;
Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
        int c=0;
        int prevend=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
if(intervals[i][0]<prevend) c++;
else prevend=intervals[i][1];
        }
        
        return c;
    }
}