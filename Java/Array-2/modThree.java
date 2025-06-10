public boolean modThree(int[] nums) {
  for(int i = 0; i < nums.length - 2; i++) {
    if(isEven(nums[i]) && isEven(nums[i + 1]) && isEven(nums[i + 2])) {
      return true;
    } else if(isOdd(nums[i]) && isOdd(nums[i + 1]) && isOdd(nums[i + 2])) {
      return true;
    }
  }
  return false;
}

public boolean isEven(int n) {
  return n % 2 == 0;
}

public boolean isOdd(int n) {
  return n % 2 != 0;
}
