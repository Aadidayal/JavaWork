package FixExpressions;

import java.util.Stack;

public class InfixEvalu {
    public static void main(String[] args) {
        String s = "3 + 5 * (2 - 8)";
        Stack<Integer> values = new Stack<>();
        Stack<Character> ops = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isWhitespace(ch)) continue;

            if (Character.isDigit(ch)) {
                int num = 0;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    num =(s.charAt(i) - '0');
                    i++;
                }
                 i--; // step back after the loop
                values.push(num);
            }
            else if (ch == '(') {
                ops.push(ch);
            } 
            else if (ch == ')') {
                while (!ops.isEmpty() && ops.peek() != '(') {
                    char op = ops.pop();
                    int b = values.pop();
                    int a = values.pop();
                    values.push(applyOp(a, b, op));
                }
                ops.pop(); // remove '('
            }  
            else if (isOperator(ch)) {
                while (!ops.isEmpty() && precedence(ops.peek()) >= precedence(ch)) {
                    char op = ops.pop();
                    int b = values.pop();
                    int a = values.pop();
                    values.push(applyOp(a, b, op));
                }
                ops.push(ch);
            }
        }

        while (!ops.isEmpty()) {
            char op = ops.pop();
            int b = values.pop();
            int a = values.pop();
            values.push(applyOp(a, b, op));
        }

        System.out.println("Result: " + values.pop());
    }

    private static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    private static int precedence(char op) {
        if (op == '+' || op == '-') return 1;
        if (op == '*' || op == '/') return 2;
        return 0;
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
