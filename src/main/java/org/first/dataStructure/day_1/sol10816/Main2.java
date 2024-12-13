package org.first.dataStructure.day_1.sol10816;

import java.io.*;
import java.util.*;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine().trim());
        int[] Ns = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            Ns[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine().trim());
        int[] Ms = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            Ms[i] = Integer.parseInt(st.nextToken());
        }

        Map<Integer, Integer> ans = new HashMap<>();
        for (int m : Ms) {
            ans.put(m, 0);
        }

        for (int n : Ns) {
            if (ans.containsKey(n)) {
                ans.put(n, ans.get(n) + 1);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int m : Ms) {
            sb.append(ans.get(m)).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}
