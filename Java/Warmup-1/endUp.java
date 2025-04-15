public String endUp(String str) {
  int l = str.length();
  if(l < 3) {
    return str.toUpperCase();
  } else {
    return str.substring(0, l - 3) + str.substring(l - 3).toUpperCase();
  }
}
