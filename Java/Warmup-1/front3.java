public String front3(String str) {
  if(str.length() < 3) {
    return str + str + str;
  } else {
    String s = str.substring(0, 3);
    return s + s + s;
  }
}
