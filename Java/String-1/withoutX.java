public String withoutX(String str) {
  if(str.length() < 2) {
    return str.equals("x") ? "" : str;
  }
  str = (str.charAt(0) == 'x') ? str.substring(1) : str;
  str = (str.charAt(str.length() - 1) == 'x') ? str.substring(0, str.length() - 1) : str;
  return str;
}
