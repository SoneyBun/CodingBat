public List<String> noX(List<String> strings) {
  String n = "";
  for(int i = 0; i < strings.size(); i++) {
    for(int f = 0; f < strings.get(i).length(); f++) {
      if(strings.get(i).charAt(f) != 'x') {
        n += strings.get(i).charAt(f) + "";
      }
    }
    strings.set(i, n);
    n = "";
  }
  return strings;
}
