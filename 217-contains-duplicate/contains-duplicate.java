class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
      for(int i = 0; i < n; i++){
        if(map.isEmpty()){
            map.put(nums[i],1);
        }
        else if(map.containsKey(nums[i])){
            return true;
        }
        else{
             map.put(nums[i],1);
        }
      } 
      return false; 
    }
}