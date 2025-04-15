public String front22(String str) {
  if(str.length() > 2) {
    String s = str.substring(0, 2);
    return s + str + s;
  } else {
    return str + str + str;
  }
}
