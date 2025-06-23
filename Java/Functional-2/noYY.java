public List<String> noYY(List<String> strings) {
  List<String> newStrings = new ArrayList<>();
  for(String s : strings) {
    if(!s.isEmpty() && s.charAt(s.length() - 1) != 'y' && s.indexOf("yy") == -1) newStrings.add(s + "y");
    else if(s.isEmpty()) newStrings.add("y");
  }
  return newStrings;
}
