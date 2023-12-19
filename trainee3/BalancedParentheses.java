package com.phenom.trainee3;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancedParentheses {

    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> bracketPairs = createBracketPairsMap();

        for (char ch : expression.toCharArray()) {
            if (isOpeningBracket(ch)) {
                stack.push(ch);
            } 
            // Check if the current character is a closing bracket
            else if (isClosingBracket(ch)) {
                // Ensure there is a corresponding opening bracket on the stack
                // and that the brackets are properly matched
                if (stack.isEmpty() || stack.pop() != bracketPairs.get(ch)) {
                    // If the stack is empty or brackets do not match, the expression is unbalanced
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean isOpeningBracket(char ch) {
        return ch == '(' || ch == '[' || ch == '{';
    }

    private static boolean isClosingBracket(char ch) {
        return ch == ')' || ch == ']' || ch == '}';
    }

    private static Map<Character, Character> createBracketPairsMap() {
        Map<Character, Character> bracketPairs = new HashMap<>();
        bracketPairs.put(')', '(');
        bracketPairs.put(']', '[');
        bracketPairs.put('}', '{');
//        bracketPairs.put('(', ')');
//        bracketPairs.put('[', ']');
//        bracketPairs.put('{', '}');
        return bracketPairs;
    }

    public static void main(String[] args) {
        String balancedExpression = "{([])}";
        String unbalancedExpression = "({[})";

        System.out.println(isBalanced(balancedExpression));   // Output: true
        System.out.println(isBalanced(unbalancedExpression)); // Output: false
    }
}

