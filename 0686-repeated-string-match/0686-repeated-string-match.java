class Solution {
    public int repeatedStringMatch(String a, String b) {
        
StringBuilder newA=new StringBuilder(a);
int c=1;
while(newA.length()<b.length()){
newA.append(a);
c++;
}

if(newA.toString().contains(b)) return c;

newA.append(a);

if(newA.toString().contains(b)) return c+1;

return -1;

    }
}