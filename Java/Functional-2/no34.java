public List<String> no34(List<String> strings) {
  List<String> newStrings = new ArrayList<String>();
  for(String s : strings) if(s.length() != 3 && s.length() != 4) newStrings.add(s);
  return newStrings;
}
