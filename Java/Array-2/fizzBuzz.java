public String[] fizzBuzz(int start, int end) {
  String[] arr = new String[end - start];
  int count = 0;
  for(int i = start; i < end; i++) {
    if(i % 3 == 0 && i % 5 != 0) {
      arr[count] = "Fizz";
    } else if(i % 3 != 0 && i % 5 == 0) {
      arr[count] = "Buzz";
    } else if(i % 3 == 0 && i % 5 == 0) {
      arr[count] = "FizzBuzz";
    } else {
      arr[count] = i + "";
    }
    count++;
  }
  return arr;
}
