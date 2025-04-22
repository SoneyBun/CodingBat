public String stringBits(String str) {
  String s = "";
  for(int i = 0; i < str.length(); i += 2) {
    s += str.charAt(i);
  }
  return s;
}
