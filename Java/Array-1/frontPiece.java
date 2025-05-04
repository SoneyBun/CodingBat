public int[] frontPiece(int[] nums) {
  int[] arr = new int[Math.min(nums.length, 2)];
  for(int i = 0; i < arr.length; i++) {
    arr[i] = nums[i];
  }
  return arr;
}
