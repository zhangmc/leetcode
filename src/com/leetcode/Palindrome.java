package com.leetcode;

/**
 * Implement atoi to convert a string to an integer.
 * @author ZMC
 */
public class Palindrome {

	public static void main(String[] args) {
		Palindrome p = new Palindrome();
		boolean b = p.isPalindrome("A man, a plan, a canal: Panama");
		if(b) {
			System.out.println("this is a palindrome");
		} else {
			System.out.println("this isn't a palindrome");
		}
	}
	
	public boolean isPalindrome(String s) {
		String ss = s.toLowerCase().replaceAll("[\\p{Punct}\\p{Space}]+", "");
		int j = ss.length()-1;
        for(int i=0; i<ss.length(); i++,j--) {
        	char c = ss.charAt(i);
        	char rc = ss.charAt(j);
        	if(c != rc) {
        		return false;
        	}
        }
		return true;
    }
	
}
