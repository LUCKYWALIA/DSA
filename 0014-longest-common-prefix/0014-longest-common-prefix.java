class Solution {
    public String longestCommonPrefix(String[] strs) {

Arrays.sort(strs);
StringBuilder s=new StringBuilder();
String f=strs[0];
String l=strs[strs.length-1];

for(int i=0;i<Integer.min(f.length(),l.length());i++){
if(f.charAt(i)!=l.charAt(i)){
    return s.toString();
}
s.append(f.charAt(i));
}

    return s.toString();
            }
}