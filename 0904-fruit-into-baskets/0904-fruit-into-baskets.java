class Solution {
    public int totalFruit(int[] fruits) {
        int maxlen=0;
        int l=0;
int c=0;
        int n=fruits.length;
int[] freq = new int[n];
        
        for(int i=0;i<n;i++){
if(freq[fruits[i]]==0) c++;
        
        freq[fruits[i]]++;

        while(c>2){
freq[fruits[l]]--;
if(freq[fruits[l]]==0)
{
    c--;
}
l++;
        }
        maxlen=Math.max(maxlen,i-l+1);
        }
        return maxlen;
    }
}