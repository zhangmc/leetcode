package com.leetcode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 * @author ZMC
 */
public class StringToInteger {
	
	public static int atoi(String str) {
		int result = 0;
        String ss = str.trim();
		StringBuffer sb = new StringBuffer(0);
		Pattern pattern = Pattern.compile("\\d");
		Matcher matcher = pattern.matcher(str);
		if(matcher.find()) {
			for(int i=0; i<ss.length(); i++) {
				char c = ss.charAt(i);
				if(i==0 && (c=='+' || c=='-')) {
					sb.append(c);
				} else if(i==1 && (c=='+' || c=='-')) {
					return 0;
				} else if(Character.isDigit(c)) {
					sb.append(c);
				} else if(Character.isSpaceChar(c)) {
					break;
				} else {
					break;
				}
			}
		} else {
			return result;
		}
		if("".equals(sb.toString())) {
			return result;
		}
		try {
			result = Integer.parseInt(sb.toString());
		} catch(NumberFormatException e) {
			if(sb.length()==1) {
				return 0;
			} else if("-".equals(sb.substring(0, 1))) {
				result = Integer.MIN_VALUE;
			} else {
				result = Integer.MAX_VALUE;
			}
		}
		return result;
    }

	public static void main(String[] args) {
		int i = StringToInteger.atoi("  +  413");
		System.out.println(i);
	}
	
}
