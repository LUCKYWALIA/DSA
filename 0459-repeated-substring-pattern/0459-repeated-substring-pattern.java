class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int len=s.length();

        for(int i=len/2;i>=1;i--){
if(len%i==0){
    String sub=s.substring(0,i);
    StringBuilder st=new StringBuilder();

    for(int j=0;j<len/i;j++){
st.append(sub);
    }

if(st.toString().equals(s)) return true;

}
        }
return false;
    }
}