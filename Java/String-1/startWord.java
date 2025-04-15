public String startWord(String str, String word) {
  int len = word.length();
  if (str.length() >= len) {
    if (str.substring(1, len).equals(word.substring(1)) || len == 1) {
      return str.substring(0, len);
    }
  }
  return "";
}
