public int teaParty(int tea, int candy) {
  boolean good = tea >= 5 && candy >= 5;
  if(good && (tea >= candy * 2 || candy >= tea * 2)) return 2;
  if(good) return 1;
  return 0;
}
