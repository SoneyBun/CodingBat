public int matchUp(int[] nums1, int[] nums2) {
  int count = 0;
  for(int i = 0; i < nums1.length; i++) {
    count += Math.abs(nums1[i] - nums2[i]) <= 2 && nums1[i] != nums2[i] ? 1 : 0;
  }
  return count;
}
