class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int[] result = new int[n];
        for(int i = 0; i < nums.length; i++){
if(nums[left] * nums[left] > nums[right] * nums[right]){
result[n-i-1] = nums[left] * nums[left];
left++;
}else{
    result[n-i-1] = nums[right] * nums[right];
right--;
}
        }
        return result;
    }
}