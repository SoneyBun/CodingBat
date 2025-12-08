def string_bits(str):
  s = ""
  for c in range(0, len(str), 2):
    s += str[c]
  return s
