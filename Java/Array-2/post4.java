public int[] post4(int[] nums) {
  ArrayList<Integer> arl = new ArrayList<Integer>();
  for(int i : nums) {
    arl.add(i);
    if(i == 4) {
      arl.clear();
    }
  }
  int[] arr = new int[arl.size()];
  for(int i = 0; i < arr.length; i++) {
    arr[i] = arl.get(i);
  }
  return arr;
}
