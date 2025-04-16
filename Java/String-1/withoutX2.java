public String withoutX2(String str) {
  switch(str.length()) {
    case 0 : return "";
    case 1 : return (str.equals("x")) ? "" : str;
  }
  String n = str.charAt(0) == 'x' ? "" : str.charAt(0) + "";
  n += str.charAt(1) == 'x' ? "" : str.charAt(1) + "";
  return n + str.substring(2);
}
