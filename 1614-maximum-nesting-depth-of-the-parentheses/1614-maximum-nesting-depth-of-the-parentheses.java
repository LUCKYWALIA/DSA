class Solution {
    public int maxDepth(String s) {
        
int c=0;
int maxc=0;

for(int i=0;i<s.length()-1;i++){
if(s.charAt(i)=='(') c++;
else if(s.charAt(i)==')') c--;

maxc=Integer.max(maxc,c);
}
return maxc;
    }
}