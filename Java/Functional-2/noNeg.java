public List<Integer> noNeg(List<Integer> nums) {
  List<Integer> newNums = new ArrayList<>();
  for(Integer i : nums) if(i >= 0) newNums.add(i);
  return newNums;
}
