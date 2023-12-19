package com.phenom.trainee3;

public class StringCompression {
    public static void main(String[] args) {
        String input = "aabbbcccdd";
        String compressed = compressString(input);
        System.out.println("Compressed string: " + compressed);
    }

    static String compressString(String str) {
        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                compressed.append(str.charAt(i)).append(count);
                count = 1;
            }
        }

        // Append the last character and its count
        compressed.append(str.charAt(str.length() - 1)).append(count);

        return compressed.toString();
    }
}

