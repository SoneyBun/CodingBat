public int countEvens(int[] nums) {
  int count = 0;
  for(int i : nums) {
    count += i % 2 == 0 ? 1 : 0;
  }
  return count;
}
