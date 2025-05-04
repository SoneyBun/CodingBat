public boolean unlucky1(int[] nums) {
  for(int i = 0; i < nums.length-1; i++) {
    if(nums[i] == 1 && nums[i + 1] == 3) {
      if(i >= nums.length-2 || i <= 1) {
        return true;
      }
    }
  }
  return false;
}
