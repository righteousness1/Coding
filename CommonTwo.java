public int commonTwo(String[] a, String[] b) {
	int count = 0;
	int i = 0;
	int j = 0;
	while ( i < a.length && j < b.length ) {
		if ( a[i].equals(b[j]) ) {
			count++;
			do {
				i++;
			} while ( i < a.length && a[i].charAt(0) == a[i-1].charAt(0) );
			do {
				j++;
			} while ( j < b.length && b[j].charAt(0) == b[j-1].charAt(0));
		} else if ( a[i].charAt(0) > ( b[j].charAt(0) ) ) {
			j++;
		} else {
			i++;
		}
	}
	return count;
}
