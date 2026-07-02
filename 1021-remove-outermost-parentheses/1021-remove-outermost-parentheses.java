class Solution {
    public String removeOuterParentheses(String str) {
        StringBuilder s=new StringBuilder();
        int level=0;
        for(char ch:str.toCharArray()){
if(ch=='('){
    if(level>0) s.append(ch);
    level++;
}
else if(ch==')'){
level--;
if(level>0) s.append(ch);
}
        }
        return s.toString();
    }
}