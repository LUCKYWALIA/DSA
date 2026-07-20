class Solution {
    public boolean containsDuplicate(int[] nums) {
     HashMap <Integer,Integer> m=new HashMap<>();

     for(int ele : nums){
m.put(ele,m.getOrDefault(ele,0)+1);
     }

     for(int x:m.keySet()){
if(m.get(x)>1) return true;
     }
return false;
    }
}