public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
  if (aSmile && bSmile) {    //harm
    return true;
  }
  if (!aSmile && !bSmile) {  //quarreled
    return true;
  }
  return false;
}
