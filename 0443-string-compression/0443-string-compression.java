class Solution {
    public int compress(char[] chars) {
        
int idx=0;
int n=chars.length;

for(int i=0;i<n;i++){
char ch=chars[i];
int c=0;
while(i<n && chars[i]==ch){
c++;
i++;
}
chars[idx++]=ch;
if(c>1){
String nstr=Integer.toString(c);
for(char dig:nstr.toCharArray()){
chars[idx++]=dig;
}
}
i--;

}

return idx;
    }
}