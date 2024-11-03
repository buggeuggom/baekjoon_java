package org.dataStructure.day_1.sol1439;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        String request = sc.nextLine();
        sc.close();

        char a = request.charAt(0);
        int cnt = 0;

        for(char s : request.toCharArray()){
            if (s != a){
                a = s;
                cnt += 1;
            }
        }

        System.out.println((cnt/2)+cnt%2);
    }
}
