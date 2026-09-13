class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List <Integer> ans=new ArrayList<>();

int i=0;
int j=0;
int n=s.length();
int w=p.length();


if(w>n) return ans;

int [] freqp=new int[26];
int [] freqs=new int [26];

for(int x=0;x<w;x++){
freqp[p.charAt(x)-'a']++;
}

while(j<n){
freqs[s.charAt(j)-'a']++;

if(j-i+1<w) j++;

else if(j-i+1==w){
if(Arrays.equals(freqs,freqp)) ans.add(i);

freqs[s.charAt(i)-'a']--;
    i++;
    j++;
}

}
return ans;
    }
}