public String startOz(String str) {
  if(str.length() == 1) {
    return (str.charAt(0) == 'o') ? "o" : "";
  } else if(str.isEmpty()) {
    return "";
  }
  String s = str.substring(0, 2);
  String n = "";
  if(s.charAt(0) == 'o') {
    n += "o";
  }
  if(s.charAt(1) == 'z') {
    n += "z";
  }
  return n;
}
