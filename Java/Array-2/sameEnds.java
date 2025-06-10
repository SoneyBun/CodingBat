public boolean sameEnds(int[] nums, int len) {
  String s = "";
  for(int i = 0; i < nums.length; i++) {
    s += nums[i];
  }
  return s.substring(0, len).equals(s.substring(s.length() - len));
}
