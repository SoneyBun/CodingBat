public boolean xyzMiddle(String str) {
  int len = str.length();
  for(int i = 0; i < len - 2; i++) if((Math.abs(i - (len - (i + 3))) <= 1) && str.substring(i, i + 3).equals("xyz")) return true;
  return false;
}
