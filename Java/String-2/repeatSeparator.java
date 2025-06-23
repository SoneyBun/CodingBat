public String repeatSeparator(String word, String sep, int count) {
  String s = "";
  for(int i = 0; i < count; i++) {
    s += word;
    if(i + 1 != count) s += sep;
  }
  return s;
}
