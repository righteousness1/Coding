public boolean parrotTrouble(boolean talking, int hour) {
  if (talking && (hour < 7 || hour > 20)) {  //woke everyone up
    return true;
  }
  return false;
}
