class Solution {
    public int lengthOfLastWord(String s) {
        

        s=s.trim();// edge case ending m space
String [] word =s.split(" ");
int lastIdx=word.length-1;
int count =0;

char[] ch=word[lastIdx].toCharArray();

for(int i=0;i<ch.length;i++){
    count++;
}

return count;


// Optimal way traverse from end of the sentence 
    }
}