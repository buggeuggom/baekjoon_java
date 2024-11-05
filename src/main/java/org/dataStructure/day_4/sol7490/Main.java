package org.dataStructure.day_4.sol7490;

import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static List<String> results;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());

        StringBuilder output = new StringBuilder();

        for (int t = 0; t < testCases; t++) {
            N = Integer.parseInt(br.readLine());
            results = new ArrayList<>();
            backtrack(1, "1");
            for (String result : results) {
                output.append(result).append("\n");
            }
            if (t < testCases - 1) {
                output.append("\n");
            }
        }

        System.out.print(output);
    }

    private static void backtrack(int num, String expression) {
        if (num == N) {
            if (evaluate(expression) == 0) {
                results.add(expression);
            }
            return;
        }

        backtrack(num + 1, expression + " " + (num + 1));
        backtrack(num + 1, expression + "+" + (num + 1));
        backtrack(num + 1, expression + "-" + (num + 1));
    }

    private static int evaluate(String expression) {
        expression = expression.replace(" ", "");

        int sum = 0, currentNumber = 0;
        char operator = '+';

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (Character.isDigit(ch)) {
                currentNumber = currentNumber * 10 + (ch - '0');
            }

            if (!Character.isDigit(ch) || i == expression.length() - 1) {
                if (operator == '+') {
                    sum += currentNumber;
                } else if (operator == '-') {
                    sum -= currentNumber;
                }
                operator = ch;
                currentNumber = 0;
            }
        }

        return sum;
    }
}
