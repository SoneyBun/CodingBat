public String doubleChar(String str) {
  String n = "";
  for(int i = 0; i < str.length(); i++) n += "" + str.charAt(i) + str.charAt(i);
  return n;
}
