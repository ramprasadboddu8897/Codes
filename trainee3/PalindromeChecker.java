package com.phenom.trainee3;

public class PalindromeChecker {
	public static void main(String[] args) {
        String str = "radar";
        boolean isPalindrome = checkPalindrome(str);
        System.out.println("Is palindrome: " + isPalindrome);
    }

    static boolean checkPalindrome(String str) {
        StringBuilder reversed = new StringBuilder(str).reverse();
        return str.equals(reversed.toString());
    }
}
