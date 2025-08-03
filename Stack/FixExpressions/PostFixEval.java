package FixExpressions;

import java.util.Scanner;
import java.util.Stack;

public class PostFixEval {
    public static void main(String[] args) {
        String postfix = "3528-*+";
        int result = PostVal(postfix);
        System.out.println("Postfix Evaluation Result: " + result);
    }

    static int PostVal(String s) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                int chrr = ch - '0';  // Convert char digit to integer
                stack.push(chrr);
            } else if (isOperator(ch)) {
                int b = stack.pop();
                int a = stack.pop();

                int res = applyOp(a, b, ch);
                stack.push(res);
            }
        }

        return stack.pop();
    }

    private static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    private static int applyOp(int a, int b, char op) {
        return switch (op) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            default -> 0;
        };
    }
}
