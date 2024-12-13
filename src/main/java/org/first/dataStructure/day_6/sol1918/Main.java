package org.first.dataStructure.day_6.sol1918;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        var br = new BufferedReader(new InputStreamReader(System.in));
        String request = br.readLine();

        var ans = new StringBuilder();
        LinkedList<Character> stack = new LinkedList<>(); //스택: push pop peek peekFirst
                                                          //덱큐 add, poll, pollLast

        for (char s : request.toCharArray()) {
            if (Character.isLetter(s)) {
                ans.append(s);
            } else if (s == '(') {
                stack.push(s);
            } else if (s == '*' || s == '/') {
                while (!stack.isEmpty() && (stack.peek() == '*' || stack.peek() == '/')) {
                    ans.append(stack.pop());
                }
                stack.push(s);
            } else if (s == '-' || s == '+') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    ans.append(stack.pop());
                }
                stack.push(s);
            } else if (s == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    ans.append(stack.pop());
                }
                stack.pop();
            }
        }

        while (!stack.isEmpty()) {
            ans.append(stack.pop());
        }

        System.out.println(ans);
    }
}