public String deFront(String str) {    
  String n = str.charAt(0) == 'a' ? "a" : "";
  n += str.charAt(1) == 'b' ? "b" : "";
  return n + str.substring(2);
}
