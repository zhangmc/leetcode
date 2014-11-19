package com.leetcode;

/**
 * Given an input string, reverse the string word by word.
 * @author ZMC
 */
public class ReverseWords {

	public String reverseWords(String s) {
		String[] ss = s.split("\\s+");
        StringBuffer sb = new StringBuffer();
        for(int i=ss.length-1; i>=0; i--) {
        	sb.append(ss[i]).append(" ");
        }
        return sb.toString().trim();
    }
	
	public static void main(String[] args) {
		ReverseWords rw = new ReverseWords();
		String s = rw.reverseWords(" t he sky is blue ");
		System.out.println(s);
	}
	
}
