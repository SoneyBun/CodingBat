public boolean endOther(String a, String b) {
  int aLen = a.length(), bLen = b.length();
  if(aLen > bLen) return a.substring(aLen - bLen).equalsIgnoreCase(b);
  if(bLen > aLen) return b.substring(bLen - aLen).equalsIgnoreCase(a);
  return a.equalsIgnoreCase(b);
}
