public int[] pre4(int[] nums) {
  int count = 0;
  for(int i : nums) {
    if(i != 4) count++;
    else break;
  }
  int[] arr = new int[count];
  for(int i = 0; i < arr.length; i++) {
    arr[i] = nums[i];
  }
  return arr;
}
