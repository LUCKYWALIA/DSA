class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        int idx=0;

        for(int i=0;i<n;i++){
char ch=chars[i];
int c=0;

while(i<n && chars[i]==ch){
    c++;
    i++;
}
chars[idx++]=ch;

if(c>1){
    String cstr=Integer.toString(c);
    for(char dig:cstr.toCharArray()){
        chars[idx++]=dig;
    }
}
i--;
 
        }
return idx;
    }
}