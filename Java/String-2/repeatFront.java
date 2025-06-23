public String repeatFront(String str, int n) {
  String s = "";
  for(int i = n; i >= 1; i--) s += str.substring(0, i);
  return s;
}
