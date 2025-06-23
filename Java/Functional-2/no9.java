public List<Integer> no9(List<Integer> nums) {
  List<Integer> newNums = new ArrayList<>();
  for(Integer i : nums) if(i % 10 != 9) newNums.add(i);
  return newNums;
}
