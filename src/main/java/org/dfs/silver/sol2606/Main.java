package org.dfs.silver.sol2606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;

    static boolean[] check;
    static int[][] arr;
    static int count = 0;
    static int N, M;

    public static void main(String[] args) throws IOException {

        N = Integer.parseInt(br.readLine());
        arr = new int[N + 1][N + 1];
        check = new boolean[N + 1];

        M = Integer.parseInt(br.readLine());

        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr[a][b] = arr[b][a] = 1;
        }

        dfs(1);
        System.out.println(count - 1);

    }

    private static void dfs(int en) {
        check[en] = true;
        count++;

        for (int i = 0; i <= N; i++) {
            if (arr[en][i] == 1 && !check[i]) dfs(i);
        }
    }
}
