package com.leetcode;

/**
 * Reverse digits of an integer.
 * @author ZMC
 */
public class ReverseInteger {

	public class Solution {
	    public int reverse(int x) {
			if (x > Integer.MAX_VALUE || x < Integer.MIN_VALUE) {
				return 0;
			}
			boolean flag = true;
			if(x < 0) {
				x = -x;
				flag = false;
			}
			StringBuffer sb = new StringBuffer(String.valueOf(x));
			String str = sb.reverse().toString();
			int num = 0;
			try {
				num = Integer.parseInt(str);
			} catch (NumberFormatException nfe) {
				return num;
			}
			int result = num;
			if (!flag) {
				result = -num;
			}
			return result;
	    }
	}

}
