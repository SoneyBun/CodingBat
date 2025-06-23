public List<String> noLong(List<String> strings) {
  List<String> newStrings = new ArrayList<>();
  for(String s : strings) if(s.length() < 4) newStrings.add(s);
  return newStrings;
}
