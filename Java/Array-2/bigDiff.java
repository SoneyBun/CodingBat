public int bigDiff(int[] nums) {
  int large = nums[0];
  int small = nums[0];
  for(int i : nums) {
    large = Math.max(large, i);
    small = Math.min(small, i);
  }
  return large - small;
}
