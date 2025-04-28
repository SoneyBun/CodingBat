public String stringSplosion(String str) {
  String s = "";
  for(int i = 1; i < str.length() + 1; i++) {
    s += str.substring(0, i);
  }
  return s;
}
