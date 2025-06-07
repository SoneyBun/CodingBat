public int caughtSpeeding(int speed, boolean isBirthday) {
  if(isBirthday) speed -= 5;
  return (speed > 81) ? 2 : (speed < 61) ? 0 : 1;
}
