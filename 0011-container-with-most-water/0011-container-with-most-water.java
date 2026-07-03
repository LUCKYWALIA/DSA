class Solution {
    public int maxArea(int[] height) {
        int left=0;;
        int right=height.length-1;
        int max=0;

while(left<right){
int width=right-left;
int maxlength=Integer.min(height[left],height[right]);
int area=maxlength*width;
max=Integer.max(max,area);
if(height[left]<height[right]) left++;
else right--;
}
return max;
    }
}