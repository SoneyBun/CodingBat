public int[] zeroMax(int[] nums) {
  for(int i = 0; i < nums.length; i++) {
    if(nums[i] == 0) {
      int largest = nums[i];
      for(int f = i; f < nums.length; f++) {
        if(nums[f] % 2 == 1 && nums[f] > largest) {
          largest = nums[f];
        }
      }
      nums[i] = largest;
    }
  }
  return nums;
}
