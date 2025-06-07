public int redTicket(int a, int b, int c) {
  return (a + b + c) == 6 ? 10 : (a == b && a == c) ? 5 : (a != b && a != c) ? 1 : 0;
}
