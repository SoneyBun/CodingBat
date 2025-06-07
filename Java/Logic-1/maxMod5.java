public int maxMod5(int a, int b) {
  return (a != b) ? (a % 5 != b % 5) ? Math.max(a, b) : Math.min(a, b) : 0;
}
