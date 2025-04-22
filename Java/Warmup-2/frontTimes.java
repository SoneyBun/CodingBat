public String frontTimes(String str, int n) {
  int max = (str.length() < 3) ? str.length() : 3;
  String s = "";
  for(int i = 0; i < n; i++) {
    s += str.substring(0, max);
  }
  return s;
}
