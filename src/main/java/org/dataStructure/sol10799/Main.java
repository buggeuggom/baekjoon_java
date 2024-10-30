package org.dataStructure.sol10799;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        String s = sc.nextLine();
        int ans = 0;

        int length = s.length();
        int tmp = 0;

        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == '(') {
                tmp += 1;
            } else {
                tmp -= 1;
                ans += (s.charAt(i - 1) == '(') ? tmp : 1;
            }
        }
        System.out.println(ans);
    }
}
