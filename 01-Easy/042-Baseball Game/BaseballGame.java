package com.study.com;

import java.util.Stack;

public class BaseballGame {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for (String op : operations) {
            if (op.equals("C")) {
                // Invalidate previous score
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (op.equals("D")) {
                // Double the previous score
                if (!stack.isEmpty()) {
                    stack.push(2 * stack.peek());
                }
            } else if (op.equals("+")) {
                // Sum of last two scores
                if (stack.size() >= 2) {
                    int top = stack.pop();
                    int secondTop = stack.peek();
                    int sum = top + secondTop;
                    stack.push(top); // Push back the popped element
                    stack.push(sum);
                }
            } else {
                // It's an integer, parse and add
                stack.push(Integer.parseInt(op));
            }
        }

        // Sum all values in the stack
        int total = 0;
        for (int score : stack) {
            total += score;
        }

        return total;
    }

    // Sample test
    public static void main(String[] args) {
        BaseballGame game = new BaseballGame();

        String[] ops1 = {"5", "2", "C", "D", "+"};
        System.out.println(game.calPoints(ops1)); // Output: 30

        String[] ops2 = {"5", "-2", "4", "C", "D", "9", "+", "+"};
        System.out.println(game.calPoints(ops2)); // Output: 27

        String[] ops3 = {"1", "C"};
        System.out.println(game.calPoints(ops3)); // Output: 0
    }
}
