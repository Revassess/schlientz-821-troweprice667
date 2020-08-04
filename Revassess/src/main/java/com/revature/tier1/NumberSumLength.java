package com.revature.tier1;

public class NumberSumLength {

	public static boolean checkNumberPowerLength(long num) {
		boolean eq = false;
		long fin = 0;
		String n = Long.toString(num);
		for (int i = 0; i < n.length(); i++) {
			char c = n.charAt(i);
			int j = Character.getNumericValue(c);
			long pw = (long) Math.pow(j, n.length());
			fin = fin + pw;
		}
		if(fin == num) {
			eq = true;
		}
		return eq;
	}
}
