class Solution {
    int getNum(String s,int i,long res,int sign){
        if(i>=s.length() || !Character.isDigit(s.charAt(i))) return sign* (int)res;
        res=res*10+(s.charAt(i)-'0');
        if(sign*res>=Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if(sign*res<=Integer.MIN_VALUE) return Integer.MIN_VALUE;

             return getNum(s,i+1,res,sign);
    }
    public int myAtoi(String s) {
        s=s.trim();
        if(s==null || s.isEmpty()) return 0;
        int i=0;
        int sign=1;
        if(s.charAt(0)=='-' || s.charAt(0)=='+' ){
sign=s.charAt(0)=='-' ?-1:1;
            i++;
        }
        while(i<s.length() && s.charAt(i)=='0') i++;
        return getNum(s,i,0L,sign);
    }
}