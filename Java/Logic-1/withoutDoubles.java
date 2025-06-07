public int withoutDoubles(int die1, int die2, boolean noDoubles) {
  if(die1 == 6 && die2 == 6 && noDoubles) return 7;
  if(noDoubles) {
    return (die1 != die2) ? die1 + die2 : die1 + die2 + 1;
  }
  return die1 + die2;
}
