public int greenTicket(int a, int b, int c) {
  return (a != b && a != c && b != c) ? 0 : (a == b && a == c) ? 20 : (a == b || a == c || b == c) ? 10 : -1;
}
