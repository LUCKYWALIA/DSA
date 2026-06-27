class Solution {
    public String reverseWords(String s) {
        
s=s.trim();
String []word=s.split("\\s+");

for(int i=0;i<word.length/2;i++){
String temp=word[i];
word[i]=word[word.length-i-1];
word[word.length-i-1]=temp;
}

return String.join(" ",word);
    }
}