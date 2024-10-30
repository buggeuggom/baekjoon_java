package org.dataStructure.sol9012;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        var sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < T; i++) {
            String now = sc.nextLine();
            System.out.println(sol(now));
        }

        sc.close();
    }

    public static String sol(String now) {
        int tmp = 0;

        for (char ec : now.toCharArray()) {
            if (ec == '(') {
                tmp += 1;
            } else {
                tmp -= 1;
            }

            if (tmp < 0){
                return "NO";
            }
        }
        return (tmp == 0)? "YES": "NO";
    }
}
