package com.phenom.trainee3;

import java.util.Arrays;

public class AnagramChecker {
	public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        boolean areAnagrams = checkAnagrams(str1, str2);
        System.out.println("Are anagrams: " + areAnagrams);
    }

    static boolean checkAnagrams(String str1, String str2) {
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }
}
