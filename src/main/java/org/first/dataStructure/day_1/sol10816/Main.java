package org.first.dataStructure.day_1.sol10816;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int N = sc.nextInt();
        var Ns = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < N; i++){
            var a = sc.nextInt();
            Integer now = Ns.getOrDefault(a, 0) + 1;
            Ns.put(a, now);
        }


        int M = sc.nextInt();

        for(int i = 0; i < M; i++){
            System.out.print(Ns.getOrDefault(sc.nextInt(), 0));
            System.out.print(" ");
        }

        sc.close();
    }
}
