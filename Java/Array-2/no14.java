public boolean no14(int[] nums) {
  boolean has1 = false, has4 = false;
  for(int i : nums) {
    if(i == 1) {
      has1 = true;
    }
    if(i == 4) {
      has4 = true;
    }
  }
  return !(has1 && has4);
}
