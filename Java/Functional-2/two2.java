public List<Integer> two2(List<Integer> nums) {
  List<Integer>  newNums = new ArrayList<>();
  for(Integer i : nums) if((i * 2) % 10 != 2) newNums.add(i * 2);
  return newNums;
}
