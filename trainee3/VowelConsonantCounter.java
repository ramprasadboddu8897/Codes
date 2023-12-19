package com.phenom.trainee3;

public class VowelConsonantCounter {
	public static void main(String[] args) {
        String input = "Hello, World!";
        countVowelsAndConsonants(input.toLowerCase());
    }

    static void countVowelsAndConsonants(String str) {
        int vowels = 0, consonants = 0;

        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
