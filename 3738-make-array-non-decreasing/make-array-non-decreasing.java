class Solution {
    public int maximumPossibleSize(int[] nums) {
       Stack<Integer> s = new Stack<>();
       for(int i = 0; i < nums.length; i++){
        if(s.isEmpty()){
            s.push(nums[i]);
        }
        else if(nums[i] >= s.peek()){
s.push(nums[i]);
        }
       
       } 
       return s.size();
    }
}