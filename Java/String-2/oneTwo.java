public String oneTwo(String str) {
  String s = "";
  for(int i = 0; i < str.length() - 2; i += 3) {
    String g = str.substring(i, i + 3);
    s += g.substring(1, 3) + g.charAt(0);
  }
  return s;
}
