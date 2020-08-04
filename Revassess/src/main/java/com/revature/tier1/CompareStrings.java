package com.revature.tier1;

public class CompareStrings {

    public static boolean compareStrings(String s1, String s2){
    	int i = s1.compareTo(s2);
    	boolean eq = false;
    	if (i == 0) {
    		eq = true;
    	}
        return eq;
    }
}