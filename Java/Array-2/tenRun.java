public int[] tenRun(int[] nums) {
  Integer multiple = null;
  for(int i = 0; i < nums.length; i++) {
    if(nums[i] % 10 == 0) multiple = nums[i];
    else if(multiple != null) nums[i] = multiple;
  }
  return nums;
}
