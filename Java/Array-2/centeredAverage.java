public int centeredAverage(int[] nums) {
  int large = nums[0];
  int small = nums[0];
  int sum = 0;
  for(int i : nums) {
    if(large < i) large = i;
    if(small > i) small = i;
    sum += i;
  }
  return (sum - large - small) / (nums.length - 2);
}
