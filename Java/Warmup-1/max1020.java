public int max1020(int a, int b) {
  int max = Math.max(a, b);
  int min = Math.min(a, b);
  return (max > 9 && max < 21) ? max : (min > 9 && min < 21) ? min : 0;
}
