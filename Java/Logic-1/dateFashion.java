public int dateFashion(int you, int date) {
  boolean above8 = you >= 8 || date >= 8;
  boolean less2Exception = you <= 2 || date <= 2;
  return (above8 && !less2Exception) ? 2 : (less2Exception) ? 0 : 1;
}
