class Solution {
    public int removeElement(int[] nums, int val) {
int j = 0;
int count = 0;
int n  = nums.length;
       for(int i = 0; i < nums.length; i++){
        if(nums[i] != val){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            j++;
        }
        else{
            count++;
        }
       } 
       return nums.length - count;
    }
}