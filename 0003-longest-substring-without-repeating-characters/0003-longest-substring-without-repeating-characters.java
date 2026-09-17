class Solution {
    public int lengthOfLongestSubstring(String str) {

Set <Character> s=new HashSet<>();
int left=0;
int maxlength=0;

for(int right=0;right<str.length();right++){
while(s.contains(str.charAt(right))){
s.remove(str.charAt(left));
left++;
}
s.add(str.charAt(right));
maxlength=Math.max(maxlength,right-left+1);
}

return maxlength;
    }
}