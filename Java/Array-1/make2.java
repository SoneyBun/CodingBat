public int[] make2(int[] a, int[] b) {
  int[] arr = new int[2];
  for(int i = 0; i < 2; i++) {
    if(i < a.length) {
      arr[i] = a[i];
    } else {
      arr[i] = b[Math.abs(a.length - i)];
    }
  }
  return arr;
}
