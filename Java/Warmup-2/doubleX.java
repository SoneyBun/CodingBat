boolean doubleX(String str) {
  for(int i = 0; i < str.length(); i++) {
    if(str.charAt(i) == 'x' && i != str.length() - 1) {
      return str.charAt(i + 1) == 'x';
    }
  }
  return false;
}
