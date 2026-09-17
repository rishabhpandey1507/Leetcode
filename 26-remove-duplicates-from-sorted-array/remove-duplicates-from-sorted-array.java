class Solution {
    public int removeDuplicates(int[] nums) {
int j = 0;
int count = 0;
int n = nums.length;
if(n == 0){
    return 0;
}
      for(int i = 1; i < n; i++){
        
        if(nums[i] != nums[j]){
            nums[j+1] = nums[i];
j++;
        }
      }
return j+1;
    }
}