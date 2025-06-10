public boolean has12(int[] nums) {
  boolean hasOne = false;
  for(int i = 0; i < nums.length; i++) {
    if(nums[i] == 1) hasOne = true;
    if(hasOne) {
      if(nums[i] == 2) return true;
    }
  }
  return false;
}
