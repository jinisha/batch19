package com.jrout.tutorial.core.recursion;

public class Factorial {
	int fact(int num) {
		int result;
		if (num == 1)
			return 1;

		int tempVal = fact(num - 1);
		result = tempVal * num;
		return result;
	}
}
