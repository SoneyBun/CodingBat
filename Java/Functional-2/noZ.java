public List<String> noZ(List<String> strings) {
  List<String> newStrings = new ArrayList<>();
  for(String s : strings) if(s.indexOf("z") == -1) newStrings.add(s);
  return newStrings;
}
