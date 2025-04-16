public List<Integer> square(List<Integer> nums) {
  for(int i = 0; i < nums.size(); i++) {
    nums.set(i, (int) Math.pow(nums.get(i), 2));
  }
  
  return nums;
}
