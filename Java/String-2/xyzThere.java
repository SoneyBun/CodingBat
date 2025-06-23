public boolean xyzThere(String str) {
  for(int i = 0; i < str.length() - 3; i++) if(str.substring(i + 1, i + 4).equals("xyz") && str.charAt(i) != '.') return true;
  return str.equals("xyz") || str.substring(0, Math.min(str.length(), 3)).equals("xyz");
}
