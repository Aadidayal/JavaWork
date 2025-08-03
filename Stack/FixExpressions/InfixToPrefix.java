package FixExpressions;

import java.util.Stack;
import java.util.Scanner;

public class InfixToPrefix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter infix expression: ");
        String infix = sc.nextLine().replaceAll("\\s+", "");  // Remove any whitespace

        String prefix = infixToPrefix(infix);
        System.out.println("Prefix: " + prefix);
    }

    static int precedence(char ch) {
        return switch (ch) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            case '^' -> 3;
            default -> -1;
        };
    }

    static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^';
    }

    static String reverseBrackets(String expr) {
        StringBuilder rev = new StringBuilder();
        for (int i = expr.length() - 1; i >= 0; i--) {  // Reversing string and swapping parentheses
            char ch = expr.charAt(i);
            if (ch == '(') rev.append(')');
            else if (ch == ')') rev.append('(');
            else rev.append(ch);
        }
        return rev.toString();
    }

    static String infixToPostfix(String expr) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expr.length(); i++) {
            char ch = expr.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                result.append(ch);
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                if (!stack.isEmpty()) stack.pop(); // pop '('
            } else if (isOperator(ch)) {
                while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek()) && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    static String infixToPrefix(String expr) {
        // Step 1: Reverse and swap brackets
        String reversed = reverseBrackets(expr);

        // Step 2: Convert to postfix from the reversed expression
        String postfix = infixToPostfix(reversed);

        // Step 3: Reverse the postfix result to get the final prefix expression
        return new StringBuilder(postfix).reverse().toString();
    }
}
