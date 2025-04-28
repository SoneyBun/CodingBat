public String stringX(String str) {
  if(str.length() == 0) {
    return "";
  }
  String s = str.substring(0, 1);
  for(int i = 1; i < str.length() - 1; i++) {
    s += (str.charAt(i) != 'x') ? str.charAt(i) : "";
  }
  if(str.length() > 1) {
    s += str.substring(str.length() - 1);
  }
  return s;
}
