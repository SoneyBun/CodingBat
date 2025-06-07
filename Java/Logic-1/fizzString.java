public String fizzString(String str) {
  String s = "";
  if(str.charAt(0) == 'f') s += "Fizz";
  if(str.charAt(str.length() - 1) == 'b') s += "Buzz";
  return (!s.isEmpty()) ? s : str;
}
