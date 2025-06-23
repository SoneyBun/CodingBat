public List<Integer> noTeen(List<Integer> nums) {
  List<Integer> newNums = new ArrayList<>();
  for(Integer i : nums) if(i < 13 || i > 19) newNums.add(i);
  return newNums;
}
