class Solution {
    public boolean rotateString(String s, String goal) {
        
if(s.length()!=goal.length()) return false;

String newstring=s+s;
return newstring.contains(goal);

    }
}