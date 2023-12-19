package com.phenom.trainee3;

import java.util.Map;
import java.util.HashMap;

public class LongestSubstring {
	public static void main(String[] args) {
        String input = "abcabcbb";
        int length = longestSubstringLength(input);
        System.out.println("Length of the longest substring: " + length);
    }

    static int longestSubstringLength(String s) {
        Map<Character, Integer> charIndexMap = new HashMap<>();
        int maxLength = 0;
        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            if (charIndexMap.containsKey(s.charAt(end))) {
                start = Math.max(charIndexMap.get(s.charAt(end)) + 1, start);
            }
            maxLength = Math.max(maxLength, end - start + 1);
            charIndexMap.put(s.charAt(end), end);
        }

        return maxLength;
    }

}
