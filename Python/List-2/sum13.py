def sum13(nums):
  sum = 0
  for i in range(len(nums)):
    if (i > 0 and nums[i - 1] == 13) or nums[i] == 13: continue
    sum += nums[i]
  return sum
