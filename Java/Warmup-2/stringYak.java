public String stringYak(String str) {
  String s = "";
  for(int i = 0; i < str.length(); i++) {
    if(i != str.length() - 2 && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') i += 2;
    else s += str.charAt(i);
  }
  return s;
}
