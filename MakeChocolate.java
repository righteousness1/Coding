public int makeChocolate(int small, int big, int goal) {
	if ( small + big * 5 >= goal && goal % 5 <= small ) {
		return  ( big * 5 >= goal ) ? goal % 5 : goal - big * 5;
	} else {
		return -1;
	}
}
