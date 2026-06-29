class Solution {
    public int removeDuplicates(int[] nums) {
        
TreeSet<Integer> s =new TreeSet<>();

for(int i=0;i<nums.length;i++){
s.add(nums[i]);
}

int i=0;

for(int num:s){
nums[i]=num;
i++;
}


return s.size();
    }
}