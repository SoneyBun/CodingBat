public String altPairs(String str) {
  String s = "";
  for(int i = 0; i < str.length(); i++) {
    s += str.charAt(i);
    if (i % 2 != 0) i += 2;
  }
  return s;
}
