public String lastTwo(String str) {
  switch(str.length()) {
    case 0 : return "";
    case 1 : return str;
    case 2 : return str.substring(1) + str.substring(0, 1);
    default :
      char l = str.charAt(str.length() - 1), bL = str.charAt(str.length() - 2);
      return str.substring(0, str.length() - 2) + l + bL;
  }
}
