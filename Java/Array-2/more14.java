public boolean more14(int[] nums) {
  int[] count = {0, 0};
  for(int i : nums) {
    if(i == 1) count[0]++;
    if(i == 4) count[1]++;
  }
  return count[0] > count[1];
}
