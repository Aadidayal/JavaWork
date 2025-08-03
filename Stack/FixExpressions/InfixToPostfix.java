package FixExpressions;

import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix {

    // Get operator precedence
    static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-' : return 1;
            case '*':
            case '/' : return 2;
            case '^' : return 3;
            default  : return -1;
        }
    }

    // Convert infix to postfix
    public static String infixToPostfix(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                result.append(ch); // Add operands to result
            } else if (ch == '(') {
                stack.push(ch); // Push '(' to stack
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop()); // Pop until '(' is found
                }
                stack.pop(); // Pop '(' from stack
            } else { // Operator
                while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())) {
                    // Special case: right-associative '^' should not pop same precedence
                    if (ch == '^' && stack.peek() == '^') break;
                    result.append(stack.pop());
                }
                stack.push(ch); // Push the operator to stack
            }
        }

        // Pop remaining operators from the stack
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter infix expression: ");
        String str = input.nextLine().replaceAll("\\s+", ""); // Remove any spaces

        String postfix = infixToPostfix(str);
        System.out.println("Postfix: " + postfix);
    }
}
