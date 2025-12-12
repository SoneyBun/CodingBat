def sum67(nums):
  dont_add = False
  sum = 0
  for i in nums:
    if i != 6 and not dont_add: sum += i
    else: dont_add = True
    if i == 7: dont_add = False
  return sum
