public boolean haveThree(int[] nums) {
  int count = 0;
  for(int i = 0; i < nums.length - 1; i++) {
    if(nums[i] == 3 && nums[i + 1] == 3) return false;
    if(nums[i] == 3) count++;
  }
  if(nums.length > 2) count += (nums[nums.length - 1] == 3 && nums[nums.length - 2] != 3) ? 1 : 0;
  return count == 3;
}
