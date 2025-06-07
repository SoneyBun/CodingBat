public int blueTicket(int a, int b, int c) {
  int ab = a + b, bc = b + c, ac = a + c;
  boolean equals10 = (ab == 10 || bc == 10 || ac == 10);
  boolean ab10More = (ab == 10 + bc || ab == 10 + ac);
  return (equals10) ? 10 : (ab10More) ? 5 : 0;
}
