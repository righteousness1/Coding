public boolean makeBricks(int small, int big, int goal) {
  return ( small >= goal % 5 ) && ( small + big * 5 >= goal );
}
