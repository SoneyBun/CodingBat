public String lastChars(String a, String b) {
  if(a.equals("")) {
    a = "@";
  }
  if(b.equals("")) {
    b = "@";
  }
  String n = a + b;
  return n.substring(0, 1) + n.substring(n.length() - 1);
}
