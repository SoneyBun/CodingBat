def big_diff(nums):
  min_num = nums[0]
  max_num = nums[0]
  for i in nums:
    min_num = min(min_num, i)
    max_num = max(max_num, i)
  return max_num - min_num
