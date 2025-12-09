def cat_dog(str):
  count = 0
  for i in range(len(str)):
    if str[i:i+3] == "cat": count += 1
    if str[i:i+3] == "dog": count -= 1
  return (count == 0)
