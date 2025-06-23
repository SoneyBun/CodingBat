public String mixString(String a, String b) {
  String result = "";
  int minLength = Math.min(a.length(), b.length());
  for (int i = 0; i < minLength; i++) {
    result += a.charAt(i);
    result += b.charAt(i);
  }
  if (a.length() > b.length()) result += a.substring(minLength);
  if (b.length() > a.length()) result += b.substring(minLength);
  return result;
}
