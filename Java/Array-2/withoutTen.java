public int[] withoutTen(int[] nums) {
  int[] arr = new int[nums.length];
  int index = 0;
  for(int i : nums) {
    if(i != 10) {
      arr[index] = i;
      index++;
    }
  }
  return arr;
}
