public String seeColor(String str) {
  str = (str.length() >= 3 && !(str.equals("blu"))) ? str.substring(0, 1) : "";
  return (str.equals("r")) ? "red" : (str.equals("b")) ? "blue" : "";
}
