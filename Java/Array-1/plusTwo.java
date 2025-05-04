public int[] plusTwo(int[] a, int[] b) {
  int[] arr = new int[4];
  for(int i = 0; i < 4; i++) {
    if(i < 2) {
      arr[i] = a[i];
    } else {
      arr[i] = b[i - 2];
    }
  }
  return arr;
}
