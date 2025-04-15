public String extraFront(String str) {
  if(str.length() > 1) {
    String s = str.substring(0, 2);
    return s + s + s;
  } else {
    return str + str + str;
  }
}
