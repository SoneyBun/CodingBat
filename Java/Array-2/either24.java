public boolean either24(int[] nums) {
  boolean[] compare = {false, false};
  for(int i = 0; i < nums.length - 1; i++) {
    if(nums[i] == 2 && nums[i + 1] == 2) compare[0] = true;
    if(nums[i] == 4 && nums[i + 1] == 4) compare[1] = true;
  }
  return compare[0] ^ compare[1];
}
