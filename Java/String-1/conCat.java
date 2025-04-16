public String conCat(String a, String b) {
  if(a.equals("") || b.equals("")) {
    return a + b;
  }
  if(a.charAt(a.length() - 1) == b.charAt(0)) {
    return a + b.substring(1);
  }
  return a + b;
}
