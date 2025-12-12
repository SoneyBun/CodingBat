def centered_average(nums):
  min_num = nums[0]
  max_num = nums[0]
  sum = 0
  for i in nums:
    min_num = min(min_num, i)
    max_num = max(max_num, i)
    sum += i
  sum -= (min_num + max_num)
  return (sum / (len(nums) - 2))
