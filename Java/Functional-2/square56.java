public List<Integer> square56(List<Integer> nums) {
  List<Integer> newNums = new ArrayList<>();
  for(Integer i : nums) if((i * i + 10) % 10 != 5 && (i * i + 10) % 10 != 6) newNums.add(i * i + 10);
  return newNums;
}
