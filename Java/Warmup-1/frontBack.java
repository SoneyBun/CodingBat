public String frontBack(String str) {
  return (str.length() <= 1) ? str : str.substring(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);
}
