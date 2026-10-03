class Solution {
    public String minWindow(String s, String t) {

        HashMap<Character,Integer> m=new HashMap<>();
        for(int i=0;i<t.length();i++){
m.put(t.charAt(i),m.getOrDefault(t.charAt(i),0)+1);
        }

int i=0;
int j=0;

int count=m.size();

int minlen=Integer.MAX_VALUE;
int st=0;

while(j<s.length()){
    if(m.containsKey(s.charAt(j))){
        m.put(s.charAt(j),m.get(s.charAt(j))-1);
        if(m.get(s.charAt(j))==0) count--;
    }


    while(count==0){
                if(j-i+1<minlen){
                    minlen=j-i+1;
                    st=i;
                }
        if(m.containsKey(s.charAt(i))){
             m.put(s.charAt(i),m.get(s.charAt(i))+1);
             if(m.get(s.charAt(i))>0){
                count++;
             }
    }
        i++;
}
j++;
}
if(minlen==Integer.MAX_VALUE) return "";

return s.substring(st,st+minlen);
    }
}