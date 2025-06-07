public boolean in1To10(int n, boolean outsideMode) {
  return (!outsideMode) ? (n >= 1 && n < 11) : (n <= 1 || n >= 10);
}
