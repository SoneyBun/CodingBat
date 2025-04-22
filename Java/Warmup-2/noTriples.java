public boolean noTriples(int[] nums) {
  for(int i = 0; i < nums.length - 2; i++) {
    if (nums[i] == 1 && nums[i + 1] == 1 && nums[i + 2] == 1) return false;
    if (nums[i] == 2 && nums[i + 1] == 2 && nums[i + 2] == 2) return false;
  }
  return true;
}
