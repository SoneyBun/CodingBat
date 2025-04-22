public int last2(String str) {
  if (str.length() < 2) return 0;
  
  String l2 = str.substring(str.length() - 2);
  int count = 0;
  
  for(int i = 0; i < str.length() - 2; i++) {
    String sub = str.substring(i, i + 2);
    if(l2.equals(sub)) {
      count++;
    }
  }
  return count;
}
